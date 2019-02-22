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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /*5.Calcular el descuento y el monto a
        pagar por un medicamento cualquiera en una farmacia si todos 
        los medicamentos tienen un descuento del 35%.*/
        
        Scanner entrada = new Scanner(System.in);
        
        float DESCUENTO =(float) 0.35;
        float valor = (float) 0;
        
        System.out.print("Ingrese el precio del medicamento:.");
        valor = Integer.valueOf(entrada.next());
        System.out.print("El descuento es de: " + (valor * DESCUENTO));
        System.out.print("El pago es de: " + (valor - (valor * DESCUENTO)));
    }
    
}
