package sistemainventario.dto;

import java.util.List;

public class RolDTO {
    private String nombre;
    private List<PermisoDTO> permisos;

    public RolDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PermisoDTO> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<PermisoDTO> permisos) {
        this.permisos = permisos;
    }
    
    
    
}
