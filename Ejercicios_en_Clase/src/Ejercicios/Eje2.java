/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Calendar.Builder;
import java.util.Scanner;

/**
 *
 * @author mac_rojas
 */
public class Eje2 {
  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        String numero = "";
        String numero_al_revez = "";
        
         System.out.println("Ingrese un numero ");
        numero = entrada.next();
        
        for (int i = numero.length() -1; i >= 0 ; i--)
            numero_al_revez = numero_al_revez + numero.charAt(i);
        System.out.println(numero_al_revez);        
      
        
        
    }
}    