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
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejer5 = new Scanner(System.in);
        int dia = 0, mes = 0, año = 0;
        System.out.print("Ingrese el dia:.");
        dia = Integer.valueOf(ejer5.next());
        System.out.print("Ingrese el mes:.");
        mes = Integer.valueOf(ejer5.next());
        System.out.print("Ingrese el año:.");
        año = Integer.valueOf(ejer5.next());
        
        if(año > 0){
            if(mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 0 && dia <= 31){
                    System.out.print("La fecha:."+dia+"-"+mes+"-"+año+" es correcta (meses de 31 dias)");
                }else{
                    System.out.print("dia invalido");
                }
            }else if(mes == 2){
                if(dia > 0 && dia <= 28){
                    System.out.print("La fecha:."+dia+"-"+mes+"-"+año+" es correcta (febrero)");
                }else{
                    System.out.print("dia invalido");
                }
            }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia > 0 && dia <= 30){
                    System.out.print("La fecha:."+dia+"-"+mes+"-"+año+" es correcta (meses de 30 dias)");
                }else{
                    System.out.print("dia invalido");
                }
            }else{
                System.out.print("el mes es invalido");
            }
        }else{
            System.out.print("El año es incorrecto");
        }
    }
    
}
  