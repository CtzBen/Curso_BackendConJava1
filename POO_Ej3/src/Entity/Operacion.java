package Entity;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
      public void crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número 1: ");
        this.numero1 = Double.parseDouble(leer.nextLine());
        System.out.println("Ingrese el número 2: ");
        this.numero2 = Double.parseDouble(leer.nextLine());
    }
      
    public double sumar(){    
        return this.numero1 + this.numero2;
    }
    public double restar(){    
        return this.numero1 - this.numero2;
    }
    
    public double multiplicar(){ 
        if(this.numero1 == 0 | this.numero2 == 0){
            System.out.println("Recuerde que intenta multiplicar por 0, el resultado siempre será 0.");
            return 0;
        } 
        return this.numero1 * this.numero2;
    }
    
    public double dividir(){   
        if(this.numero1 == 0 | this.numero2 == 0){
            System.out.println("ERROR: Usted está intentando dividir por 0.");
            return 0;
        } 
        return this.numero1 / this.numero2;
    }
    
}
