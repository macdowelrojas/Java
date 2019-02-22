/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mac_rojas
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ejer1 = new Scanner(System.in);
        int cifra = 0;
       
         System.out.print("Ingrese un numero:.");
        cifra = Integer.valueOf(ejer1.next());
        
        if(cifra >= 0 && cifra <=9999){
            if(cifra >= 0 && cifra <= 9){
                System.out.println("El numero ingresado tiene una cifra:." +cifra);
            }
            else if(cifra >= 10 && cifra <=99){
                System.out.println("El numero ingresado tiene dos cifras:." +cifra);
            }
            else if(cifra >= 100 && cifra <=999){
                System.out.println("El numero ingresado tiene tres cifras:." +cifra);
            }
            else if(cifra >= 1000 && cifra <=9999){
                System.out.println("El numero ingresado tiene cuatro cifras:." +cifra);
            }
            
        }else{
            System.out.print("Numero ingresado no es valido:.");
        }
            
        
    }
    
}