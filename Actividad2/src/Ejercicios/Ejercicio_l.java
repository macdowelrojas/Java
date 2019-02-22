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
public class Ejercicio_l {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        21.Calcular el nuevo salario de un obrero si obtuvo un incremento del 25%
        sobre su salario anterior
        */
        
         Scanner entrada = new Scanner(System.in);
        float PORCENTAJE = (float) 0.25;
        float salario = 0;
        float nuevo_salario = 0;
        
        System.out.println("Ingrese su sueldo anterior para calcular su aumento");
        
        salario = Float.valueOf(entrada.next());
        nuevo_salario = salario*PORCENTAJE;
        System.out.println("su nuevo sueldo es de "+(salario+nuevo_salario));
        
    }
    
}
