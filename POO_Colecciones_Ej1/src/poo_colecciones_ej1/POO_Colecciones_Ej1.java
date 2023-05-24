package poo_colecciones_ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class POO_Colecciones_Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList<>();
        String continuar;
        
        do {
            System.out.println("Ingrese una raza de perro:");
            razas.add(leer.next());
            System.out.println("¿Desea agregar más razas a la lista? (Si/No).");
            continuar = leer.next().toUpperCase();
        } while (continuar.equals("SI"));
        
        System.out.println(razas.toString());
        
    }
    
}
