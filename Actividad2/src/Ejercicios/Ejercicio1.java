/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author mac_rojas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 1.Una persona recibe un préstamo de Bs. 10.000,00 de
        un banco y desea saber cuánto pagará de interés, si el 
                banco le cobra una tasa del 27% anual.*/
        
        int PRESTAMO = 10000;
        double interes =(float) PRESTAMO * 0.027;
        
        System.out.print("Calculo de interes del prestamo de 10,000 por el 27%:.");
        System.out.print("Su prestamo es de 10,000:.");
        System.out.print("El interes a pagar es de:. "+ interes);
        
    }
    
}
