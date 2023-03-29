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
public class Guia4Subprogramas_Ejercicio4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número para identificar si es primo o no: ");
        n = leer.nextInt();
        System.out.println("¿El número es primo? Respuesta: "+ EsPrimo(n));
    }
    public static boolean EsPrimo(int n){
        boolean r = true;
        
        for (int i = 2; i < n-1; i++) {
            if (n%i == 0) {
                r = false;
                break;
            }
        }
        
        return r;
    }
}
