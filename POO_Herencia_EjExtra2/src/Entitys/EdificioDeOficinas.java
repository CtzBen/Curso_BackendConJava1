/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

/**
 *
 * @author Costanzo
 */
public class EdificioDeOficinas extends Edificio{
//    Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.
    
    int oficinasPorPiso, personasPorOficina, pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinasPorPiso, int personasPorOficina, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinasPorPiso = oficinasPorPiso;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
    }

    public int getOficinasPorPiso() {
        return oficinasPorPiso;
    }

    public void setOficinasPorPiso(int oficinasPorPiso) {
        this.oficinasPorPiso = oficinasPorPiso;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    
    @Override
    public double calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho*largo*alto;
    }
    
    
}
