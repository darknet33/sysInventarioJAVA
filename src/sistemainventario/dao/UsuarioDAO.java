package sistemainventario.dao;

import sistemainventario.model.Usuario;
import sistemainventario.model.Rol;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sistemainventario.util.Mensajes;


public class UsuarioDAO implements IDAO<Usuario,Integer>{
    private final Connection conn;

    public UsuarioDAO() {
        this.conn = ConexionDAO.getConexion();
    }
    
    private Usuario mapResultSetToModel(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(rs.getInt("id_usuario"));
        usuario.setUsername(rs.getString("username_usuario"));
        usuario.setPassword(rs.getString("password_usuario"));
        usuario.setNombres(rs.getString("nombres_usuario"));
        usuario.setApellidos(rs.getString("apellidos_usuario"));
        usuario.setCargo(rs.getString("cargo_usuario"));

        RolDAO rolDAO = new RolDAO();
        Rol rol=rolDAO.getById(rs.getInt("rol_id"));
        usuario.setRol(rol);

        usuario.setFechaRegistro(rs.getTimestamp("f_registro_usuario"));
        usuario.setFechaActualizado(rs.getTimestamp("f_actualizado_usuario"));
        usuario.setEstado(rs.getBoolean("estado_usuario"));

        return usuario;
    }
    
    @Override
    public Usuario getById(Integer id) {
        String sql = "SELECT * FROM usuarios WHERE id_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {                
                return mapResultSetToModel(rs);
            }
            
        } catch (SQLException e) {
           Mensajes.error(sql, e);
            
        }

        return null;
    }
    
    @Override
    public List<Usuario> getAll() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

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
    public void save(Usuario entity) {
        String sql = "INSERT INTO usuarios (username_usuario, password_usuario, nombres_usuario, apellidos_usuario, cargo_usuario, rol_id, f_registro_usuario, f_actualizado_usuario, estado_usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getUsername());
            stmt.setString(2, entity.getPassword());
            stmt.setString(3, entity.getNombres());
            stmt.setString(4, entity.getApellidos());
            stmt.setString(5, entity.getCargo());
            stmt.setInt(6, entity.getRol().getId());
            stmt.setTimestamp(7, new Timestamp(entity.getFechaRegistro().getTime()));
            stmt.setTimestamp(8, new Timestamp(entity.getFechaActualizado().getTime()));
            stmt.setBoolean(9, entity.getEstado());
            stmt.executeUpdate();  
        } catch (Exception e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void update(Usuario entity) {
        String sql = "UPDATE usuarios SET username_usuario = ?, password_usuario = ?, nombres_usuario = ?, apellidos_usuario = ?, cargo_usuario = ?, rol_id = ?, f_actualizado_usuario = ?, estado_usuario = ? WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, entity.getUsername());
            stmt.setString(2, entity.getPassword());
            stmt.setString(3, entity.getNombres());
            stmt.setString(4, entity.getApellidos());
            stmt.setString(5, entity.getCargo());
            stmt.setInt(6, entity.getRol().getId());
            stmt.setTimestamp(7, new Timestamp(entity.getFechaActualizado().getTime()));
            stmt.setBoolean(8, entity.getEstado());
            stmt.setInt(9, entity.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);
        }
    }
    
    public Usuario getByUsername(String Username) {
        String sql = "SELECT * FROM usuarios WHERE username_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return mapResultSetToModel(rs);
            }
            
        } catch (SQLException e) {
            Mensajes.error(sql, e);           
        }
        return null;
    }
    
    public Usuario getByUsernameAndPassword(String username,String password) {
        String sql = "SELECT * FROM usuarios WHERE username_usuario = ? AND password_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return mapResultSetToModel(rs);
            }
            
        } catch (SQLException e) {
            Mensajes.error(sql, e);            
        }
        return null;
    }

    public void changeEstado(int id) {
        String sql = "UPDATE usuarios SET estado_usuario = NOT estado_usuario WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            Mensajes.error(sql, e);   
        }
    }
    
}