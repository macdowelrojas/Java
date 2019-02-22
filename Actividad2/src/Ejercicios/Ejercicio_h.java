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
public class Ejercicio_h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           /* 17.Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, 
        el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
        tres ventas que realiza en el mes y el total que recibirá en el mes 
        tomando en cuenta su sueldo base y comisiones.*/

        Scanner entrada = new Scanner(System.in);
        
        float PORCENTAJE = (float) 0.10;
        float salario = (float) 0;
        float v1 = (float) 0;
        float v2 = (float) 0;
        float v3 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese su sueldo base:");
        salario = Float.valueOf(entrada.next());
        
        System.out.println("Ingrese valor de su primera venta:");
        v1 = Float.valueOf(entrada.next());
        System.out.println("Ingrese valor de su segunda venta:");
        v2 = Float.valueOf(entrada.next());
        System.out.println("Ingrese valor de su tercera venta:");
        v3 = Float.valueOf(entrada.next());
        
        comision = (v1 + v2 + v3) * PORCENTAJE;
        
        System.out.println("Su sueldo es de: " + salario);
        System.out.println("Su comision es de: "+ comision);
        System.out.println("El Total es de:"+ (salario+comision));
        
        
    }
    
}
