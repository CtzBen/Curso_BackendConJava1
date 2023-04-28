package poo_clasesdeutilidad_ej1;

import Entitys.Cadena;
import Services.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class POO_ClasesDeUtilidad_Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaService cs = new CadenaService();
        
        
        Cadena c = new Cadena("Mostra los tobillOs O nasheeiIi.");
        
        cs.mostrarVocales(c.getFrase());
        
        cs.mostrarVocales(cs.invertirFrase(c.getFrase()));
        String rep = leer.next();
        System.out.println("El carácter '"+rep+"' se repite "+cs.vecesRepetido(c.getFrase(), rep)+" veces.");
    }
    
}
