package com.camilomorales.app;

import com.camilomorales.dominio.Mercado;
import com.camilomorales.dominio.Producto;
import com.camilomorales.dominio.TipoProducto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mercado mercado1 = new Mercado("Jumbo");

        Producto producto1 = new Producto(1,"Salchichas",10,7000,TipoProducto.CARNE);
        Producto producto2 = new Producto(2,"Zanahoria",5,1500,TipoProducto.VERDURA);
        Producto producto3 = new Producto(3,"Yogurt",8,2500,TipoProducto.LACTEO);
        Producto producto4 = new Producto(4,"Naranja",12,5000,TipoProducto.FRUTA);
        Producto producto5 = new Producto(3,"Pandebono",7,3000,TipoProducto.PAN);
        Producto producto6 = new Producto(6,"Club Colombia",8,6000,TipoProducto.CERVEZA);
        Producto producto7 = new Producto(7,"Colombiana",2,2800,TipoProducto.GASEOSA);
        Producto producto8 = new Producto(1,"Spaguetti",10,3200,TipoProducto.PASTA);


        //Nombre del Supermercado
        mercado1.informacion();

        //Agregar Productos
        boolean agregar1 = mercado1.agregar(producto1);
        if (agregar1){
            System.out.println("\n"+producto1.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto1.getNombreCM());
        }

        boolean agregar2 = mercado1.agregar(producto2);
        if (agregar2){
            System.out.println("\n"+producto2.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto2.getNombreCM());
        }

        boolean agregar3 = mercado1.agregar(producto3);
        if (agregar3){
            System.out.println("\n"+producto3.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto3.getNombreCM());
        }

        boolean agregar4 = mercado1.agregar(producto4);
        if (agregar4){
            System.out.println("\n"+producto4.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto4.getNombreCM());
        }

        boolean agregar5 = mercado1.agregar(producto5);
        if (agregar5){
            System.out.println("\n"+producto5.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto5.getNombreCM());
        }

        boolean agregar6 = mercado1.agregar(producto6);
        if (agregar6){
            System.out.println("\n"+producto6.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto6.getNombreCM());
        }

        boolean agregar7 = mercado1.agregar(producto7);
        if (agregar7){
            System.out.println("\n"+producto7.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto7.getNombreCM());
        }

        boolean agregar8 = mercado1.agregar(producto8);
        if (agregar8){
            System.out.println("\n"+producto8.getNombreCM()+" agregado exitosamente");
        }else {
            System.out.println("\nNo se pudo agregar " +producto8.getNombreCM());
        }



        //Retirar un producto
        boolean retirado = mercado1.retirar("Zanahoria");
        if (retirado){
            System.out.println("\n"+producto2.getNombreCM()+ " fue retirado exitosamente");
        }else {
            System.out.println("\nNo se pudo retirar el producto 2 o no existia en el Mercado");
        }


        //Buscar producto por nombre
        Producto productoPorNombre = mercado1.buscarNombre("Club Colombia");
        if (productoPorNombre != null){
            System.out.println("\nProducto encontrado: "+productoPorNombre.getNombreCM());
        }else {
            System.out.println("\nProducto no encontrado");
        }


        //Buscar producto por código
        Producto productoPorCodigo = mercado1.buscarCodigo(4);
        if (productoPorCodigo != null){
            System.out.println("\nProducto encontrado: "+productoPorCodigo.getNombreCM());
        }else {
            System.out.println("\nProducto no encontrado");
        }


        //Buscar producto por Tipo
        List<Producto> productosPorTipo = mercado1.buscarTipo(TipoProducto.LACTEO);
        if (!productosPorTipo.isEmpty()) {
            System.out.println("\nProductos de tipo LACTEO encontrados: ");
            for (Producto producto : productosPorTipo) {
                System.out.println(producto.getNombreCM());
            }
        } else {
            System.out.println("\nNo se encontraron productos de tipo LACTEO");
        }



        //Calcular total
        int total = mercado1.calcularTotal();
        System.out.println("\nEl total del inventario es de: "+total);

    }
}
