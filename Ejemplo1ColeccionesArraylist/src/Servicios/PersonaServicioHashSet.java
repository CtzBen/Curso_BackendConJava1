package Servicios;
import Entidad.Persona;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Costanzo
 */
public class PersonaServicioHashSet {
    private HashSet<Persona> nuevoMapa; // Creo el mapa
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
        
    //Esta es una muy buena practica
    public PersonaServicioHashSet() {
       this.nuevoMapa = new HashSet<>(); // Creo el espacio en memoria del LISTAS
       this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    //Metodo para que el usuario carague los DATOS de forma manual
    public void cargarPersonas(){
      String nombreIngresado;
        do {
        System.out.println("Ingrese el nombre");
        nombreIngresado = leer.next().toUpperCase().trim();
        }while ((nombreIngresado.equalsIgnoreCase("")));
        
        String apellidoIngresado;
        do {
        System.out.println("Ingrese el apellido");
        apellidoIngresado = leer.next().toUpperCase().trim();
        }while ((apellidoIngresado.equalsIgnoreCase("")));
     
        Integer dniIngresado;
         do {
        System.out.println("Ingrese el DNI");
        dniIngresado = Integer.parseInt(leer.next());
        } while(!(dniIngresado > 9999999));
         
        Integer edadIngresado;
        do {
        System.out.println("Ingrese el Edad");
        edadIngresado = Integer.parseInt(leer.next());
        } while(!(edadIngresado > 0 && edadIngresado < 120));
        nuevoMapa.add(new Persona(dniIngresado,edadIngresado,nombreIngresado,apellidoIngresado));   //Si no creo mi HasCode en"Persona" no encontrara duplicidad porque su parametro es espacio de mmoria    
    }
    
    public void imprimirTodos(){
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones
        for (Persona unitariaPersona : nuevoMapa) {
            System.out.println(unitariaPersona.toString());
        }
    }

    
     public void buscarElimar(String varElegido) {
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<Persona> it = nuevoMapa.iterator();
        
        //Devuelve verdadero o falso si todavía queda un elemento en la lista o mapa
        while (it.hasNext()) {
            if (it.next().getApellido().equals(varElegido)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
                System.out.println("Eliminado correctamente.");
            }
        }
    }
}
