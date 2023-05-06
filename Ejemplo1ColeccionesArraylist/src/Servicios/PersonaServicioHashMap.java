package Servicios;

/**
 *
 * @author Costanzo
 */

import Entidad.Persona;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class PersonaServicioHashMap {
    //Entre <> Primer termino, digo que tipo de dato es la llave, segundo termino tipo de dato que es el OBJETO a guardar
    private HashMap<Integer,Persona> nuevoMapa; // Creo EL MAPA
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public PersonaServicioHashMap() {
        this.nuevoMapa = new HashMap<>(); // Creo el espacio en memoria del MAPA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario carague los DATOS de forma manual
    public void cargarPersonas() {
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
        // Te este modo agrego elementos a un mapa. Observar que el primer termino se corresponde a la KEY
        nuevoMapa.put(dniIngresado,new Persona(dniIngresado,edadIngresado, nombreIngresado, apellidoIngresado));      
    }

    public void imprimirTodos() {
   // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
       for (Map.Entry<Integer, Persona> entry : nuevoMapa.entrySet()) {
            System.out.println("Documento=" + entry.getKey() + ", Datos de la Persona" + entry.getValue());
        }
   }
    

    public void buscarElimar(Integer varElegido) {
         nuevoMapa.remove(varElegido);   
         System.out.println("Eliminado correctamente.");
    }
    
}