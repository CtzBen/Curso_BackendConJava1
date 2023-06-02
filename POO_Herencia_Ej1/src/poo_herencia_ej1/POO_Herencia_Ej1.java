package poo_herencia_ej1;

import Entitys.Animal;
import Entitys.Caballo;
import Entitys.Gato;
import Entitys.Perro;

/**
 *
 * @author Costanzo
 */
public class POO_Herencia_Ej1 {

    public static void main(String[] args) {
        Animal perro = new Perro("Pepe","Carne","caniche",5);
        perro.alimentarse();
        
        Animal perro2 = new Perro("Teddy","Croquetas", "Chihuahua", 10);
        perro2.alimentarse();
        
        Animal gato = new Gato("Pelusa","Galletitas", "Siamés", 10);
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark","Pasto", "Fino", 10);
        caballo.alimentarse();
        
        
        
    }
    
}
