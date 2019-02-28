/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author mac_rojas
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        
        char m[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            m[j] = (char) i;
        }   
        
        String cadena = "";
        
        int selec = -1;
        
        do
        {
            System.out.println("Ingrese un numero entre 0 y"+(m.length -1));
            selec = Integer.valueOf(entrada.next());
            
            if (!(selec >= 0 && selec <= m.length -1))
            {
                System.out.println("Error, ingrese otro numero");
            }
            else
            {
                if (selec != -1)
                {
                    cadena += m[selec];
                }
            }
        } while (selec != -1);
        System.out.println(cadena);

    }
    
}
