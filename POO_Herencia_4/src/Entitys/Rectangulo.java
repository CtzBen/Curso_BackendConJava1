/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import Interfaces.calculosFormas;

/**
 *
 * @author Costanzo
 */
public class Rectangulo implements calculosFormas {
    
    double ancho,alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo() {
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    
    @Override
    public double calcularArea() {
        return ancho*alto;
    }

    @Override
    public double calcularPerimetro() {
        return (ancho*2+alto*2);
    }
    
}
