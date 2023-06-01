/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

/**
 *
 * @author Costanzo
 */
public class Player {
//    Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
    
   int id;
   String nombre;
   boolean dead;

    public Player() {
    }

    public Player(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.dead = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    @Override
    public String toString() {
        return "Player " + (id+1) + ": " + nombre + " " ;
    }
   
    
   
   public void pullTrigger(WaterGun gun){
       if (gun.shoot()) {
           gun.setLoaded(false);
           this.dead = true;
       }else{
           gun.nextClip();
       }
   }
}
