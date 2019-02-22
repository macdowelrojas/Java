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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        7.En un hospital existen 3 areas: Urgencias, Pediatria y Traumotologia.
        El presupuesto anual del hospital se reparte de la siguiente manera
        URGENCIAS 37%
        PEDIATRIA 42%
        TRAUMOTOLOGIA 21%
        */
        
        Scanner entrada = new Scanner(System.in);
        
        float URGE = (float) 0.37;
        float PEDIATRA = (float) 0.42;
        float TRAUMA = (float) 0.21;
        float presupuesto = (float) 0;
        
        System.out.println("Ingrese su presupuesto:.");
        presupuesto = Float.valueOf(entrada.next());
        
        System.out.println("El presupuesto para Emergencias es de:."+(presupuesto * URGE) );
        System.out.println("El presupuesto para Pediatria es de:."+(presupuesto * PEDIATRA) );
        System.out.println("El presupuesto para Traumatologia es de:."+(presupuesto * TRAUMA) );
    }
    
}
