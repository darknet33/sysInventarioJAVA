package sistemainventario.mappers;

import sistemainventario.dto.UsuarioDTO;
import sistemainventario.model.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario model) {
        UsuarioDTO dto = new UsuarioDTO();
        
        dto.setId(model.getId());
        dto.setUsername(model.getUsername());
        dto.setPassword(model.getPassword());
        dto.setNombres(model.getNombres());
        dto.setApellidos(model.getApellidos());
        dto.setCargo(model.getCargo());
        dto.setRol(RolMapper.toDTO(model.getRol()));
        dto.setEstado(model.getEstado());
               
        return dto;
    }
   
    public static Usuario toModel(UsuarioDTO dto){
        Usuario model=new Usuario();
        
        model.setId(dto.getId());
        model.setUsername(dto.getUsername());
        model.setPassword(dto.getPassword());
        model.setNombres(dto.getNombres());
        model.setApellidos(dto.getApellidos());
        model.setCargo(dto.getCargo());
        model.setRol(RolMapper.toModel(dto.getRol()));
        model.setEstado(dto.getEstado());
        
        return model;
    }
}
