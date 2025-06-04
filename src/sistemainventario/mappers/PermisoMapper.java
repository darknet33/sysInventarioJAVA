package sistemainventario.mappers;


import sistemainventario.dto.PermisoDTO;
import sistemainventario.model.Permiso;
import java.util.ArrayList;
import java.util.List;

public class PermisoMapper {    
    public static PermisoDTO toDTO(Permiso model) {
        PermisoDTO dto =new PermisoDTO();
        dto.setModulo(model.getModulo());
        dto.setEstado(model.isEstado());
        return dto;
    }
        
    public static Permiso toModel(PermisoDTO dto){
        Permiso model=new Permiso();
        model.setModulo(dto.getModulo());
        model.setEstado(dto.isEstado());
        return model;
    }
    
    public static List<PermisoDTO> toDTOS(List<Permiso> models){
        List<PermisoDTO> dtos=new ArrayList<>();
        
        models.forEach(p -> {
            dtos.add(toDTO(p));
        });
        
        return dtos;
    }
    
    public static List<Permiso> toModels(List<PermisoDTO> dtos){
        List<Permiso> models=new ArrayList<>();
        
        dtos.forEach(p -> {
            models.add(toModel(p));
        });
        
        return models;
    }
}
