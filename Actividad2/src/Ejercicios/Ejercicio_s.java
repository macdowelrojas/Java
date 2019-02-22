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
public class Ejercicio_s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        29.Calcular el promedio de 3 notas, si el promedio es mayor que 9.5 mostrar
        aprobado caso contrario desaprobado. Pero si la nota es mayor que 16
        redondear su promedio final a 20
        */
        
         Scanner entrada = new Scanner(System.in);
        
         float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float promedio = 0;
        
        System.out.println("ingresa nota1");
        nota1 = Float.valueOf(entrada.next());
        System.out.println("ingresa nota2");
        nota2 = Float.valueOf(entrada.next());
        System.out.println("ingresa nota3");
        nota3 = Float.valueOf(entrada.next());
        promedio = (nota1+nota2+nota3)/3;
        
        if(promedio >= 16){
            System.out.println(promedio);
            System.out.println("el promedio total es 20 gano");
            
        }
        else if(promedio >= 9.5){
            System.out.println("aprobado");
        }
        else{
            System.out.println("desaprobado");
        }
    }
    
}
