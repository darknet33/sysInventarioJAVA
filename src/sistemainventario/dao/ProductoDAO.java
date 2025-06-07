package sistemainventario.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemainventario.model.Categoria;
import sistemainventario.model.Producto;
import sistemainventario.model.Usuario;
import sistemainventario.util.Mensajes;


public class ProductoDAO implements IDAO<Producto, Integer>{
    private final Connection conn;
    private final CategoriaDAO categoriaDAO=new CategoriaDAO();
    private final UsuarioDAO usuarioDAO=new UsuarioDAO();
    
    public ProductoDAO() {
        this.conn = ConexionDAO.getConexion();
    }
    
    @Override
    public Producto mapResultSetToEntity(ResultSet rs) throws SQLException {
        Producto entity = new Producto();
        entity.setId(rs.getInt("id_entity"));
        entity.setCodigo(rs.getString("codigo_entity"));
        entity.setDescripcion(rs.getString("descripcion_entity"));
        entity.setMarca(rs.getString("marca_entity"));
        entity.setProcedencia(rs.getString("procedencia_entity"));
        entity.setPeso(rs.getString("peso_entity"));
        entity.setStockInicial(rs.getInt("stock_inicial_entity"));
        entity.setStockActual(rs.getInt("stock_actual_entity"));
        entity.setStockMinimo(rs.getInt("stock_minimo_entity"));
        entity.setFechaRegistro(rs.getTimestamp("f_registro_entity"));
        entity.setFechaActualizado(rs.getTimestamp("f_actualizado_entity"));
        entity.setEstado(rs.getBoolean("estado_entity"));
        
        Categoria categoria=categoriaDAO.getById(rs.getInt("categoria_id"));        
        entity.setCategoria(categoria);
        
        Usuario usuario=usuarioDAO.getById(rs.getInt("usuario_id"));
        entity.setUsuario(usuario);

        return entity;
    } 
    

    @Override
    public Producto getById(Integer id) {
        String sql= "SELECT * FROM entitys WHERE id_entity = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            if (rs.next()) {
                return mapResultSetToEntity(rs);
            }
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
        return null;
    }

    @Override
    public List<Producto> getAll() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM entitys";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(mapResultSetToEntity(rs));
            }
            
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }

        return lista;
    }

    @Override
    public void save(Producto entity) {
        String sql = "INSERT INTO entitys (codigo_entity, categoria_id, descripcion_entity, marca_entity, procedencia_entity, peso_entity, stock_inicial_entity, stock_actual_entity, stock_minimo_entity,estado_entity,usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getCodigo());
            stmt.setInt(2, entity.getCategoria().getId());
            stmt.setString(3, entity.getDescripcion());
            stmt.setString(4, entity.getMarca());
            stmt.setString(5, entity.getProcedencia());
            stmt.setString(6, entity.getPeso());
            stmt.setInt(7, entity.getStockInicial());
            stmt.setInt(8, entity.getStockInicial());
            stmt.setInt(9, entity.getStockMinimo());
            stmt.setBoolean(10, entity.getEstado());
            stmt.setInt(11, entity.getUsuario().getId());
            stmt.executeUpdate();  
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void update(Producto entity) {
        String sql="UPDATE entitys SET codigo_entity = ?, categoria_id = ?, descripcion_entity = ?, marca_entity = ?, procedencia_entity = ?, peso_entity = ?, stock_inicial_entity = ?, stock_actual_entity = ?, stock_minimo_entity = ?,estado_entity = ?,usuario_id = ? WHERE id_entity = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, entity.getCodigo());
            stmt.setInt(2, entity.getCategoria().getId());
            stmt.setString(3, entity.getDescripcion());
            stmt.setString(4, entity.getMarca());
            stmt.setString(5, entity.getProcedencia());
            stmt.setString(6, entity.getPeso());
            stmt.setInt(7, entity.getStockInicial());
            stmt.setInt(8, entity.getStockInicial());
            stmt.setInt(9, entity.getStockMinimo());
            stmt.setBoolean(10, entity.getEstado());
            stmt.setInt(11, entity.getUsuario().getId());
            stmt.setInt(12, entity.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
    }   

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM entitys WHERE id_entity = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }
    
    public int contarPorCategoria(Integer categoriaId) {
        String sql = "SELECT COUNT(*) FROM entitys WHERE categoria_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, categoriaId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
        return 0;
    }

    
}
