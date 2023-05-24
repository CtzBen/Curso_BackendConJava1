package poo_colecciones_ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class POO_Colecciones_Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList<>();
        String continuar;
        
        do {
            System.out.println("Ingrese una raza de perro:");
            razas.add(leer.next().toUpperCase());
            System.out.println("¿Desea agregar más razas a la lista? (Si/No):");
            continuar = leer.next().toUpperCase();
        } while (continuar.equals("SI"));
        
        System.out.println(razas.toString());
        
        System.out.println("¿Desea eliminar una raza de la lista? (Si/No):");
        continuar = leer.next().toUpperCase();
        if (continuar.equals("SI")){
            System.out.println("¿Cuál?:");
            String r = leer.next().toUpperCase();
            boolean razaEncontrada = false;
            Iterator<String> it = razas.iterator();
            while (it.hasNext()) {
                if (it.next().equals(r)) {
                    it.remove();
                    razaEncontrada = true;
                }
            }
            if (razaEncontrada) {
                System.out.println("Raza eliminada correctamente de la lista.");
                System.out.println(razas.toString());
            } else {
                System.out.println("Raza a eliminar no encontrada.");
            }
        }
    }
    
}
