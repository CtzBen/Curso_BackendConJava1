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
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
 * y luego codifique la palabra o frase ingresada de la siguiente manera:
 * Cada vocal se reemplaza por el carácter que se indica en la tabla
 * y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.
* Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
public class Guia4Subprogramas_Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String secuencia;
        
        System.out.println("Ingrese una secuencia de caracteres, ya sea una frase o letras aleatorias: ");
        
        secuencia = leer.nextLine();
        
        secuencia = codificar(secuencia);
        System.out.println(secuencia);
    }
    

public static String codificar(String secuencia){

    String resultado = secuencia;
    
    for (int i = 0; i < secuencia.length() ; i++){
        switch (secuencia.substring(i,i+1)){
            case "a":
            case "A":   
                resultado = resultado.substring(0, i).concat("@" + resultado.substring(i+1, resultado.length()));
                break;
            case "e":
            case "E":
                resultado = resultado.substring(0, i).concat("#" + resultado.substring(i+1, resultado.length()));
                break;
            case "i":
            case "I":
                resultado = resultado.substring(0, i).concat("$" + resultado.substring(i+1, resultado.length()));
                break;
            case "o":
            case "O":
                resultado = resultado.substring(0, i).concat("%" + resultado.substring(i+1, resultado.length()));
                break;
            case "u":
            case "U":
                resultado = resultado.substring(0, i).concat("*" + resultado.substring(i+1, resultado.length()));
                break;    
        }
    }


    
    
    

    return resultado;
}

}
