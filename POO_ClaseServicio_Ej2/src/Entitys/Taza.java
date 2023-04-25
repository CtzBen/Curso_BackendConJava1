package Entitys;


public class Taza {
    private double capacidadMax;
    private double cantidadActual;
    private String liquidoDentro;

    public Taza() {
    }

    public Taza(double capacidadMax, double cantidadActual, String liquidoDentro) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
        this.liquidoDentro = liquidoDentro;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public String getLiquidoDentro() {
        return liquidoDentro;
    }

    public void setLiquidoDentro(String liquidoDentro) {
        this.liquidoDentro = liquidoDentro;
    }
    
    
}
