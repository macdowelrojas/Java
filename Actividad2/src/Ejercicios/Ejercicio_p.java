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
public class Ejercicio_p {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        26.Elabore un programa que lea 3 numeros enteros positivos y que muestre la
        suma, de la resta y la multiplicacion de todos: El resultado debe ser siempre positivo
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int suma = 0;
        int resta = 0;
        int multi = 0;
        
        
        
        System.out.println("Ingrese el primer numero:.");
        numero1 = Integer.valueOf(entrada.next());
        
        System.out.println("Ingrese el segundo numero:.");
        numero2 = Integer.valueOf(entrada.next());
        System.out.println("Ingrese el tercer numero:.");
        
        numero3 = Integer.valueOf(entrada.next());
        
        
         suma = (numero1+numero2+numero3);
         resta = (numero1-numero2-numero3);
         multi = (numero1*numero2*numero3);
        
        if (suma > 0 && resta > 0 && multi > 0){
            System.out.println("la suma es "+suma);
            System.out.println("la resta es "+resta);
            System.out.println("la multiplicacion es "+multi);

        }
        else{
            System.out.println("Opcion Invalida");
        }
    }
    
}
