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
public class Ejercicio_f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /*15.Obtener la edad de una persona en meses, si se ingresa su edad en años y meses. 
        Ejemplo: Ingresado 3 años 4 meses debe mostrar  40 meses*/

        Scanner entrada = new Scanner(System.in);
        
        int año = 0;
        int mes = 0;
        int edad = 0;
        
        System.out.print("Ingrese años ");
        año = Integer.valueOf(entrada.next());
        System.out.print("Ingrese meses ");
        mes = Integer.valueOf(entrada.next());
        edad = (año * 12) + mes;
        System.out.print("Su edad en meses es de:."+ edad);
    }
    
}
