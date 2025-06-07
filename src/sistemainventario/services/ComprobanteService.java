package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.ComprobanteDAO;
import sistemainventario.dao.ProductoDAO;
import sistemainventario.dto.ComprobanteDTO;
import sistemainventario.mappers.ComprobanteMapper;
import sistemainventario.validator.ComprobanteValidator;

public class ComprobanteService implements IService<ComprobanteDTO, Integer>{
    private final ComprobanteDAO comprobanteDAO;
    private final ProductoDAO productoDAO;
    private final ComprobanteMapper comprobanteMapper;
    
    public ComprobanteService() {
        this.comprobanteDAO = new ComprobanteDAO();
        this.productoDAO= new ProductoDAO();
        this.comprobanteMapper =new ComprobanteMapper();
    }
    
    @Override
    public ComprobanteDTO obtenerPorId(Integer id) {
        return comprobanteMapper.toDTO(comprobanteDAO.getById(id));
    }

    @Override
    public List<ComprobanteDTO> listarTodos() {
        return comprobanteDAO.getAll()
                            .stream()
                            .map(comprobanteMapper::toDTO)
                            .toList();
    }

    @Override
    public void guardar(ComprobanteDTO dto) {
        ComprobanteValidator.validar(dto);
        comprobanteDAO.save(comprobanteMapper.toEntity(dto));
    }

    @Override
    public void actualizar(ComprobanteDTO dto) {
        ComprobanteValidator.validar(dto);
        comprobanteDAO.update(comprobanteMapper.toEntity(dto)); 
    }

    @Override
    public void eliminar(Integer id) {
        /*int cantidadProductos = productoDAO.contarPorComprobante(id);
        if (cantidadProductos > 0) {
            throw new IllegalArgumentException("No se puede eliminar la categoría porque tiene productos asociados.");
        }else{
            comprobanteDAO.delete(id); 
        }*/
    }

    
}
