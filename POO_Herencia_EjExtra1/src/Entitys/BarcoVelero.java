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
public class BarcoVelero extends Barco {

    int mastiles;
    
    public BarcoVelero() {
    }

    public BarcoVelero(int mastiles, String matricula, double eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "BarcoVelero{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + " mastiles=" + mastiles + '}';
    }
    
    @Override
    public double calcularModulo(){
        return eslora*10+mastiles;
    }

    
    
    
}
