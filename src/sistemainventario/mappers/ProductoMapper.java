package sistemainventario.mappers;

import java.util.List;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.model.Producto;

public class ProductoMapper implements IMapper<Producto, ProductoDTO>{
    private final CategoriaMapper categoriaMapper = new CategoriaMapper();
    private final UsuarioMapper usuarioMapper = new UsuarioMapper();
    
    @Override    
    public ProductoDTO toDTO(Producto model){
        ProductoDTO dto=new ProductoDTO();
        
        dto.setId(model.getId());
        dto.setCodigo(model.getCodigo());
        dto.setCategoria(categoriaMapper.toDTO(model.getCategoria()));
        dto.setDescripcion(model.getDescripcion());
        dto.setMarca(model.getMarca());
        dto.setProcedencia(model.getProcedencia().toUpperCase());
        dto.setPeso(model.getPeso());
        dto.setStockInicial(model.getStockInicial());
        dto.setStockActual(model.getStockActual());
        dto.setStockMinimo(model.getStockMinimo());
        if (model.getEstado()){
            dto.setEstado("Habilitado");
        }else{
            dto.setEstado("Desabilitado");
        }
        
        dto.setUsuario(usuarioMapper.toDTO(model.getUsuario()));
        
        return dto;
    }
    
    @Override
    public Producto toEntity(ProductoDTO dto){
        Producto model=new Producto();
        
        model.setId(dto.getId());
        model.setCodigo(dto.getCodigo());
        model.setCategoria(categoriaMapper.toEntity(dto.getCategoria()));
        model.setDescripcion(dto.getDescripcion());
        model.setMarca(dto.getMarca());
        model.setProcedencia(dto.getProcedencia().toUpperCase());
        model.setPeso(dto.getPeso());
        model.setStockInicial(dto.getStockInicial());
        model.setStockActual(dto.getStockActual());
        model.setStockMinimo(dto.getStockMinimo());
        model.setEstado(dto.getEstado().equals("Habilitado"));
        model.setUsuario(usuarioMapper.toEntity(dto.getUsuario()));
        
        return model;
    }

    @Override
    public List<ProductoDTO> toDTOList(List<Producto> entities) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> toEntityList(List<ProductoDTO> dtos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
