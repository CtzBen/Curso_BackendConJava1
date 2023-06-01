package poo_relaciones_ej2;

import Entitys.Game;
import Entitys.Player;
import Entitys.WaterGun;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Costanzo
 */
public class POO_Relaciones_Ej2 {
    
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        WaterGun gun = new WaterGun();
        ArrayList<Player> players = new ArrayList<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int maxP;
        System.out.println("Elija el número de jugadores (máx 6): ");
        maxP = leer.nextInt();
        if (maxP > 6) {
            maxP = 6;
        }
        
        for (int i = 0; i < maxP; i++) {
            System.out.println("Ingrese el nombre del siguiente jugador: ");
            players.add(new Player(i,leer.next()));
        }
        
        game.fillGame(players, gun);
        gun.fillGun();
        
        System.out.println(players.toString());
        
        System.out.println("EMPIEZA WAS KEJLRB LJKSDLK A>>>:))) ");
        
        int roundNumber = 0;
        int playing = 0;
        boolean playerDied;
        
        do {
            TimeUnit.SECONDS.sleep(5);
            if (playing >= maxP){
                playing = 0;
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Ronda '" + (roundNumber+1) + "'. Le toca a: " + players.get(playing));
            playerDied = game.round(roundNumber, playing);
            TimeUnit.SECONDS.sleep(5);
            if (!playerDied) {
                System.out.println(players.get(playing).toString() + "NO SE MURIÓ KJDASJKBJKBFJK QUE CAGASO"); 
                roundNumber += 1;
                playing += 1;
            }else{
                System.out.println(players.get(playing).toString() + " SE MURIOOOO ASDBN AOSDN ONOOOOOOOOOO fin del jogo.");
            }
        } while (!playerDied);
        
        
    }
    
}
