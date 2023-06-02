package poo_herencia_ej2;

import Entitys.Lavadora;
import Entitys.Televisor;
import Services.LavadoraService;
import Services.TelevisorService;

/**
 *
 * @author Costanzo
 */
public class POO_Herencia_Ej2 {

    public static void main(String[] args) {
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        Lavadora lavadora1 = ls.crearLavadora();
        System.out.println("El precio final de esta lavadora es de: " + lavadora1.getPrecio());
        Televisor televisor1 = ts.crearTelevisor();
        System.out.println("El precio final de este televisor es de: " + televisor1.getPrecio());
    }
    
}
