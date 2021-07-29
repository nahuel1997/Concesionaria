package com.Clases;

/**
 *
 * @author nahue
 */
public class Lista extends Impreciones {
      

    @Override
    public void imprimir() {
        Autos a1 =new Autos("Peugeot","206",200000.00f,4);
        Autos a2 =new Autos("Peugeot","208",250000.00f,5);
        Motos m1 =new Motos("Honda","Titan",60000.00f ,125);
        Motos m2 =new Motos("Yamaha","YBR",80500.00f ,160);
        
        
        System.out.println(a1);
        System.out.println(m1);
        System.out.println(a2);
        System.out.println(m2);
    }
}        
