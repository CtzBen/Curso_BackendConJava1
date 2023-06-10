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
public class BarcoAMotor extends Barco{
    double potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(double potenciaCV, String matricula, double eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion +" potenciaCV=" + potenciaCV + '}';
    }
    
      @Override
    public double calcularModulo(){
        return eslora*10+potenciaCV;
    }
}
