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
public class Ejercicio_j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 19.Un alumno desea saber cual ser谩 su calificaci贸n final en la materia 
        de Algoritmos. Dicha calificaci贸n se compone de tres ex谩menes parciales.*/
        Scanner entrada = new Scanner(System.in);

        int nt1 = 0;
        int nt2 = 0;
        int nt3 = 0;
        int nota_final = 0;
        
        System.out.println("Ingresa primera nota:.");
        nt1 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa segunda nota:.");
        nt2 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa tercera nota:.");
        nt3 = Integer.valueOf(entrada.next());
        
        nota_final = nt1 + nt2 + nt3;
        System.out.println("Tu nota final es:"+nota_final);
    }
    
}
