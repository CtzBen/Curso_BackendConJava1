package poo_herencia_ejextra2;

import Entitys.Edificio;
import Entitys.EdificioDeOficinas;
import Entitys.EdificioPolideportivo;
import Services.EdificioDeOficinasService;
import Services.EdificioPolideportivoService;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Costanzo
 */
public class POO_Herencia_EjExtra2 {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        EdificioPolideportivoService poliSv = new EdificioPolideportivoService();
        EdificioDeOficinasService ofSv = new EdificioDeOficinasService();
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Qué edificio agregar a la lista? (Polideportivo u Oficinas):");
            String ax = leer.next().toLowerCase();
                      
            switch (ax) {
                case "polideportivo":
                    edificios.add(poliSv.crearPolideportivo());
                    break;
                case "oficinas":
                    edificios.add(ofSv.crearOficinas());  
                break;
            }    
        }
        
        int poliTechado = 0,poliAbierto = 0;
        for (Edificio edificio : edificios) {
            
            System.out.println("Superficie: "+ edificio.calcularSuperficie());
            System.out.println("Volumen: "+ edificio.calcularVolumen());
            if (edificio instanceof EdificioPolideportivo) {
                EdificioPolideportivo poli = (EdificioPolideportivo) edificio;
                if (poli.getTipoEstablecimiento().equalsIgnoreCase("techado")) {
                    poliTechado += 1;
                }else if (poli.getTipoEstablecimiento().equalsIgnoreCase("abierto")){
                    poliAbierto += 1;
                }
                
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edif = (EdificioDeOficinas) edificio;
                ofSv.cantPersonas(edif);
            }
        }
        
        System.out.println("Polis techados: " + poliTechado);
        System.out.println("Polis abiertos: " + poliAbierto);
    
        
    }   
    
}
