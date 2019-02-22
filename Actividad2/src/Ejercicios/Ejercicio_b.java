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
public class Ejercicio_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /*11.Escriba un programa donde se ingrese el tiempo necesario para un cierto 
        proceso en horas, minutos y segundos. Se calcule el costo total del proceso sabiendo 
        que el costo por segundo es  Bs0,25.*/
        Scanner entrada = new Scanner(System.in);
        
        float segundos = (float ) 0;
        float minutos = (float ) 0;
        float horas = (float ) 0;
        float PRE_SEG = (float ) 0.25;
        float tiempo_s = (float ) 0;
        
        System.out.print("Ingresa la cantidad de horas:.");
        horas = Float.valueOf(entrada.next());
        
        System.out.print("Ingresa la cantidad de minutos:.");
        minutos = Float.valueOf(entrada.next());
        
        System.out.print("Ingresa la cantidad de segundos:.");
        segundos = Float.valueOf(entrada.next());
        tiempo_s = segundos + (minutos * 60 )+ ((horas * 60)*60) ;
        
        System.out.print("El costo es:."+ (tiempo_s * PRE_SEG));
    }
    
}
