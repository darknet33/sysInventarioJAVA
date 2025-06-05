package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.UsuarioDTO;
import sistemainventario.model.Usuario;

public class UsuarioMapper implements IMapper<Usuario, UsuarioDTO> {
    private final RolMapper rolMapper = new RolMapper();
    
    @Override
    public UsuarioDTO toDTO(Usuario model) {
        UsuarioDTO dto = new UsuarioDTO();

        dto.setId(model.getId());
        dto.setUsername(model.getUsername());
        dto.setPassword(model.getPassword());
        dto.setNombres(model.getNombres());
        dto.setApellidos(model.getApellidos());
        dto.setCargo(model.getCargo());
        dto.setRol(rolMapper.toDTO(model.getRol()));
        dto.setEstado(model.getEstado());

        return dto;
    }

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        Usuario model = new Usuario();

        model.setId(dto.getId());
        model.setUsername(dto.getUsername());
        model.setPassword(dto.getPassword());
        model.setNombres(dto.getNombres());
        model.setApellidos(dto.getApellidos());
        model.setCargo(dto.getCargo());
        model.setRol(rolMapper.toEntity(dto.getRol()));
        model.setEstado(dto.getEstado());

        return model;
    }

    @Override
    public List<UsuarioDTO> toDTOList(List<Usuario> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> toEntityList(List<UsuarioDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
