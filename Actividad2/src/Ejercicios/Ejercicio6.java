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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*6.Calcular el nuevo salario de un empleado si obtuvo un
        incremento del 8% sobre su salario actual y un descuento de 2,5% por servicios.*/
        
        Scanner entrada = new Scanner(System.in);
        
        float AUMENTAR = (float) 0.08;
        float DESCUENTO = (float) 0.025;
        float salario = (float) 0;
        float aum_salario = (float) 0;
        float desc_salario = (float) 0;
        
        System.out.print("Ingresa tu sueldo:.");
        salario = Float.valueOf(entrada.next());
        aum_salario = salario * AUMENTAR;
        desc_salario = salario * DESCUENTO;
        System.out.print("Tu descuento es: "+ (desc_salario));
        System.out.print("Tu aumento es:" + (aum_salario));
        System.out.print("Tu sueldo actual:." + ((salario -desc_salario)+ aum_salario));
        
    }
    
}

 