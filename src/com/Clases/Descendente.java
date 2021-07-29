package com.Clases;

/**
 *
 * @author nahue
 */
public class Descendente extends Impreciones{
        

    @Override
    public void imprimir() {
        Autos a1 =new Autos("Peugeot","206",200000.00f,4);
        Autos a2 =new Autos("Peugeot","208",250000.00f,5);
        Motos m1 =new Motos("Honda","Titan",60000.00f ,125);
        Motos m2 =new Motos("Yamaha","YBR",80500.00f ,160);
        System.out.println("Vehiculos ordenados por precio mayor a menor:");
            if(a1.precio>a2.precio && a1.precio >m1.precio && a1.precio >m2.precio){
                System.out.println(a1.marca+""+a1.modelo);
                if(a2.precio >m1.precio && a2.precio >m2.precio){
                    System.out.println(a2.marca+""+a2.modelo);
                    if(m1.precio >m2.precio){
                        System.out.println(m1.marca+""+m1.modelo);
                        System.out.println(m2.marca+""+m2.modelo);
                    }else{
                        System.out.println(m2.marca+""+m1.modelo);
                        System.out.println(m1.marca+""+m1.modelo);
                    
                    }
                }else{
                    if(m1.precio >a2.precio && m1.precio >m2.precio){
                        System.out.println(m1.marca+""+m1.modelo);
                        if(a2.precio >m2.precio){
                            System.out.println(a2.marca+""+a2.modelo);
                            System.out.println(m2.marca+""+m2.modelo);
                        }else{
                            System.out.println(m2.marca+""+m2.modelo);
                            System.out.println(a2.marca+""+a2.modelo);
                        
                        }
                    }else{
                        if(m2.precio >a2.precio && m2.precio >m1.precio){
                            System.out.println(m2.marca+""+m2.modelo);
                            if(m1.precio >a2.precio){
                                System.out.println(m1.marca+""+m1.modelo);
                                System.out.println(a2.marca+""+a2.modelo);
                            }else{
                                System.out.println(a2.marca+""+a2.modelo);
                                System.out.println(m1.marca+""+m1.modelo);
                            }
                        }
                    }
                }
            }else{
                if(a2.precio>a1.precio && a2.precio >m1.precio && a2.precio >m2.precio){
                System.out.println(a2.marca+" "+a2.modelo);
                if(a1.precio >m1.precio && a1.precio >m2.precio){
                    System.out.println(a1.marca+" "+a1.modelo);
                    if(m1.precio >m2.precio){
                        System.out.println(m1.marca+" "+m1.modelo);
                        System.out.println(m2.marca+" "+m2.modelo);
                    }else{
                        System.out.println(m2.marca+" "+m2.modelo);
                        System.out.println(m1.marca+" "+m1.modelo);
                    
                    }
                }else{
                    if(m1.precio >a1.precio && m1.precio >m2.precio){
                        System.out.println(m1.marca+" "+m1.modelo);
                        if(a1.precio >m2.precio){
                            System.out.println(a1.marca+" "+a1.modelo);
                            System.out.println(m2.marca+" "+m2.modelo);
                        }else{
                            System.out.println(m2.marca+" "+m2.modelo);
                            System.out.println(a1.marca+" "+a1.modelo);
                        
                        }
                    }else{
                        if(m2.precio >a1.precio && m2.precio >m1.precio){
                            System.out.println(m2.marca+" "+m2.modelo);
                            if(m1.precio >a1.precio){
                                System.out.println(m1.marca+" "+m1.modelo);
                                System.out.println(a1.marca+" "+a1.modelo);
                            }else{
                                System.out.println(a1.marca+" "+a1.modelo);
                                System.out.println(m1.marca+" "+m1.modelo);
                            }
                        }
                    }
                }
            }else{
                    if(m1.precio>a2.precio && m1.precio >a1.precio && m1.precio >m2.precio){
                System.out.println(m1.marca+" "+m1.modelo);
                if(a2.precio >a1.precio && a2.precio >m2.precio){
                    System.out.println(a2.marca+" "+a2.modelo);
                    if(a1.precio >m2.precio){
                        System.out.println(a1.marca+" "+a1.modelo);
                        System.out.println(m2.marca+" "+m2.modelo);
                    }else{
                        System.out.println(m2.marca+" "+m2.modelo);
                        System.out.println(a1.marca+" "+a1.modelo);
                    
                    }
                }else{
                    if(a1.precio >a2.precio && a1.precio >m2.precio){
                        System.out.println(a1.marca+""+a1.modelo);
                        if(a2.precio >m2.precio){
                            System.out.println(a2.marca+" "+a2.modelo);
                            System.out.println(m2.marca+" "+m2.modelo);
                        }else{
                            System.out.println(m2.marca+" "+m2.modelo);
                            System.out.println(a2.marca+" "+a2.modelo);
                        
                        }
                    }else{
                        if(m2.precio >a2.precio && m2.precio >a1.precio){
                            System.out.println(m2.marca+" "+m2.modelo);
                            if(a1.precio >a2.precio){
                                System.out.println(a1.marca+" "+a1.modelo);
                                System.out.println(a2.marca+" "+a2.modelo);
                            }else{
                                System.out.println(a2.marca+" "+a2.modelo);
                                System.out.println(a1.marca+" "+a1.modelo);
                            }
                        }
                    }
                }
            }else{ 
                    if(m2.precio>a2.precio && m2.precio >a1.precio && m2.precio >m1.precio){
                System.out.println(m2.marca+" "+m2.modelo);
                if(a2.precio >a1.precio && a2.precio >m1.precio){
                    System.out.println(a2.marca+" "+a2.modelo);
                    if(a1.precio >m1.precio){
                        System.out.println(a1.marca+" "+a1.modelo);
                        System.out.println(m1.marca+" "+m1.modelo);
                    }else{
                        System.out.println(m1.marca+" "+m1.modelo);
                        System.out.println(a1.marca+" "+a1.modelo);
                    
                    }
                }else{
                    if(a1.precio >a2.precio && a1.precio >m1.precio){
                        System.out.println(a1.marca+""+a1.modelo);
                        if(a2.precio >m1.precio){
                            System.out.println(a2.marca+" "+a2.modelo);
                            System.out.println(m1.marca+" "+m1.modelo);
                        }else{
                            System.out.println(m1.marca+" "+m1.modelo);
                            System.out.println(a2.marca+" "+a2.modelo);
                        
                        }
                    }else{
                        if(m1.precio >a2.precio && m1.precio >a1.precio){
                            System.out.println(m1.marca+" "+m1.modelo);
                            if(a1.precio >a2.precio){
                                System.out.println(a1.marca+" "+a1.modelo);
                                System.out.println(a2.marca+" "+a2.modelo);
                            }else{
                                System.out.println(a2.marca+" "+a2.modelo);
                                System.out.println(a1.marca+" "+a1.modelo);
                                    }
                                }
                            }
                        }
                    }    
                        
                    }

                }
        }
    }
}