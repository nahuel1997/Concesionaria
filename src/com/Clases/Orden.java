package com.Clases;
/**
 * nahuel.sasia@gmail.com
 * @author Nahuel Perez Sasia
 */
    public class Orden extends Modelos {
//extiende de Modelos,Para facilitiar el cambio de algun vehiculo y alterar lo menos posible el codigo
        
        @Override
        public void imprimir() {
//----------------------------------------------------------------------------------------------//               
            //Imprimie el vehiculo mas caro 
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
 //----------------------------------------------------------------------------------------------// 
            //Imprimie el vehiculo mas varato
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
                    
                    
                
            
             
 //----------------------------------------------------------------------------------------------// 
            
        
        
        }
    
}
