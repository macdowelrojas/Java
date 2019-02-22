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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*2.Calcula el precio de un boleto de viaje,
          tomando en cuenta el n煤mero de kil贸metros que
        se van a recorrer, siendo el precio Bs/.10,50 por Km.*/
        
        Scanner entrada = new Scanner(System.in);
        double PRE_KM = 10.5;
        int kilometro = 0;
        
        System.out.print("Ingrese la cantidad de kilometros:.");
        kilometro = Integer.valueOf(entrada.next());
        System.out.print("El total a pagar es de:." + (kilometro * PRE_KM));
    }
    
}
