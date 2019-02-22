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
public class Ejercicio_n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        23.elevar al cubo un numero
        */
        Scanner entrada = new Scanner(System.in);
        float valor = 0;
        
        System.out.println("Ingrese un numero para elevarlo al cubo");
        valor = Float.valueOf(entrada.next());
        
        System.out.println("El numero ingresado, al cubo es "+(valor*valor*valor));
    }
    
}
