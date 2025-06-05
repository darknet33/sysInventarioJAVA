package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.model.Categoria;

public class CategoriaMapper implements IMapper<Categoria, CategoriaDTO>{
    
    @Override
    public CategoriaDTO toDTO(Categoria model){
        CategoriaDTO dto=new CategoriaDTO();
        
        dto.setId(model.getId());
        dto.setNombre(model.getNombre());
        
        return dto;
    }
    
    @Override
    public Categoria toEntity(CategoriaDTO dto){
        Categoria model=new Categoria();
        
        model.setId(dto.getId());
        model.setNombre(dto.getNombre());
        
        return model;
    }

    @Override
    public List<CategoriaDTO> toDTOList(List<Categoria> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Categoria> toEntityList(List<CategoriaDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
