package Services;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class FechaService {
    public Date fechaNacimiento(){
        int yyyy,mm,dd;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su fecha de nacimiento. ");
        System.out.println("Año: ");
        yyyy = leer.nextInt();
        System.out.println("Mes: ");
        mm = leer.nextInt();
        System.out.println("Día: ");
        dd = leer.nextInt();
        Date fecha = new Date();
        return fecha;
    }
}
