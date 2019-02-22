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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*8.Escriba un algoritmo que dada la cantidad de monedas 
        de 5-10-12,5-25-50 cent y 1 Bolivar, diga la cantidad de dinero 
        que se tiene en total.*/
        
        Scanner entrada = new Scanner(System.in);
        
        float MONEDA1 = (float) 0.05;
        float MONEDA2 = (float) 0.1;
        float MONEDA3 = (float) 0.12;
        float MONEDA4 = (float) 0.25;
        float MONEDA5 = (float) 0.50;
        float MONEDA6 = (float) 1;
        float moneda1 = (float) 0;
        float moneda2 = (float) 0;
        float moneda3 = (float) 0;
        float moneda4 = (float) 0;
        float moneda5 = (float) 0;
        float moneda6 = (float) 0;
        float total = (float) 0;
        System.out.print("Ingrese cantidad de monedas de 0.05:");
        
        moneda1 = Float.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de monedas de 0.10:");
        
        moneda2 = Float.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de monedas de 0.12:");
        
        moneda3 = Float.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de monedas de 0.25:");
        
        moneda4 = Float.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de monedas de 0.5:");
        
        moneda5 = Float.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de monedas de 1:");
        
        moneda6 = Float.valueOf(entrada.next());
        total = (moneda1 * MONEDA1) + (moneda2 * MONEDA2) + (moneda3 * MONEDA3) + (moneda4 * MONEDA4) + (moneda5 * MONEDA5) + (moneda6 * MONEDA6); 
        
        System.out.print("Total: "+ total);
    }
    
}
