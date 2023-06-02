package poo_relaciones_ej3;

import Entitys.Baraja;

/**
 *
 * @author Costanzo
 */
public class POO_Relaciones_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.llenarBaraja();
        baraja.mostrarBaraja();
        baraja.sacar8y9();
        baraja.mostrarBaraja();
        baraja.barajar();
        baraja.mostrarBaraja();
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
        Baraja mano = new Baraja();
        int cant;
        cant = 6;
        for (int i = 0; i < 10; i++) {
            baraja.darCartas(mano,cant);
            baraja.mostrarBaraja();
            System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
            mano.mostrarBaraja();
            System.out.println("Cartas disponibles: " + mano.cartasDisponibles());
        }
    }
    
}
