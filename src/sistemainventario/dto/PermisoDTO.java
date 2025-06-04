package sistemainventario.dto;


public class PermisoDTO {
    private String modulo;
    private boolean estado;

    public PermisoDTO() {
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
