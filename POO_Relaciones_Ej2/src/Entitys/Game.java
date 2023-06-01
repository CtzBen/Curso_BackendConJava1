/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import java.util.ArrayList;

/**
 *
 * @author Costanzo
 */
public class Game {
    ArrayList<Player> players;
    WaterGun gun;

    public Game() {
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public WaterGun getGun() {
        return gun;
    }

    public void setGun(WaterGun gun) {
        this.gun = gun;
    }

    public void fillGame(ArrayList<Player> players, WaterGun gun){
        this.players = players;
        this.gun = gun;        
    }
//    ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//    
    public boolean round(int roundNumber, int playing){
        players.get(playing).pullTrigger(gun);
        return players.get(playing).isDead();
    }
}
