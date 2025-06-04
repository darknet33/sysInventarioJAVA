package sistemainventario.dto;

import java.util.Date;


public class ProductoDTO {
    private int id;
    private String codigo;
    private CategoriaDTO categoria;
    private String descripcion;
    private String marca;
    private String procedencia;
    private String Peso;
    private int stockInicial;
    private int stockActual;
    private int stockMinimo;
    private Date fechaRegistro;
    private Date fechaActualizado;
    private String estado;

    public ProductoDTO() {
    }

    public ProductoDTO(int id, String codigo, CategoriaDTO categoria, String descripcion, String marca, String procedencia, String Peso, int stockInicial, int stockMinimo, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.marca = marca;
        this.procedencia = procedencia;
        this.Peso = Peso;
        this.stockInicial = stockInicial;
        this.stockMinimo = stockMinimo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActualizado() {
        return fechaActualizado;
    }

    public void setFechaActualizado(Date fechaActualizado) {
        this.fechaActualizado = fechaActualizado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
