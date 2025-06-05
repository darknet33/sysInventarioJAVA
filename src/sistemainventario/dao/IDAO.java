package sistemainventario.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDAO<T, ID> {
    T mapResultSetToEntity(ResultSet rs) throws SQLException;
    T getById(ID id);
    List<T> getAll();
    void save(T entity);
    void update(T entity);
    void delete(ID id);
}
