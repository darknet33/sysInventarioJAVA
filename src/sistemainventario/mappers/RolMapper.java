package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.RolDTO;
import sistemainventario.model.Rol;


public class RolMapper implements IMapper<Rol, RolDTO>{
    private final PermisoMapper permisoMapper=new PermisoMapper();
    
    @Override
    public RolDTO toDTO(Rol model) {
        RolDTO dto = new RolDTO();
        dto.setNombre(model.getNombre());
        
        dto.setPermisos(permisoMapper.toDTOList(model.getPermisos()));
               
        return dto;
    }
    
    @Override
    public Rol toEntity(RolDTO dto){
        Rol model=new Rol();
        model.setNombre(dto.getNombre());
        
        model.setPermisos(permisoMapper.toEntityList(dto.getPermisos()));
        return model;
    }

    @Override
    public List<RolDTO> toDTOList(List<Rol> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Rol> toEntityList(List<RolDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
