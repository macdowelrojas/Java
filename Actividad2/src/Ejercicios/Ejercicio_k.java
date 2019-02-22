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
public class Ejercicio_k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          /*20.Un maestro desea saber que porcentaje de hombres 
        y que porcentaje de mujeres hay en un grupo de estudiantes*/
        Scanner entrada = new Scanner(System.in);

        int porcentaje_hombres = 0;
        int porcentaje_mujeres = 0;
        int total = 0;
        
        System.out.print("Ingresa la cantidad de hombres:");
        porcentaje_hombres = Integer.valueOf(entrada.next());
        System.out.print("Ingresa la cantidad de mujeres:");
        porcentaje_mujeres = Integer.valueOf(entrada.next());
        
        total = porcentaje_hombres + porcentaje_mujeres;
        
        System.out.print("El porcentaje de mujeres es de:" + ((porcentaje_mujeres *100) / total));
        System.out.print("El porcentaje de hombres es de:" + ((porcentaje_hombres *100) / total));
    }
    
}
