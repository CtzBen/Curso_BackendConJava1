package Entitys;

/**
 *
 * @author Costanzo
 */
public class Lavadora extends Electrodomestico{
    
    private double carga;
    
    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    
}
