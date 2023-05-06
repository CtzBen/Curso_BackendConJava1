package ejemplo1coleccionesarraylist;

import Servicios.PersonaServicioArrayList;
import Servicios.PersonaServicioHashMap;
import Servicios.PersonaServicioHashSet;
import java.util.Scanner;

public class Ejemplo1ColeccionesArraylist {
    
    public static void main(String[] args) {
        PersonaServicioArrayList psAL = new PersonaServicioArrayList();
        PersonaServicioHashSet psHS = new PersonaServicioHashSet();
        PersonaServicioHashMap psHM = new PersonaServicioHashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cuantas personas va a cargar: ");
         byte cantidad = leer.nextByte();
         
        for (int i = 0; i < cantidad; i++) {
            psAL.cargarPersonas(); // Metodo ArrayList
            System.out.println("Persona cargada.");
        }
        System.out.println("Array list cargado.");
        System.out.println("-----------------------");
        for (int i = 0; i < cantidad; i++) {
            psHS.cargarPersonas(); // Metodo HashSet
            System.out.println("Persona cargada.");
        }
        System.out.println("HashSet cargado.");
        System.out.println("-----------------------");
        for (int i = 0; i < cantidad; i++) {
            psHM.cargarPersonas(); // Metodo HashMap
            System.out.println("Persona cargada.");
        }
        System.out.println("HashMap cargado.");
        System.out.println("-----------------------");
        //Imprime todos los objetos de la array list
        psAL.imprimirTodos();
        
        System.out.println("Ingrese el apellido de quien eliminar: ");
        String varElegido = leer.next().toUpperCase().trim();
        psAL.buscarElimar(varElegido);
        
        psAL.imprimirTodos();
        
        System.out.println("-----------------------------------");
        //Imprime todos los objetos del hash set
        psHS.imprimirTodos();
        
        System.out.println("Ingrese el apellido de quien eliminar: ");
        varElegido = leer.next().toUpperCase().trim();
        psHS.buscarElimar(varElegido);
        
        psHS.imprimirTodos();
        
        System.out.println("-----------------------------------");
        //Imprime todos los objetos del hash map
        psHM.imprimirTodos();
        
        System.out.println("Imgrese el DNI de quien eliminar: ");
        Integer dniElegido = Integer.parseInt(leer.next());
        psHM.buscarElimar(dniElegido);
        
        psHM.imprimirTodos();
        System.out.println("-----------------------------------");
        
        
        
    }
    
    
    
}
