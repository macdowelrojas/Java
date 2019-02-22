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
public class Ejercicio_ñ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        24.Desplegar el peso dado en kilos de una persona en gramos, libras y toneladas
        */
        
        Scanner entrada = new Scanner(System.in);
        
        float peso = 0;
        System.out.println("Ingrese el peso en kilos");
        peso = Float.valueOf(entrada.next());
        
        System.out.println("el peso en gramos es de:."+(peso*1000));
        System.out.println("el peso en libras es de:."+(peso*2.20462));
        System.out.println("el peso en toneladas es de:."+(peso*0.001));
    }
    
}
