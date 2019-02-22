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
public class Ejercicio_m {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        22.Convertir una distancia en metros a pies y pulgadas
        */
        
        Scanner entrada = new Scanner(System.in);
        float convertidor = 0;
       
        
        System.out.println("Ingrese una distancia en metros");
        
        convertidor = Float.valueOf(entrada.next());
        System.out.println("La distancia en pulgadas es de:."+(convertidor*39.37));
        
        System.out.println("La distancia en pies es de:."+(convertidor*3.28));
    }
    
}
