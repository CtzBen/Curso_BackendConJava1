package poo_clasesdeutilidad_ej3;

import Services.ArregloService;
import java.util.Arrays;

/**
 *
 * @author Costanzo
 */
public class POO_ClasesDeUtilidad_Ej3 {

    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];
        ArregloService as = new ArregloService();
        as.inizializarA(a);
        as.mostrarArreglo(a);
        as.ordenarMayorMenor(a);
        as.mostrarArreglo(a);

        
    }
    
}
