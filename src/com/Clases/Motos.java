package com.Clases;

/**
 * nahuel.sasia@gmail.com
 * @author Nahuel Perez Sasia
 */
public class Motos implements Interfaz {
    String marca = "";
    String modelo = "";
    float precio=0f;
    int cilindradas=0;
    
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

  

    @Override
    public void ID() {
        //posible extencion de proyecto, complementando con sedes y responsables
    }

    
}
