package Entitys;


import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Costanzo
 */
public class Baraja {

    ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
    }

    public void llenarBaraja(){
        for (int i = 1; i < 13 ; i++) {
            this.cartas.add(new Carta(i,"oro"));
            this.cartas.add(new Carta(i,"copa"));
            this.cartas.add(new Carta(i,"palo"));
            this.cartas.add(new Carta(i,"espada"));
        }
//        for (int i = 10; i < 13 ; i++) {
//            this.cartas.add(new Carta(i,"oro"));
//            this.cartas.add(new Carta(i,"copa"));
//            this.cartas.add(new Carta(i,"palo"));
//            this.cartas.add(new Carta(i,"espada"));
//        }

    }
    
    public void sacar8y9(){
        this.cartas.removeIf(n -> (n.getNumero() == 8) | (n.getNumero() == 9));
   
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
        
    }
    
    public int cartasDisponibles(){
        return cartas.size();
    }
    
    
    public void darCartas(Baraja mano, int cant) {
        if (cant > cartas.size()) {
            System.out.println("No hay esa cantidad de cartas para dar.");
        } else {
            for (int i = 0; i < cant; i++) {
                mano.cartas.add(cartas.get(0));
                cartas.remove(0);
            }
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("------------------------------------");
        for (Carta carta : cartas) {
            System.out.println(carta.toString());
        }
    }
}
