
package poo_relaciones_ej1;

import Entitys.Perro;
import Entitys.Persona;

/**
 *
 * @author Costanzo
 */
public class POO_Relaciones_Ej1 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Benjamín","Costanzo",20,44781435);
        Persona persona2 = new Persona("Fabricio","Costanzo",16,45603435);
        
        Perro perro1 = new Perro("Ruso","Felino","Chiquito",3);
        Perro perro2 = new Perro("Tito","Black Retriever","Grandote",1);
        
        persona1.setPerro(perro2);
        persona2.setPerro(perro1);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
    }
    
}
