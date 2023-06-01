package Entitys;



/**
 *
 * @author Costanzo
 */
public class WaterGun {
    int currentClipPosition;
    int waterClipPosition;
    boolean loaded;
    public WaterGun() {
        this.loaded = false;
    }

    public int getCurrentClipPosition() {
        return currentClipPosition;
    }

    public void setCurrentClipPosition(int currentClipPosition) {
        this.currentClipPosition = currentClipPosition;
    }

    public int getWaterClipPosition() {
        return waterClipPosition;
    }

    public void setWaterClipPosition(int waterClipPosition) {
        this.waterClipPosition = waterClipPosition;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
    
    
    
    //Llena el arma con una bala en una posición aleatoria de 0 a 5 y gira el tambor;
    public void fillGun(){
        this.currentClipPosition =  (int) Math.floor((Math.random()*100)%6);
        this.waterClipPosition   =  (int) Math.floor((Math.random()*100)%6);
        this.loaded = true;
    }
    
    //Si el arma está cargada y la bala coincide con la posición actual del tambor, devuelve true;
    public boolean shoot(){
        return ((this.loaded) && (this.currentClipPosition == this.waterClipPosition)) ;
    }
    
    //El cargador se mueve entre las posiciones 0 y 5 del tambor una a la vez;
    public void nextClip(){
        if (this.currentClipPosition == 5){
            this.currentClipPosition = 0;
        }else{
            this.currentClipPosition += 1;
        }
    }

    @Override
    public String toString() {
        if (loaded) {
            return ("Revolver de agua[" + "Cargado: " + loaded + "Posición de la bala: " + waterClipPosition + "Posición actual: " + currentClipPosition + ']');
        }else{
            return ("Revolver de agua ["+ "Cargado: " + loaded + "]");
        }
    }
    
    
}
