package com.camilomorales.dominio;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

    //Atributos
    public final byte CAPACIDADCM = 68;
    private String nombreSupermercadoCM;
    private List<Producto> productosCM;



    //Constructor
    public Mercado(String nombreSupermercadoCM) {
        this.nombreSupermercadoCM = nombreSupermercadoCM;
        this.productosCM = new ArrayList<>();
    }



    //Métodos

    public void informacion(){
        System.out.println("Supermercado: "+nombreSupermercadoCM);
    }


    public boolean agregar(Producto p){
        for(Producto producto : productosCM){
            if (producto.getCodigoCM() == p.getCodigoCM()){
                return false; // El producto ya existe
            }
        }

        if (productosCM.size() >= CAPACIDADCM){
            return false; // El mercado esta lleno
        }

        productosCM.add(p);
        return true;
    }


    public boolean retirar(String nombre){
        for (Producto producto: productosCM){
            if (producto.getNombreCM().equals(nombre)){
                productosCM.remove(producto);
                return true; //Producto encontrado y retirado
            }
        }
        return false; //Producto no encontrado
    }


    public Producto buscarNombre(String nombre){
        for (Producto producto: productosCM){
            if (producto.getNombreCM().equals(nombre)){
                return producto; // Producto encontrado por Nombre
            }
        }
        return null; // Producto no encontrado
    }

    public Producto buscarCodigo(int codigo){
        for (Producto producto: productosCM){
            if (producto.getCodigoCM() == codigo){
                return producto; //Producto encontrado por Código
            }
        }
        return null; // Producto no encontrado
    }

    public List<Producto> buscarTipo(String tipo){
        List<Producto> productosPorTipo = new ArrayList<>();
        for (Producto producto: productosCM){
            if (producto.getTipoCM().equals(tipo)){
                productosPorTipo.add(producto);
            }
        }
        return productosPorTipo;
    }


    public int calcularTotal(){
        int total = 0;
        for (Producto producto: productosCM){
            total += producto.getPrecioCM();
        }
        return total;
    }


    //getter

    public byte getCAPACIDADCM() {
        return CAPACIDADCM;
    }

    public String getNombreSupermercadoCM() {
        return nombreSupermercadoCM;
    }

    public List<Producto> getProductosCM() {
        return productosCM;
    }



    //setter

    public void setProductosCM(List<Producto> productosCM) {
        this.productosCM = productosCM;
    }
}
