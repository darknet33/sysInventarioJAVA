package sistemainventario.services;

import java.util.List;

public interface BaseService<T, ID> {
    T obtenerPorId(ID id);
    List<T> listarTodos();
    void guardar(T dto);
    void actualizar(T dto);
    void eliminar(ID id);
}
