package Services;

import Entitys.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class ElectrodomesticoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    
    public boolean comprobarConsumoEnergetico(char letra){
        
        switch (letra) {
            case 'A':
                
                break;
            case 'B':
                
                break;
            case 'C':
                
                break;
            case 'D':
                
                break;
            case 'E':
                
                break;
            case 'F':
                
                break;
            default:
                return false;
        }
        
        return true;
    }
    
//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    
    public boolean comprobarColor(String color){

        switch (color) {
            case "BLANCO":
                
                
                break;
            case "NEGRO":
                
                
                break;
            case "ROJO":
                
                
                break;
            case "AZUL":
                
                
                break;
            case "GRIS":
                
                
                break;
            default:
                return false;
        }
        return true;
    }
    
    public Electrodomestico crearElectrodomestico(){
        
        String color;
        double precio,peso;
        char consumo;
        
        
        System.out.println("Ingrese el color del electrodoméstico: ");
        color = leer.next().toUpperCase();
        
        System.out.println("Ingrese el consumo del electrodoméstico(entre A y F):");
        consumo = leer.next().toUpperCase().charAt(0);
        
        System.out.println("Ingrese el peso del electrodoméstico (en kg): ");
        peso = leer.nextDouble();
    
        if (!comprobarConsumoEnergetico(consumo)) {
            consumo = 'F';
        }
        
        if(!comprobarColor(color)){
            color = "BLANCO";
        }
        
        return new Electrodomestico(precioFinal(consumo,peso),color,consumo,peso);
    }

    public double precioFinal(char consumo, double peso) {
        double precioFinal = 1000;
        
        
            switch (consumo) {
              case 'A':
                  precioFinal += 1000;
                  break;
              case 'B':
                  precioFinal += 800;
                  break;
              case 'C':
                  precioFinal += 600;
                  break;
              case 'D':
                  precioFinal += 500;
                  break;
              case 'E':
                  precioFinal += 300;
                  break;
              case 'F':
                  precioFinal += 100;
                  break;
          }
        
            if (peso >= 1 && peso <= 19) {
                precioFinal += 100;
            } 
            if (peso >= 20 && peso <= 49) {
                precioFinal += 500;
            } 
            if (peso >= 50 && peso <= 79) {
                precioFinal += 800;
            } 
            if (peso >= 80) {
                precioFinal += 1000;
            } 
        
          
        return precioFinal;
    }
    
}
