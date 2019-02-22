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
public class Ejercicio_u {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        31.Hacer un programa que halle el area de un circulo
        */
        
         Scanner entrada = new Scanner(System.in);
        float PI = (float) 3.1416;
        float radio = 0;
        float area = 0;
        
        System.out.println("CALCULAR AREA DE UN CIRCULO");
        System.out.println("Ingrese el radio de un circulo:.");
        radio = Float.valueOf(entrada.next());
        
        area = (PI*(radio*radio));
        
        System.out.println("El area del circulo es de:."+area);
        
    }
    
}
