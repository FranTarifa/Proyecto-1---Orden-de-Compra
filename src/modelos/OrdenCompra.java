package modelos;

import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    public OrdenCompra(String descripcion) {this.descripcion = descripcion;}

    public Integer getIdentificador() {return identificador;}

    public String getDescripcion() {return descripcion;}

    public Date getFecha() {return fecha;}

    public Cliente getCliente() {return cliente;}

    public Producto[] getProductos() {return productos;}

    public void setFecha(Date fecha) {this.fecha = fecha;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public void addProducto(Producto producto) {
        for(int i=0; i<productos.length; i++) {
            if(productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }
    }

    public int getGranTotal() {
        int granTotal = 0;
        for(Producto producto : productos) {
            if(producto != null) {
                granTotal += producto.getPrecio();
            }
        }
        return granTotal;
    }
}


