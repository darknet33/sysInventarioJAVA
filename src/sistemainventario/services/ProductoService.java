package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.ProductoDAO;
import sistemainventario.dto.ProductoDTO;
import sistemainventario.mappers.ProductoMapper;

public class ProductoService implements BaseService<ProductoDTO, Integer>{
    
    private final ProductoDAO productoDAO;
    
    public ProductoService() {
        this.productoDAO = new ProductoDAO();
    }
    
    @Override
    public ProductoDTO obtenerPorId(Integer id) {
        return ProductoMapper.toDTO(productoDAO.getById(id));
    }

    @Override
    public List<ProductoDTO> listarTodos() {
        return productoDAO.getAll().stream()
                                   .map(ProductoMapper::toDTO)
                                   .toList();
    }

    @Override
    public void guardar(ProductoDTO dto) {
        productoDAO.save(ProductoMapper.toModel(dto));
    }

    @Override
    public void actualizar(ProductoDTO dto) {
        productoDAO.update(ProductoMapper.toModel(dto));
    }

    @Override
    public void eliminar(Integer id) {
        productoDAO.delete(id);
    }
    
}
