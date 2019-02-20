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
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        int a = 0;
        int m = 0;
        int d = 0;
        
        System.out.println("Ingrese año");
        a = entrada.nextInt();
        System.out.println("Ingrese mes");
        m = entrada.nextInt();
        System.out.println("Ingrese dia");
        d = entrada.nextInt();
        
        if (a > 0)
        {
            if (m > 0 && m <= 12)
            {
            switch(m)
            {
                case 1:
                    if(d > 0 && d <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 2:
                    if (d > 0 && d <= 28)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 3:
                    if (d > 0 && d <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 4:
                    if (d > 0 && d <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 5:
                    if (d > 0 && d <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 6:
                    if (d > 0 && d <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 7:
                    if (d > 0 && d <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 8:
                    if (d > 0 && d <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 9:
                    if (d > 0 && d <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 10:
                    if (d > 0 && d <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 11:
                    if (d > 0 && d <= 30)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 12:
                    if (d > 0 && d <= 31)
                    {
                        System.out.println("La fecha es correcta");
                    }
                    else
                    {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                }
            }
            else
            {
                System.out.println("Fecha incorrecta");
            }
        }
        else
        {
            System.out.println("La fecha es incorrecta");
        }   
    }
    
}
