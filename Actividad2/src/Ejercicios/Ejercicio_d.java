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
public class Ejercicio_d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*13.Leer dos números y encontrar:
a.La suma del doble del primero mas el cuadrado del segundo. 
b.El promedio de sus cubos.*/
        Scanner entrada = new Scanner(System.in);
        
        int val1 = 0;
        int val2 = 0;
        int o1 = 0;
        int o2 = 0;
        
        System.out.print("Ingresa el primer valor:");
        val1 = Integer.valueOf(entrada.next());
        System.out.print("Ingresa el primer valor:");
        val1 = Integer.valueOf(entrada.next());
        o1 = (val1 * 2) + (val2 *val2);
        o2 = ((val1 * val1 * val1)+(val2 * val2 * val2))/3;
        
        System.out.print("La primera operacion es de: " + o1);
        System.out.print("La segunda operacion es de: " + o2);
    }
    
}
