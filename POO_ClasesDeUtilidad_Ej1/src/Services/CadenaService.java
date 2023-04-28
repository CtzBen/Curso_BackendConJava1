package Services;

import Entitys.Cadena;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class CadenaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales(String c){
        int a = 0,e = 0,i = 0,o = 0,u = 0;
        for (int j = 0; j < c.length(); j++) {
            switch (c.toUpperCase().charAt(j)) {
                case 'A':
                case 'Á':
                    a += 1;
                    break;
                case 'E':
                case 'É':
                    e += 1;
                    break;
                case 'I':                    
                case 'Í':                    
                    i += 1;
                    break;
                case 'O':
                case 'Ó':
                    o += 1;
                    break;
                case 'U':
                case 'Ú':
                    u += 1;
                    break;
                default:
            }
        }
        System.out.println("Cantidad de vocales en la cadena: '"+c+"'");
        System.out.println("A = "+a);
        System.out.println("E = "+e);
        System.out.println("I = "+i);
        System.out.println("O = "+o);
        System.out.println("U = "+u);
    }
    public String invertirFrase(String c){
        String fraseInvertida = "";
        
        for (int i = c.length(); i > 0; i--) {
            fraseInvertida = fraseInvertida.concat(c.substring(i-1,i));
        }
        
        
        return fraseInvertida;
    }
    public int vecesRepetido(String frase, String letra){
        int r = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i,i+1).equals(letra)) {
                r += 1;
            }
        }
        return r;
    }
    
    public int compararLongitud(Cadena c, String frase){
        int diferencia;
        diferencia = c.getLongitud()-frase.length();
        return diferencia;
    }
    
    public String unirFrases(String frase1, String frase2){
        String concat = frase1+frase2;
        return concat;
    }
    public String reemplazar(String frase, String letra){
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i,i+1).equals("a")) {
                resultado = resultado.concat(letra);
            } else {
                resultado = resultado.concat(frase.substring(i,i+1));
            }
        }
        return resultado;
        
        
    }
    public boolean contiene(String frase, String letra){
        boolean r = false;
       for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i,i+1).equals(letra)) {
                r = true;
            }
       }
        return r;   
    }
}
