package com.Clases;
/**
 * nahuel.sasia@gmail.com
 * @author Nahuel Perez Sasia
 */
public class Sedes  {
        String gerente="";
        String calle="";
        int altura=0;
        int telefono=0;
        
        public Sedes(String gerente,String calle,int altura , int telefono) {
            this.altura=altura;
            this.calle=calle;
            this.gerente=gerente;
            this.telefono=telefono;
        }

    @Override
    public String toString() {
        return "Sedes{" + "sede=" + gerente + ", calle=" + calle + altura + ", telefono=" + telefono + '}';
    }

   

    
}
