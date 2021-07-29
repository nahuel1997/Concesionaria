package com.Clases;

/**
 *
 * @author nahue
 */
public class Motos {
    private String marca="", modelo="";
    private float precio=0f;
    private int cilindradas=0;
    
    public Motos(String marca,String modelo,float precio, int cilindradas) {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.cilindradas=cilindradas;
        
        
    }

    @Override
    public String toString() {
        return "Marca: "+marca+" // "+"Modelo: "+modelo+" // "+"Cilindradas:"+cilindradas+"cc"+" // "+"Precio:"+precio;
    }
}
