package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.CategoriaDAO;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.mappers.CategoriaMapper;
import sistemainventario.validator.CategoriaValidator;

public class CategoriaService implements BaseService<CategoriaDTO, Integer>{
    private final CategoriaDAO categoriaDAO;
    
    public CategoriaService() {
        this.categoriaDAO = new CategoriaDAO();
    }
    
    @Override
    public CategoriaDTO obtenerPorId(Integer id) {
        return CategoriaMapper.toDTO(categoriaDAO.getById(id));
    }

    @Override
    public List<CategoriaDTO> listarTodos() {
        return categoriaDAO.getAll()
                            .stream()
                            .map(CategoriaMapper::toDTO)
                            .toList();
    }

    @Override
    public void guardar(CategoriaDTO dto) {
        CategoriaValidator.validar(dto);
        categoriaDAO.save(CategoriaMapper.toModel(dto));
    }

    @Override
    public void actualizar(CategoriaDTO dto) {
        CategoriaValidator.validar(dto);
        categoriaDAO.update(CategoriaMapper.toModel(dto)); 
    }

    @Override
    public void eliminar(Integer id) {
        categoriaDAO.delete(id); 
    }

    
}
