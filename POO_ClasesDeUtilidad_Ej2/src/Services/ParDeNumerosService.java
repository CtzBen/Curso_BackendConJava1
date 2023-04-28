package Services;

import Entitys.ParDeNumeros;

/**
 *
 * @author Costanzo
 */
public class ParDeNumerosService {
    public void mostrarValores(ParDeNumeros par){
        System.out.println("Número 1: "+par.getN1());
        System.out.println("Número 2: "+par.getN2());
    }
    public double devolverMayor(ParDeNumeros par){
        if (par.getN1()>par.getN2()) {
            return par.getN1();
        }else if (par.getN1()<par.getN2()) {
            return par.getN2();
            
        }else {
            return par.getN1();
        }
    }
    public double devolverMenor(ParDeNumeros par){
        if (par.getN1()<par.getN2()) {
            return par.getN1();
        }else if (par.getN1()>par.getN2()) {
            return par.getN2();
            
        }else {
            return par.getN1();
        }
    }
    public double calcularPotencia(ParDeNumeros par){
        return Math.pow(Math.floor(devolverMayor(par)),Math.floor(devolverMenor(par)));
        
    }
    public double calcularRaiz(ParDeNumeros par){
        return Math.sqrt(Math.abs(devolverMenor(par)));
    }
}
