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
public class EdificioPolideportivo extends Edificio{
    private String tipoEstablecimiento;
    private String nombre;

    public EdificioPolideportivo() {
    }

    public EdificioPolideportivo(String tipoEstablecimiento, String nombre, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.tipoEstablecimiento = tipoEstablecimiento;
        this.nombre = nombre;
    }

    public String getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }

    public void setTipoEstablecimiento(String tipoEstablecimiento) {
        this.tipoEstablecimiento = tipoEstablecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
