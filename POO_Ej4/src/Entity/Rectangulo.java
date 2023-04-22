/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
       public void crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo en cm: ");
        this.base = Double.parseDouble(leer.nextLine());
        System.out.println("Ingrese la altura del rectángulo en cm: ");
        this.altura = Double.parseDouble(leer.nextLine());
    }
      
    public double superficie(){
        return this.base*this.altura;
    }
    
    public double perimetro(){
        return (this.base+this.altura)*2;
    }
}
