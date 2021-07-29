package com.Clases;
/**
 * nahuel.sasia@gmail.com
 * @author Nahuel Perez Sasia
 */
public class SiEmpieza extends Modelos{
    String letra="Y"; 
    int desde=0;
    int hasta=1;
    String r="";
    
    @Override
    public void imprimir() {
        System.out.print("Vehículo que contiene en el modelo la letra "+letra+" :");
        
        r=a1.modelo.substring(desde,hasta);
        if(letra.equals(r)){
            System.out.println(" "+a1.marca+" "+a1.modelo+" "+"$"+a1.precio);
            }else{
                r=a2.modelo.substring(desde,hasta);
                if(letra.equals(r)){
                System.out.println(" "+a2.marca+" "+a2.modelo+" "+"$"+a2.precio);
                    }else{
                        r=m1.modelo.substring(desde,hasta);
                        if(letra.equals(r)){
                        System.out.println(" "+m1.marca+" "+m1.modelo+" "+"$"+m1.precio);
                        }else{
                            r=m2.modelo.substring(desde,hasta);
                            if(letra.equals(r)){
                            System.out.println(" "+m2.marca+" "+m2.modelo+" "+"$"+m2.precio);
                            }
                        }
                    }
                }
        
        
    
    }
    
}
