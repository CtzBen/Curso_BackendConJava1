/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitys.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class EdificioDeOficinasService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     public EdificioDeOficinas crearOficinas(){
        double ancho,largo,alto;
        int oficinasPorPiso, personasPorOficina,pisos;
        System.out.println("Ingrese el ancho, alto y largo del edificio: ");
        ancho = leer.nextDouble();
        alto = leer.nextDouble();
        largo = leer.nextDouble();
        System.out.println("Numero de oficinas por piso: ");
        oficinasPorPiso = leer.nextInt();
        System.out.println("Personas por oficina:");
        personasPorOficina = leer.nextInt();
        System.out.println("Numero de pisos: ");
        pisos = leer.nextInt();
        
        return new EdificioDeOficinas( oficinasPorPiso,  personasPorOficina,  pisos,  ancho,  alto,  largo);
    }
    
    public void cantPersonas(EdificioDeOficinas office){
        System.out.println("Cantidad de personas por piso: "+ (office.getPersonasPorOficina()*office.getOficinasPorPiso()));
        System.out.println("Cantidad de personas en el edificio: "+ (office.getPersonasPorOficina()*office.getOficinasPorPiso())*office.getPisos()); 
    }
}
