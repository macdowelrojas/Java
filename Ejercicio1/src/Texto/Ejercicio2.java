
package Texto;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
     
        Scanner ingrese = new Scanner(System.in);
        
        float Dolares = 0;
        float Quetzales = 0;
        float Vuelto = 0;
        System.out.println("Ingrese cantidad de dolares:.");
        Quetzales = Float.valueOf(ingrese.next());
    
        System.out.println("Cantidad en Quetzales");
        Dolares = Float.valueOf(ingrese.next());
    
        Vuelto = (Quetzales*Dolares);
        
        
        System.out.println("Total:." +Vuelto);
        
        
        
        
        
        
    }
    
}
