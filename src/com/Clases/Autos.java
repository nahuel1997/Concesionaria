package com.Clases;

/**
 * nahuel.sasia@gmail.com
 * @author Nahuel Perez Sasia
 */
public class Autos implements Interfaz {
    String marca = "";
    String modelo = "";
    float precio=0f;
    int puertas=0;

    
   
    public Autos(String marca,String modelo,float precio, int puertas) {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.puertas=puertas;
        
          
        
    }
   

    @Override
    public String toString() {
        return "Marca: "+marca+" // "+"Modelo: "+modelo+" // "+"Puertas:"+puertas+" // "+"Precio: $"+precio;
    }

    @Override
    public void ID() {
        //posible extencion de proyecto, complementando con sedes y responsables
    }

 

 
    
    
}
