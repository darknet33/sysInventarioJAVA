package sistemainventario.mappers;

import sistemainventario.dto.ProductoDTO;
import sistemainventario.model.Producto;

public class ProductoMapper {
        
    public static ProductoDTO toDTO(Producto model){
        ProductoDTO dto=new ProductoDTO();
        
        dto.setId(model.getId());
        dto.setCodigo(model.getCodigo());
        dto.setCategoria(CategoriaMapper.toDTO(model.getCategoria()));
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
        
        dto.setUsuario(UsuarioMapper.toDTO(model.getUsuario()));
        
        return dto;
    }
    
    public static Producto toModel(ProductoDTO dto){
        Producto model=new Producto();
        
        model.setId(dto.getId());
        model.setCodigo(dto.getCodigo());
        model.setCategoria(CategoriaMapper.toModel(dto.getCategoria()));
        model.setDescripcion(dto.getDescripcion());
        model.setMarca(dto.getMarca());
        model.setProcedencia(dto.getProcedencia().toUpperCase());
        model.setPeso(dto.getPeso());
        model.setStockInicial(dto.getStockInicial());
        model.setStockActual(dto.getStockActual());
        model.setStockMinimo(dto.getStockMinimo());
        model.setEstado(dto.getEstado().equals("Habilitado"));
        model.setUsuario(UsuarioMapper.toModel(dto.getUsuario()));
        
        return model;
    }
}
