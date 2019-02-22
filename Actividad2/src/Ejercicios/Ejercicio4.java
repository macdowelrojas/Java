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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*4.Calcular el cambio de monedas en dolares y euros y al ingresar cierta 
        cantidad en Bs(tipo de cambio $=2150Bs,Euros:145$)
        */
        Scanner entrada = new Scanner(System.in);
        
        int T_DOLAR = 2150;
        int T_EURO = 145;
        float pisto = (float)  0;
        
        System.out.print("Ingresa la cantidad que desea convertir:.");
        pisto = Float.valueOf(entrada.next());
        
        System.out.print("La conversion a dolares:."+(pisto * T_DOLAR));
        System.out.print("La conversion a euros es:."+(pisto * T_EURO));
    }
    
}
