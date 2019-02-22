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
public class Ejercicio_g {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 16.Suponga que un individuo desea 
        invertir su capital en un banco y desea saber cuanto dinero ganará después 
        de un año si el banco paga a razón de 2,5% mensual.*/
        Scanner entrada = new Scanner(System.in);
        
        float TASA = (float) 0.025;
        float cap = (float) 0;
        float interes = (float) 0;
        
        System.out.print("Ingresa su capital:");
        cap = Float.valueOf(entrada.next());
        interes = (cap * TASA) *12;
        
        System.out.print("Su interes es de :." + interes);
    }
    
}
