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

    public void setIdentificador(Integer identificador) {this.identificador = identificador;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public void setProductos(Producto[] productos) {this.productos = productos;}

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
    public static void imprimirOrden(OrdenCompra orden){
        System.out.println("===================================");
        System.out.println("Orden: " + orden.getDescripcion());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
        System.out.println("Productos:");
        for (Producto producto : orden.getProductos()) {
            if (producto != null) {
                System.out.println("Fabricante: " + producto.getFabricante() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }
        System.out.println("Gran Total: " + orden.getGranTotal());
    }
}


