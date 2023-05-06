/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author Costanzo
 */

public class Persona  {
    //DECLARO LOS ATRIBUTOS
    private Integer dni;
    private Integer edad;
    private String nombre;
    private String apellido;

    //DECLARO LOS CONSTRUCTORES NECESARIOS
    public Persona(Integer dni, Integer edad, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {
    }

    //DECLARO GETTER Y SETTER
    public Integer getDni() {
        return dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //DEJO DEFINIDO EL METODO PARA IMPRIMIR LOS OBJETOS
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ",edad= "+ edad +", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

     @Override // Lo creo para definir que parametro utiliza para no repetir datos, en este casso DNI
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//Lo creo para definir que parametro utiliza para no repetir datos,en este casso DNI
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

 
}

