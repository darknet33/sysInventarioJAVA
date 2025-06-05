package sistemainventario.services;

import java.util.List;
import sistemainventario.dao.CategoriaDAO;
import sistemainventario.dto.CategoriaDTO;
import sistemainventario.mappers.CategoriaMapper;
import sistemainventario.validator.CategoriaValidator;

public class CategoriaService implements IService<CategoriaDTO, Integer>{
    private final CategoriaDAO categoriaDAO;
    private final CategoriaMapper categoriaMapper;
    
    public CategoriaService() {
        this.categoriaDAO = new CategoriaDAO();
        this.categoriaMapper =new CategoriaMapper();
    }
    
    @Override
    public CategoriaDTO obtenerPorId(Integer id) {
        return categoriaMapper.toDTO(categoriaDAO.getById(id));
    }

    @Override
    public List<CategoriaDTO> listarTodos() {
        return categoriaDAO.getAll()
                            .stream()
                            .map(categoriaMapper::toDTO)
                            .toList();
    }

    @Override
    public void guardar(CategoriaDTO dto) {
        CategoriaValidator.validar(dto);
        categoriaDAO.save(categoriaMapper.toEntity(dto));
    }

    @Override
    public void actualizar(CategoriaDTO dto) {
        CategoriaValidator.validar(dto);
        categoriaDAO.update(categoriaMapper.toEntity(dto)); 
    }

    @Override
    public void eliminar(Integer id) {
        categoriaDAO.delete(id); 
    }

    
}
