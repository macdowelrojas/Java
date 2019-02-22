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
public class Ejercicio_t {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        30.Hacer un programa que muestre la raiz cuadrada de cualquier numero ingresado
        */
        
          Scanner entrada = new Scanner(System.in);
        float numero = 0;
        System.out.println("Ingrese un numero:.");
        numero = Float.valueOf(entrada.next());
        
        System.out.println("La  raiz cuadrada es: "+Math.sqrt(numero));
    }
    
}
