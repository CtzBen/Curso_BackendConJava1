/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4subprogramas;

import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class Guia4Subprogramas_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float a,b,resultado;
        System.out.println("Ingrese 2 números: ");
        a = leer.nextFloat();
        b = leer.nextFloat();
        
        System.out.println("Seleccione una operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        switch (leer.nextInt()) {
            case 1:
                System.out.println(sumar(a,b));
                break;
            case 2:
                System.out.println(restar(a,b));
                break;
            case 3:
                System.out.println(multiplicar(a,b));               
                break;
            case 4:
                System.out.println(dividir(a,b));               
                break;
        }
    }   
  
    public static float sumar(float a,float b){

        return a+b;
    }
    public static float restar(float a,float b){

        return a-b;
    }
    public static float multiplicar(float a,float b){

        return a*b;
    }
    public static float dividir(float a,float b){

        return a/b;
    }
}
