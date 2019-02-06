
package Texto;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
    
       Scanner escriba = new Scanner (System.in);
       float num =0;
       float cubo =0;
       float cuadrado = 0;
       int incremento =0;
       
       while (incremento !=5)
           {
               System.out.println("Escriba el numero que quiera elevar al cuadrado y al cubo:.");
               num = escriba.nextFloat();
               cubo = num*num*num;
               cuadrado = num*num;
               System.out.println("El numero ingresado al cuadrado es:." +cuadrado);
               System.out.println("El numero ingresado al cubo es:." +cubo);
               incremento++;
              
               
               
               
           }
           
        
        
        
        
        
    }
    
}
