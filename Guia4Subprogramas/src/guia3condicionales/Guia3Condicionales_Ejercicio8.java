/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3condicionales;

import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class Guia3Condicionales_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner leer = new Scanner(System.in);
        String caracter;
        int size;
        
        System.out.println("Ingrese un caracter: ");
        caracter = leer.nextLine().substring(0, 1);
        
        System.out.println("Ingrese el tamaño del cuadrado: ");
        size = leer.nextInt();
        
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print(caracter);
        }
            System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print(caracter);
            for (int j = 0; j < size-2; j++) {
                System.out.print(" ");
            }
            System.out.print(caracter);
            System.out.println("");
        }
         for (int i = 0; i < size; i++) {
            System.out.print(caracter);
        }
        System.out.println("");
        
    }
}
