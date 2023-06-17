/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_excepciones_ej2;

import Entitys.BornTofAil;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class POO_Excepciones_Ej2 {

    /*
     Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Insert your desired pain slots C:");
        BornTofAil you = new BornTofAil(new String[leer.nextInt()]);
        
        
        System.out.println("Now indicate how much pain do you want to handle... Or try to :).");
        try {
            you.sufferingIsNotEndless(leer.nextInt());

            
            System.out.println("You made it! :D");            
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        
        System.out.println("pipipipi");
    }
    
}
