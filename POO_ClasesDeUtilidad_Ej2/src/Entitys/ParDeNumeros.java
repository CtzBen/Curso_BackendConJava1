package Entitys;

/**
 *
 * @author Costanzo
 */
public class ParDeNumeros {
    private double n1,n2;

    public ParDeNumeros() {
    n1 = Math.random()*20;
    n2 = Math.random()*20;
    }

    public ParDeNumeros(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
}
