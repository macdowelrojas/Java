/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author mac_rojas
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero = 0;
        
        System.out.println("Ingrese el numero:.");
        numero =Integer.valueOf(entrada.next());
        if(numero > 0 && numero <10 ){
        System.out.println("El numero solo tiene una cifra:.");
        }
        if (numero >=10 && numero <100){
            System.out.println("El numero tiene dos cifras:.");
        }
         if (numero >=100 && numero <1000){
            System.out.println("El numero tiene tres cifras:.");
        }
         else if (numero >=1000 && numero < 10000){
             System.out.println("El numero tiene cuatro cifras");
        
        }
         
    }
}
