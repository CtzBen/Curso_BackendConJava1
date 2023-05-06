/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class PersonaServicioArrayList {
     private ArrayList<Persona> nuevaLista; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public PersonaServicioArrayList() {
        this.nuevaLista = new ArrayList<>(); // Creo el espacio en memoria del LISTA
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
        nuevaLista.add(new Persona(dniIngresado,edadIngresado, nombreIngresado, apellidoIngresado));     
    }

    public void imprimirTodos() {
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      
        for (Persona unitariaPersona : nuevaLista) {
            System.out.println(unitariaPersona.toString());      
        }
    }

    public void buscarElimar(String varElegido) {
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<Persona> it = nuevaLista.iterator();
        while (it.hasNext()) {
            if (it.next().getApellido().equals(varElegido)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
                System.out.println("Eliminado correctamente.");
            }
        }
    }
    
    public void ordenarAaZApellido(){
        //Dejo estructura modelo comentada // Para que entiendan que dato reemplazo a cual en este ejemplpo
  //     Collections.sort(NombreLista, 
   //  (ClaseAtributos objeto1, ClaseAtributos objeto2) -> objeto1.getAtriutoPaComparar().compareTo(objeto2.getAtriutoPaComparar()));    
      
   Collections.sort(nuevaLista, 
(Persona objeto1, Persona objeto2) -> objeto1.getApellido().compareTo(objeto2.getApellido()));    
   
    }
}
