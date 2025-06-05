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
    
    public ProductoDAO() {
        this.conn = ConexionDAO.getConexion();
    }
    
    private Producto mapResultSetToModel(ResultSet rs) throws SQLException {
        Producto producto = new Producto();
        producto.setId(rs.getInt("id_producto"));
        producto.setCodigo(rs.getString("codigo_producto"));

        CategoriaDAO categoriaDAO=new CategoriaDAO();
        Categoria categoria=categoriaDAO.getById(rs.getInt("categoria_id"));
        
        producto.setCategoria(categoria);
        producto.setDescripcion(rs.getString("descripcion_producto"));
        producto.setMarca(rs.getString("marca_producto"));
        producto.setProcedencia(rs.getString("procedencia_producto"));
        producto.setPeso(rs.getString("peso_producto"));
        producto.setStockInicial(rs.getInt("stock_inicial_producto"));
        producto.setStockActual(rs.getInt("stock_actual_producto"));
        producto.setStockMinimo(rs.getInt("stock_minimo_producto"));
        producto.setFechaRegistro(rs.getTimestamp("f_registro_producto"));
        producto.setFechaActualizado(rs.getTimestamp("f_actualizado_producto"));
        producto.setEstado(rs.getBoolean("estado_producto"));
        
        UsuarioDAO usuarioDAO=new UsuarioDAO();
        Usuario usuario=usuarioDAO.getById(rs.getInt("usuario_id"));

        producto.setUsuario(usuario);

        return producto;
    } 
    

    @Override
    public Producto getById(Integer id) {
        String sql= "SELECT * FROM productos WHERE id_producto = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            if (rs.next()) {
                return mapResultSetToModel(rs);
            }
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
        return null;
    }

    @Override
    public List<Producto> getAll() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(mapResultSetToModel(rs));
            }
            
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }

        return lista;
    }

    @Override
    public void save(Producto entity) {
        String sql = "INSERT INTO productos (codigo_producto, categoria_id, descripcion_producto, marca_producto, procedencia_producto, peso_producto, stock_inicial_producto, stock_actual_producto, stock_minimo_producto,estado_producto,usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
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
        String sql="UPDATE productos SET codigo_producto = ?, categoria_id = ?, descripcion_producto = ?, marca_producto = ?, procedencia_producto = ?, peso_producto = ?, stock_inicial_producto = ?, stock_actual_producto = ?, stock_minimo_producto = ?,estado_producto = ?,usuario_id = ? WHERE id_producto = ?";
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
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }
    
}
