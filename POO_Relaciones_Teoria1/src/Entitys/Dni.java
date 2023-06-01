package Entitys;

public class Dni {

    private String serie;

    private long numero;

    public Dni() {
    }

    public Dni(String serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "numero";
    }
    
    
}
