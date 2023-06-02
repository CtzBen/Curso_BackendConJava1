package Services;

import Entitys.Electrodomestico;
import Entitys.Lavadora;

/**
 *
 * @author Costanzo
 */
public class LavadoraService extends ElectrodomesticoService{

    public LavadoraService() {
    }
    
    public double precioFinal(Electrodomestico aux,double carga){
        
        double precioFinal = precioFinal(aux.getConsumo(),aux.getPeso());
        
        if (carga > 30) {
            precioFinal += 500;
        }
        return precioFinal;   
    }
    
    public Lavadora crearLavadora(){
        Electrodomestico aux = crearElectrodomestico();
        double carga;
        System.out.println("Ingrese la carga de la lavadora (en Kg): ");
        carga = leer.nextDouble();

        return new Lavadora(precioFinal(aux,carga),aux.getColor(),aux.getConsumo(),aux.getPeso(),carga);
    }
    
}
