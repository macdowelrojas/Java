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
public class Ejercicio_r {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        28.Elabore un programa que permita ingresar el precio y la cantidad
        de un articulo a comprar: Calcular el total a pagar (Considerar el IVA 9%)
        */
        Scanner entrada = new Scanner (System.in);
        
        float precio = 0;
        int cantidad = 0;
        double IVA = (float) 0.05;
        float total = 0;
        
        System.out.println("Ingrese el precio de su producto:.");
        precio = Float.valueOf(entrada.next());
        
        System.out.println("Ingrese la cantidad del producto:.");
        cantidad = Integer.valueOf(entrada.next());
        
        
        total = (float) (precio * cantidad * (IVA));
        System.out.println("El total a pagar es de:." + total);
        
        
        
        
        
    }
    
}
