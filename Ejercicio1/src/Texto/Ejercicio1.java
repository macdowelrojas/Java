
package Texto;

import java.util.Scanner;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        float Dolares = 0;
        float Quetzales = 0;
        float Vuelto = 0;
        System.out.println("Ingrese cantidad de dinero:.");
        Quetzales = ingrese.nextFloat();
    
        System.out.println("Valor del dolar: Actual.");
        Dolares = ingrese.nextFloat();
    
        Vuelto = (Quetzales/Dolares);
        
        
        System.out.println("Total:." +Vuelto);
        
    
       
    
    }
    
}

    
