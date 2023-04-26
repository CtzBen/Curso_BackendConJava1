package Services;
import Entitys.Persona;
import java.util.Scanner;
/**
 *
 * @author Costanzo
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad() >= 18;
    }
    
    public Persona crearPersona(){
    String nombre, sexo;
    int edad;
    double peso,altura;
    
    System.out.println("Ingresar nombre: ");
    nombre = leer.next();
    System.out.println("Ingresar edad: ");
    edad = leer.nextInt();
    System.out.println("Ingresar peso en kg: ");
    peso = leer.nextDouble();
    System.out.println("Ingresar altura en mts: ");
    altura = leer.nextDouble();
    boolean validar = false;
    do {
    System.out.println("Ingresar sexo (H = Hombre, M = Mujer, O = Otro): ");
    sexo = leer.next();
        if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")){
            System.out.println("Por favor ingrese una de las opciones anteriores como dato.");
        }else {
            validar = true;
        }
    } while(!validar);
        
        return new Persona(nombre,sexo,edad,peso,altura);
    }
    public int calcularIMC(Persona persona){
        double pesoIdeal = persona.getPeso()/ Math.pow(persona.getAltura(),2);
        if(pesoIdeal < 20){
            return -1;
        }else if (pesoIdeal > 20){
            return 1;
        }else return 0;
    }
}

