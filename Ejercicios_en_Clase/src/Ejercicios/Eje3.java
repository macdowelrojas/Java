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
public class Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        int aux = 0; 
        int num_alreves = 0; 
        int digito = 0;
        
        do {
            System.out.print("Introduce un número:.");
            numero = entrada.nextInt();
        } while (numero < 10);

        aux = numero;
        while (aux!=0){
            digito = aux % 10;
            num_alreves=num_alreves * 10 + digito;
            aux = aux / 10;
        }
 
        if(numero == num_alreves){
            System.out.println("EL NUMERO ES CAPICÙA");
        }else{
            System.out.println("EL NUMERO NO ES CAPICÙA");
        }
    }
}
        
