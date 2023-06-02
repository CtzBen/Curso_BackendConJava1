/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitys.Electrodomestico;
import Entitys.Televisor;


/**
 *
 * @author Costanzo
 */
public class TelevisorService extends ElectrodomesticoService{

    public TelevisorService() {
    }
    
    
    public double precioFinal(Electrodomestico aux,double resolucion,boolean sintonizadorTDT){
        
        double precioFinal = precioFinal(aux.getConsumo(),aux.getPeso());
        
        if (resolucion > 40) {
            precioFinal += (precioFinal*30)/100;
        }
        if (sintonizadorTDT) {
            precioFinal += 500;
        }
        return precioFinal;   
    }
    
    
     public Televisor crearTelevisor(){
        Electrodomestico aux = crearElectrodomestico();
        double resolucion;
        boolean sintonizadorTDT = false;
        System.out.println("Ingrese la resolución del televisor (en pulgadas): ");
        resolucion = leer.nextDouble();
        System.out.println("Tiene el televisor Sintonizador TDT? (Si/No): ");
        if (leer.next().toUpperCase().equals("SI")) {
            sintonizadorTDT = true;
        }
        return new Televisor(resolucion, sintonizadorTDT,   precioFinal(aux,resolucion,sintonizadorTDT)   ,aux.getColor() ,aux.getConsumo() ,aux.getPeso());
    }
    
}
