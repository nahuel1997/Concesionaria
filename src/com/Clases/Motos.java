package com.Clases;

/**
 *
 * @author nahue
 */
public class Motos {
    static String marca = "";
    static String modelo = "";
    static float precio=0f;
    static private int cilindradas=0;
    
    public Motos(String marca,String modelo,float precio, int cilindradas) {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.cilindradas=cilindradas;
        
        
    }

    @Override
    public String toString() {
        return "Marca: "+marca+" // "+"Modelo: "+modelo+" // "+"Cilindradas:"+cilindradas+"cc"+" // "+"Precio: $"+precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    
}
