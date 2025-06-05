package sistemainventario.model;

import java.util.Date;

public class Cliente extends Empresa{
    private boolean estado;
    private Date fechaRegistro;

    public Cliente () {
    }

    public Cliente(boolean estado, Date fechaRegistro, int ID, String Nombre, String Nit, String Representante, String Direccion, String Celular, String Email, String Tipo, byte[] Logo) {
        super(ID, Nombre, Nit, Representante, Direccion, Celular, Email, Tipo, Logo);
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getId() {
        return Id;
    }

    public void setId(int ID) {
        this.Id = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public byte[] getLogo() {
        return Logo;
    }

    public void setLogo(byte[] Logo) {
        this.Logo = Logo;
    }

    
    
    
}
