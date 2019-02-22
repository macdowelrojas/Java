/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mac_rojas
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejer3 = new Scanner(System.in);
        int num = 0;
        String comodin = "";
        String salida = "";
        System.out.print("Ingrese el numero:.");
        num = Integer.valueOf(ejer3.next());
        if(num >= 0 && num <=9999){
            int longitud = String.valueOf(num).length();
            comodin = String.valueOf(num);
            for(int i = (longitud); i-1 >= 0 ; i--){
                //System.out.println(dato);
                //System.out.print(comodin.subSequence(i-1, i));    
                salida = salida + (comodin.subSequence(i-1, i));
                
            }
            if(Integer.valueOf(salida) == num){
                System.out.println("Los numeros son palindromos");
            }else{
                System.out.println("Los numeros no son palindromos");
            }
            
            
        }else{
            System.out.println("solo digitos entre 0 y 9999");
        }
    }
    
}

 
