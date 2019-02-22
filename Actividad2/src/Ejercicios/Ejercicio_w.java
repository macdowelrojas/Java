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
public class Ejercicio_w {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        33.Elabore un programa que realice la conversacion de libras a kilogramos
        Donde 1kg = 2.2046 libras
        */
        Scanner entrada = new Scanner (System.in);
        
        float libras = 0;
        double KILOGRAMOS = 2.2046;
        float total = 0;
        
        System.out.println("CONVERSION DE LIBRAS A KILOGRAMOS");
        System.out.println("Ingrese el valor que desea convertir:.");
        libras = Float.valueOf(entrada.next());
        
        total = (float) (libras * KILOGRAMOS);
        System.out.print("El resultado es de:."+total);
        
        
        
        
        
    }
    
}
