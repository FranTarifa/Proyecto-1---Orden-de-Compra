package modelos;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "Perez");
        Cliente cliente2 = new Cliente("Maria", "Garcia");
        Cliente cliente3 = new Cliente("Pedro", "Lopez");

        Producto producto1 = new Producto("Fabricante1", "Producto1", 154);
        Producto producto2 = new Producto("Fabricante2", "Producto2", 2234);
        Producto producto3 = new Producto("Fabricante3", "Producto3", 324);
        Producto producto4 = new Producto("Fabricante4", "Producto4", 312);
        Producto producto5 = new Producto("Fabricante5", "Producto5", 2340);
        Producto producto6 = new Producto("Fabricante6", "Producto6", 324);
        Producto producto7 = new Producto("Fabricante7", "Producto7", 53432);
        Producto producto8 = new Producto("Fabricante8", "Producto8", 234);
        Producto producto9 = new Producto("Fabricante9", "Producto9", 4325);

        OrdenCompra orden1 = new OrdenCompra("Orden1");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        OrdenCompra orden2 = new OrdenCompra("Orden2");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);

        OrdenCompra orden3 = new OrdenCompra("Orden3");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(producto2);
        orden3.addProducto(producto4);
        orden3.addProducto(producto6);
        orden3.addProducto(producto8);

        OrdenCompra.imprimirOrden(orden1);
        OrdenCompra.imprimirOrden(orden2);
        OrdenCompra.imprimirOrden(orden3);
    }
}
