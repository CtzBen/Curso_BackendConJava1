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
public class BarcoYate extends BarcoAMotor{

    int camarotes;

    public BarcoYate() {
    }

    public BarcoYate(int camarotes, double potenciaCV, String matricula, double eslora, int añoFabricacion) {
        super(potenciaCV, matricula, eslora, añoFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "BarcoYate{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + " potenciaCV=" + potenciaCV +" camarotes=" + camarotes + '}';
    }

    
      @Override
    public double calcularModulo(){
        return eslora*10+potenciaCV+camarotes;
    }
    
}
