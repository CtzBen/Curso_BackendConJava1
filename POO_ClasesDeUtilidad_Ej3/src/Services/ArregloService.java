package Services;

/**
 *
 * @author Costanzo
 */
public class ArregloService {
    public void inizializarA(double[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random()*10);
        }
    }
    public void inizializarB(double[] b, double[] a){
        for (int i = 0; i < b.length; i++) {
            if (i < 10) {
                b[i] = a[i];
            }else {
                b[i] = 0.5;
            }
        }
    }
    public void ordenarMayorMenor(double[] a){
        double aux;
        double mayor;
        int indxMayor;
        for (int i = 0; i < a.length; i++) {
            
            indxMayor = i;
            mayor = 0;
            
            for (int j = i; j < a.length; j++) {
                
                if (a[j] > mayor) {
                    mayor = a[j];
                    indxMayor = j;
                }
            }
            aux = a[i];
            a[i] = a[indxMayor]; 
            a[indxMayor] = aux;
        }
    }
    public void mostrarArreglo(double[] a){
        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("["+i+"]: "+a[i]);
        }
        System.out.println("------------------------");
    }
}
