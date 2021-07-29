package com.Clases;

/**
 *
 * @author nahue
 */
    public class Orden extends Modelos {
        @Override
        public void imprimir() {
                
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
               }
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
                           if(m1.precio>m2.precio){
                               System.out.println("Vehiculo mas varato: "+m2.marca+" "+m2.modelo);
                            }else{}
                       }else{}  
                   }
               }else{}
            }else{if(m1.precio>a1.precio){
                    if(m2.precio>a1.precio){
                        System.out.println("Vehiculo mas varato: "+a1.marca+" "+a1.modelo);
                        }else{}
                    }else{  System.out.println("Vehiculo mas varato:"+m1.marca+" "+m1.modelo);}
                }
                    
                    
                
            
             
           //-------------------------------------------------------------------------------
    }
    
}
