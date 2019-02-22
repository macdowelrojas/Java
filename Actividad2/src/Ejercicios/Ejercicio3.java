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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /*3.Calcular el monto a pagar en una cabina de Internet si 
        el costo por hora es de Bs/.1,5 y por cada 5 horas te dan 
       una hora de promocion gratis.*/
        
        double PRECIO_HORA = 1.5;
        int horas = 0;
        int h_gratis = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas utilizadas:.");
        horas = Integer.valueOf(entrada.next());
        
        h_gratis = (horas / 5);
        System.out.print("Tu total a pagar es de:." + (horas * PRECIO_HORA));
        System.out.print("por el uso de internet obtuviste "+ h_gratis + " horas gratis");
        
    }
    
}
