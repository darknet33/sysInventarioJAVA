package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.UsuarioDAO;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.mappers.UsuarioMapper;
import sistemainventario.model.Usuario;
import sistemainventario.validator.UsuarioValidator;

public class UsuarioService implements BaseService<UsuarioDTO, Integer>{

    private final UsuarioDAO usuarioDAO;

    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAO();
    }

    @Override
    public UsuarioDTO obtenerPorId(Integer id) {
        return UsuarioMapper.toDTO(usuarioDAO.getById(id));
    }

    @Override
    public List<UsuarioDTO> listarTodos() {
        return usuarioDAO.getAll()
                 .stream()
                 .map(UsuarioMapper::toDTO)
                 .toList();
    }

    @Override
    public void guardar(UsuarioDTO dto) {
        usuarioDAO.save(UsuarioMapper.toModel(dto));
    }

    @Override
    public void actualizar(UsuarioDTO dto) {
        usuarioDAO.update(UsuarioMapper.toModel(dto));
    }

    @Override
    public void eliminar(Integer id) {
         usuarioDAO.delete(id);
    }
    
    public UsuarioDTO login(String username,String password) {
        UsuarioValidator.validarLogin(username, password); 
        
        Usuario usuario = usuarioDAO.getByUsername(username);
        if (usuario == null) 
            throw new IllegalArgumentException("El usuario es Incorrecto.");
        
        if (!usuario.getPassword().equals(password))
            throw new IllegalArgumentException("Contraseña incorrecta.");
                
        if (usuario.getEstado()==false)
            throw new IllegalArgumentException("El usuario esta Inhabilitado");
        
        return UsuarioMapper.toDTO(usuario);
    }
    
    public void cambiarEstado(int id){
        usuarioDAO.changeEstado(id);
    }
}