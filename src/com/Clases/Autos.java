package com.Clases;

/**
 *
 * @author nahue
 */
public class Autos {
    String marca = "";
    String modelo = "";
    float precio=0f;
    private int puertas=0, cilindradas=0;

    
   
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
    
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getPuertas() {
        return puertas;
    }



  
    
}
