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
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejer4 = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0;
        System.out.print("Ingrese el dia:.");
        dia = Integer.valueOf(ejer4.next());
        System.out.print("Ingrese el mes:.");
        mes = Integer.valueOf(ejer4.next());
        System.out.print("Ingrese el año:.");
        año = Integer.valueOf(ejer4.next());
        
        if(año > 0){
            if(mes > 0 && mes < 13){
                if(dia > 0 && dia < 30){
                    System.out.print("La fecha:."+dia+"-"+mes+"-"+año+" es correcta:.");
                }else{
                    System.out.print("El dia es incorrecto:.");
                }
            }else{
                    System.out.print("El mes es incorrecto:.");
                }
        }else{
            System.out.print("El año es incorrecto:.");
        }
        
        
    }
    
}


