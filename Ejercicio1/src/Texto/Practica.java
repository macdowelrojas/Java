
package Texto;

import java.util.Scanner;

public class Practica {

    
    public static void main(String[] args) {
        
        Scanner entrar = new Scanner(System.in);
        
        int valor1=0;
        System.out.println("Ingrese un valor:.");
        //valor1 = entrar.next();
        valor1 = Integer.valueOf(entrar.next());
        
        float valor2 = (float) 0.0;
        System.out.println("Ingrese un valor:.");
        valor2 = Float.valueOf(entrar.next());
        
        double valor3 = 0;
        System.out.println("Ingrese un valor");
        valor3 = Double.valueOf(entrar.next());
        
        
    }
    
}
