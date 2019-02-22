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
public class Ejercicio_c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           /*12.calcular el nuevo salario de un empleado 
        si se le descuenta el 20% de su salario actual.*/
        Scanner entrada = new Scanner(System.in);
        
        float REBAJA =(float) 0.20;
        float salario = 0;
    
        System.out.print("Ingrese su sueldo actual:");
        salario = Float.valueOf(entrada.next());
        System.out.print("Su nuevo sueldo es de: "+ (salario - (salario * REBAJA)));
    }
    
}
