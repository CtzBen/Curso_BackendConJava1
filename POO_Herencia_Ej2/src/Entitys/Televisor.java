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
public class Televisor extends Electrodomestico{
//    atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
}
