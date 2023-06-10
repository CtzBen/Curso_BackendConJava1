/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitys.Edificio;
import Entitys.EdificioPolideportivo;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class EdificioPolideportivoService{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public EdificioPolideportivo crearPolideportivo(){
        double ancho,largo,alto;
        String nombre,tipo;
        System.out.println("Ingrese el ancho, alto y largo del edificio: ");
        ancho = leer.nextDouble();
        alto = leer.nextDouble();
        largo = leer.nextDouble();
        System.out.println("Ingrese el nombre del establecimiento: ");
        nombre = leer.next();
        System.out.println("¿Es un edificio techado o abierto?");
        tipo = leer.next();
        
        return new EdificioPolideportivo(tipo, nombre, ancho, alto, largo);
    }
    
}
