package Services;

import Entitys.Cafetera;
import Entitys.Taza;
import java.util.Scanner;

public class CafeteraService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera,double cantidadAgregada){
        cafetera.setCantidadActual(cantidadAgregada);
        if(cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }
    }
    
    public void servirTaza(Cafetera cafetera,Taza taza){
        if (cafetera.getCantidadActual() == 0.0){
            System.out.println("La cafetera está vacía!");
        }else {
            if (taza.getCapacidadMax() < cafetera.getCantidadActual()){

            taza.setCantidadActual(taza.getCapacidadMax());
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima() - taza.getCapacidadMax());

            }else{

            taza.setCantidadActual(cafetera.getCantidadActual());
            cafetera.setCantidadActual(0.0);
            }
            taza.setLiquidoDentro("Café");
        }
    }
    
    
}
