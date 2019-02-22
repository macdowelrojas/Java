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
public class Ejercicio_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
         /*10.Un constructor sabe que necesita 0,5 metros cúbicos de 
        arena por metro cuadrado de revoque a realizar.
        Hacer un programa donde ingrese las medidas de una pared (largo y alto) 
        expresada en metros y obtenga la cantidad de arena necesaria para revocarla*/
        Scanner entrada = new Scanner(System.in);
        
        float M_CUBICO = (float)0.5;
        float largo = 0;
        float ancho = 0;
        
        System.out.print("Ingrese largo de la pared en metros:.");
        largo = Float.valueOf(entrada.next());
       
        System.out.print("Ingrese ancho de la pared en metros:.");
        ancho =  Float.valueOf(entrada.next());
        
        System.out.print("La arena requerida es de:."+ ((largo * ancho )*M_CUBICO));
    }
    
}
