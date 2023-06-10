package poo_herencia_4;

import Entitys.Circulo;
import Entitys.Rectangulo;

/**
 *
 * @author Costanzo
 */
public class POO_Herencia_4 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);
        Rectangulo r1= new Rectangulo(2,5);
        
        System.out.println("Area del círculo: " +c1.calcularArea()+"m2");
        System.out.println("Perímetro del círculo: " +c1.calcularPerimetro()+"mts");
        System.out.println("Area del rectángulo: " +r1.calcularArea()+ "m2");
        System.out.println("Perímetro del rectángulo: " +r1.calcularPerimetro()+"mts");
    }
    
}
