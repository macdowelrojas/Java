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
public class Ejercicio_i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          /*18.Una tienda ofrece un descuento del 15% sobre el total de la compra
        y un cliente desea saber cuanto deberá pagar finalmente por su compra.*/

        Scanner entrada = new Scanner(System.in);
       
        float PORCENTAJE = (float) 0.15;
        float v_compra = 0;
        float rebaja = 0;
        float total = 0;
        
        System.out.print("Ingrese valor de su compra:");
        v_compra = Float.valueOf(entrada.next());
        
        rebaja = v_compra * PORCENTAJE;
        System.out.print("Su descuento es de:"+ rebaja);
        
        total = v_compra - rebaja;
        System.out.print("Su total a pagar es de:" + total );
    }
    
}
