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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*9.Escriba un algoritmo que dado el número de horas 
        trabajadas por un empleado y el sueldo por hora,
        calcule el sueldo total de ese empleado. Tenga en cuenta 
        que las horas extras se pagan el doble.*/
        
        Scanner entrada = new Scanner(System.in);
        
        float valor = (float) 0;
        int h = 0;
        int h_extras = 0;
        
        System.out.print("Ingresa el precio de la hora:.");
        valor = Float.valueOf(entrada.next());
        System.out.print("Ingresa las horas trabajadas:.");
        h = Integer.valueOf(entrada.next());
        System.out.print("Ingresa las horas extras trabajadas:.");
        h_extras = Integer.valueOf(entrada.next());
        
        System.out.print("Tu sueldo es de:."+ ((valor * h) +(valor * (h_extras * 2))));
    }
    
}
