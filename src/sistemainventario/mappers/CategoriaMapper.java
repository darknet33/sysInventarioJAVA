package sistemainventario.mappers;

import sistemainventario.dto.CategoriaDTO;
import sistemainventario.model.Categoria;

public class CategoriaMapper {
    
    public static CategoriaDTO toDTO(Categoria model){
        CategoriaDTO dto=new CategoriaDTO();
        
        dto.setId(model.getId());
        dto.setNombre(model.getNombre());
        
        return dto;
    }
    
    public static Categoria toModel(CategoriaDTO dto){
        Categoria model=new Categoria();
        
        model.setId(dto.getId());
        model.setNombre(dto.getNombre());
        
        return model;
    }
}
