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
public class Ejercicio_o {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        25.Elabore un programa que lea 2 numeros enteros positivos
        y que muestre la suma y la multiplicacion de estos
        */
        
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        
        System.out.println("Ingrese el primer numero:.");
        numero1 = Integer.valueOf(entrada.next());
        
        System.out.println("ingrese el segundo numero");
        numero2 = Integer.valueOf(entrada.next());
        
        if (numero1 >= 0 && numero2 >= 0)
        {
            System.out.println("La suma es de:."+(numero1+numero2));
            System.out.println("La multiplicacion es de:."+(numero1*numero2));
        }
        else{
            System.out.println("POR FAVOR INGRESE UN NUMERO POSITIVO");
        }
    }
    
}
