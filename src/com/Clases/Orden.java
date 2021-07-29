package com.Clases;

/**
 *
 * @author nahue
 */
public class Orden {
    public void Imprimir2(){
        Autos a1 =new Autos("Peugeot","206",200000.00f,4);
        Autos a2 =new Autos("Peugeot","208",250000.00f,5);
        Motos m1 =new Motos("Honda","Titan",60000.00f ,125);
        Motos m2 =new Motos("Yamaha","YBR",80500.00f ,160);
        
        
        if(a1.precio <a2.precio){
               if(m1.precio<a2.precio){
                   if(m2.precio<a2.precio){
                       System.out.println("Vehiculo mas caro: "+a2.marca+" "+a2.modelo);
                   }else{
                       if(a1.precio<m2.precio){
                           if(m1.precio<m2.precio){
                               System.out.println("Vehiculo mas caro: "+ m2.marca+" "+ m2.modelo);
                            }
                       }  
                   }
               }else{}
            }else{
                if(m1.precio<a1.precio){
                    if(m2.precio<a1.precio){
                        System.out.println("Vehiculo mas caro: "+a1.marca+" "+a1.modelo);
                    }
                }else{
                    if(m2.precio<m1.precio){
                        if(a2.precio<m1.precio){
                            System.out.println("Vehiculo mas caro: "+m1.marca+" "+m1.modelo);
                        }
                    }
                }
            }           
            //------------------------------------------------------------------------------- 
            
            if(a1.precio >a2.precio){
               if(m1.precio>a2.precio){
                   if(m2.precio>a2.precio){
                       System.out.println("Vehiculo mas varato: "+a2.marca+" "+a2.modelo);
                   }else{
                       if(a1.precio>m2.precio){       
                           if(m1.precio> m2.precio){
                               System.out.println("Vehiculo mas varato: "+m2.marca+" "+m2.modelo);
                            }
                       }  
                   }
               }else{}
            }else{
                if(m1.precio>a1.precio){
                    if(m2.precio>a1.precio){
                        System.out.println("Vehiculo mas varato: "+a1.marca+" "+a1.modelo);
                    }
                }else{
                    if(m2.precio > m1.precio){ 
                        if(a2.precio>m1.precio){
                            System.out.println("Vehiculo mas varato: "+m1.marca+" "+m1.modelo);
                        
                        }
                    
                    }
                }
            }
             
           //-------------------------------------------------------------------------------
    }
    
}
