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
public class Ejercicio_e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /*14.Leer tres números enteros de un Digito y almacenarlos en una sola 
        variable que contenga a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562.*/
        Scanner entrada = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int total = 0;
        
        System.out.print("Ingresa el valor1:");
        numero1 = Integer.valueOf(entrada.next());
        
        System.out.print("Ingresa el valor2:");
        numero2 = Integer.valueOf(entrada.next());
        
        System.out.print("Ingresa el valor3:");
        numero3 = Integer.valueOf(entrada.next());
        
        total = Integer.valueOf(String.valueOf(numero1)+String.valueOf(numero2)+String.valueOf(numero3));
        System.out.print("El resultado es de:" + total);
    }
    
}
