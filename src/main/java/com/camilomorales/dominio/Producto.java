package com.camilomorales.dominio;

public class Producto {

    //Atributos
    private int codigoCM;
    private String nombreCM;
    private int cantidadCM;
    private int precioCM;
    private String tipoCM;


    //Constructor
    public Producto(int codigoCM, String nombreCM, int cantidadCM, int precioCM, String tipoCM) {
        this.codigoCM = codigoCM;
        this.nombreCM = nombreCM;
        this.cantidadCM = cantidadCM;
        this.precioCM = precioCM;
        this.tipoCM = tipoCM;
    }


    //getter
    public int getCodigoCM() {
        return codigoCM;
    }

    public String getNombreCM() {
        return nombreCM;
    }

    public int getCantidadCM() {
        return cantidadCM;
    }

    public int getPrecioCM() {
        return precioCM;
    }

    public String getTipoCM() {
        return tipoCM;
    }



    //setter
    public void setCantidadCM(int cantidadCM) {
        this.cantidadCM = cantidadCM;
    }

    public void setPrecioCM(int precioCM) {
        this.precioCM = precioCM;
    }

    public void setTipoCM(String tipoCM) {
        this.tipoCM = tipoCM;
    }
}
