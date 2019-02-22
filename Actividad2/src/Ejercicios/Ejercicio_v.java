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
public class Ejercicio_v {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        32.Elabore un programa que realice la conversion de cm. a pulgadas.
        Donde 1cm = 0.39737 pulgadas
        */
        
        Scanner entrada = new Scanner(System.in);
        
        float valor = 0;
        double  PULGADAS = (float) 0.39737; 
        double Total = 0;
        
        System.out.println("CONVERSION DE CM A PULGADAS");
        System.out.println("Ingrese un valor que quiere convertir:.");
        valor = Float.valueOf(entrada.next());
        
        Total = valor * PULGADAS;
        
        System.out.println("El resultado es de: " + Total);
        
        
    }
    
}
