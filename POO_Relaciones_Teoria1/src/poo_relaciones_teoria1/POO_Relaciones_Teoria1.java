
package poo_relaciones_teoria1;

import Entitys.Dni;
import Entitys.Persona;

/**
 *
 * @author Costanzo
 */
public class POO_Relaciones_Teoria1 {


    public static void main(String[] args) {
       Persona persona1 = new Persona();
       persona1.setNombre("Benjamín");
       persona1.setApellido("Costanzo");
       Dni dni = new Dni("BC", 44781435);
       persona1.setDni(dni);
       System.out.println(persona1.toString());
       System.out.println(persona1.getDni().getNumero());
       
    }
    
}
