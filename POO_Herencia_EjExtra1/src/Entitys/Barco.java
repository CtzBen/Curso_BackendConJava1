package Entitys;
/**
 *
 * @author Costanzo
 */
public class Barco {
//    su matrícula, su eslora en metros y año de fabricación.
    String matricula;
    double eslora;
    int añoFabricacion;

    public Barco(String matricula, double eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }
    
    public double calcularModulo(){
        return eslora*10;
    }
    
}
