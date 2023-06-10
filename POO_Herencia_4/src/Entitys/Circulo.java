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
public class Circulo implements calculosFormas {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return pi*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return (pi*radio*2);
    }
    
}
