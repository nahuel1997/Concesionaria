package com.Clases;
/**
 * nahuel.sasia@gmail.com
 * @author Nahuel Perez Sasia
 */
public class Descendente extends Modelos{
        
//extiende de Modelos,Para facilitiar el cambio de algun vehiculo y alterar lo menos posible el codigo
    @Override
    public void imprimir() {
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