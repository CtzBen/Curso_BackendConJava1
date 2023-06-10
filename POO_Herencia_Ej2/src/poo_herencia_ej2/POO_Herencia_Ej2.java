package poo_herencia_ej2;

import Entitys.Electrodomestico;
import Entitys.Lavadora;
import Entitys.Televisor;
import Services.LavadoraService;
import Services.TelevisorService;
import static com.sun.org.apache.bcel.internal.Repository.instanceOf;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class POO_Herencia_Ej2 {

    public static void main(String[] args) {
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico> compra = new ArrayList<>();
        
//        Lavadora lavadora1 = ls.crearLavadora();
//        Televisor televisor1 = ts.crearTelevisor();
        
        String ax;
        for (int i = 0; i < 1; i++) {
            System.out.println("Qué electrodomestico agregar a la compra? (Televisor o Lavadora):");
            ax = leer.next().toUpperCase();
                      
            switch (ax) {
                case "TELEVISOR":
                    compra.add(ts.crearTelevisor());
                    break;
                case "LAVADORA":
                    compra.add(ls.crearLavadora());  
                break;
        }
            
            
        }
        double suma = 0;
        for (int i = 0; i < 1; i++) {
            
            System.out.println("El precio del electrodoméstico " + i + " es de $" + compra.get(i).getPrecio());
            suma += compra.get(i).getPrecio();
            
        }
        
        System.out.println("El precio final de la compra es de $" + suma);
        
        System.out.println(compra.get(0).toString());
    }
    
}
