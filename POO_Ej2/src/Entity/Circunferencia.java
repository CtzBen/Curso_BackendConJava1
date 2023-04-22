package Entity;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio = Double.parseDouble(leer.nextLine());
        
    }
    
    public double area(){
        double Area = Math.pow(3.1416*this.radio,2);
        return Area;
    }
    
    public double perimetro(){
        double Perimetro = 2*3.1416*this.radio;
        return Perimetro;
    }
    
}
