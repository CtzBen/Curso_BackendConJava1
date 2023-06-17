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
public class BornTofAil {
    String[] victim;

    public BornTofAil(String[] victim) {
        this.victim = victim;
    }


    public String[] getvictim() {
        return victim;
    }

    public void setvictim(String[] victim) {
        this.victim = victim;
    }
    
    
    public void sufferingIsNotEndless(int suffer){
        double destiny;
        try {
            for (int i = 0; i < suffer; i++) {
                destiny = Math.random();
                if (destiny > 0.69 & destiny < 0.70) { this.victim[i] = "You enyojed this one ._. YOU FILTHY ASS MF WHAT IS WREREORNTRONG WITH YOU";} 
                else {
                   if (destiny > 0.82){this.victim[i] = "Suffer";}
                   else{               this.victim[i] = "Pain"; }  
                }
                System.out.println(victim[i]);
//                System.out.println(victim[i] + " destiny: " + destiny);
                
            }
            
            for (int i = suffer; i < this.victim.length; i++) {
                this.victim[i] = "No more pain :D";
                System.out.println(victim[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("AAAAAA TOOO MUCH PAAAIn");
        }
    }
    
}
    
    

