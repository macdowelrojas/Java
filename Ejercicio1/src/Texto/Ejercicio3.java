
package Texto;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        Scanner escriba = new Scanner (System.in);
        int seleccionar = 0;
        float can_Dolar = 0;
        float can_Quetz = 0;
        float val_Quetz = 0;
        float T_Quetz = 0;
        float Total = 0;
        System.out.println("Convertir de Dolar a Quetzal (1) \n  COnvertir Quetzal a Dolar (2)");
        seleccionar = escriba.nextInt();
        
        if (seleccionar == 1)
        {
            System.out.println("Escriba la cantidad en dolares:");
            can_Dolar = Float.valueOf(escriba.next());
            System.out.println("Escriba el valor del dolar actualmente:");
            val_Quetz = Float.valueOf(escriba.next());
            T_Quetz = can_Dolar * val_Quetz;
            System.out.println("El total en Quetzales es de:." +T_Quetz);
            
        }
        else if (seleccionar ==2)
            {
                
                System.out.println("Escriba el valor del dolar actualmente:");
                can_Dolar = Float.valueOf(escriba.next());
                System.out.println("Escriba la cantidad en Quetzales:");
                can_Quetz = Float.valueOf(escriba.next());
                Total =(can_Quetz/can_Dolar);
                System.out.println("La cantidad en dolares es de:" +Total);
            }
            else
            {
               System.out.println("Opcion Invalida");
            }
    }
    
}
