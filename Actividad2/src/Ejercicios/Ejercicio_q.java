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
public class Ejercicio_q {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        27.Elabore un programa que calcule la edad exacta de una persona
        */
        Scanner entrada = new Scanner(System.in);
        int año_act = 0;
        int año_nac = 0;
        
        System.out.println("Ingrese el año actual");
        año_act = Integer.valueOf(entrada.next());
        System.out.println("Ingrese su año de nacimiento");
        año_nac = Integer.valueOf(entrada.next());
        
        int edad = (año_act-año_nac);
        if(edad > 0 && año_nac > 0 && año_act > año_nac )
        {
            System.out.println("su edad es de "+(año_act-año_nac));
        }
        else{
            System.out.println("la fecha nacimiento es negativa");
        }
        
        
        
    }
    
}
