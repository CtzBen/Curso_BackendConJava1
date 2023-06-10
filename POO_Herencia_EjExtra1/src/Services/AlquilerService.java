/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitys.Alquiler;
import Entitys.Barco;
import Entitys.BarcoAMotor;
import Entitys.BarcoVelero;
import Entitys.BarcoYate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Costanzo
 */
public class AlquilerService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alquiler crearAlquiler(){
        
        return null;
    }
    
    public Barco crearBarco(){
        
        System.out.println("Ingrese el tipo de barco: ");
        String tipoBarco = leer.next();
        
//          su matrícula, su eslora en metros y año de fabricación.

        String matricula;
        double eslora;
        int añoFabricacion;
        
        System.out.println("Ingrese la matrícula del barco: ");
        matricula = leer.next();
        System.out.println("Ingrese el tamaño de la eslora del barco (en mts): ");
        eslora = leer.nextDouble();
        System.out.println("Ingrese el año de fabricación del barco: ");
        añoFabricacion = leer.nextInt();
        
        switch (tipoBarco) {
            case "BARCO":
                return new Barco(matricula,eslora,añoFabricacion);
//                break;
            case "BARCO A MOTOR":
                System.out.println("Ingrese la potencia CV del barco a motor: ");
                double potenciaCV = leer.nextDouble();
                return new BarcoAMotor(potenciaCV,matricula,eslora,añoFabricacion);
//                break;
            case "BARCO VELERO":
                System.out.println("Ingrese la cantidad de mástiles del barco velero: ");
                int mastiles = leer.nextInt();
                return new BarcoVelero(mastiles,matricula,eslora,añoFabricacion);
//                break;
            case "BARCO YATE":
                System.out.println("Ingrese la potencia CV del yate: ");
                double potenciaCVy = leer.nextDouble();
                System.out.println("Ingrese la cantidad de camarotes del yate: ");
                int camarotes = leer.nextInt();
                return new BarcoYate(camarotes,potenciaCVy,matricula,eslora,añoFabricacion);
//                break;
        }
        return null;    
    }
    
    public double calcularPrecioFinal(Alquiler alquiler){
        // PRECIO FINAL = (DIFERENCIA DE DIAS * MODULO DEL BARCO);
        return (TimeUnit.DAYS.convert(          
                //DIFERENCIA DE DIAS
                (alquiler.getFechaDevolucion().getTime()-alquiler.getFechaAlquiler().getTime()), TimeUnit.MILLISECONDS)
                *           
                //MODULO DEL BARCO
                alquiler.getBarco().calcularModulo());
    }
}
