package sistemainventario.mappers;

import sistemainventario.dto.RolDTO;
import sistemainventario.model.Rol;


public class RolMapper {
    public static RolDTO toDTO(Rol model) {
        RolDTO dto = new RolDTO();
        dto.setNombre(model.getNombre());
        
        dto.setPermisos(PermisoMapper.toDTOS(model.getPermisos()));
               
        return dto;
    }
    
        public static Rol toModel(RolDTO dto){
        Rol model=new Rol();
        model.setNombre(dto.getNombre());
        
        model.setPermisos(PermisoMapper.toModels(dto.getPermisos()));
        return model;
    }
}
