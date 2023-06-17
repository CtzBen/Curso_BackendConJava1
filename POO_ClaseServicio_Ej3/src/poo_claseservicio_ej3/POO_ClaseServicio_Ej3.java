package poo_claseservicio_ej3;

import Entitys.Persona;
import Services.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class POO_ClaseServicio_Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaService personaService = new PersonaService();
        int n;
        System.out.println("Cantidad de personas a ingresar: ");
        n = leer.nextInt();
        Persona[] persona;
        persona = new Persona[n];
        for (int i = 0; i < n; i++) {
            persona[i] = personaService.crearPersona();
        }
        
        
        int menores = 0,mayores = 0,debajoPI = 0,sobrePI = 0,enPI = 0;
        for (int i = 0; i < n; i++) {
            switch (personaService.calcularIMC(persona[i])) {
                case -1:
                    System.out.println(persona[i].getNombre()+" está debajo de su peso ideal.");
                    debajoPI += 1;
                    break;
                case 0:
                    System.out.println(persona[i].getNombre()+" está en su peso ideal!");
                    enPI += 1;
                    break;
                case 1:
                    System.out.println(persona[i].getNombre()+" se encuentra con sobrepeso.");
                    sobrePI += 1;
                    break;
            }
            if(personaService.esMayorDeEdad(persona[i])){
                System.out.println(persona[i].getNombre()+" es mayor de edad.");
                mayores += 1;
            }else {
                System.out.println(persona[i].getNombre()+" es menor de edad.");
                menores += 1;
            }
        }
        
        System.out.println("El "+calcularPorcentaje(debajoPI,n)+"% de las personas están debajo de su peso ideal.");
        System.out.println("El "+calcularPorcentaje(enPI,n)+"% de las personas están en su peso ideal.");
        System.out.println("El "+calcularPorcentaje(sobrePI,n)+"% de las personas están por encima de su peso ideal.");
        System.out.println("El "+calcularPorcentaje(mayores,n)+"% de las personas son mayores de edad.");
        System.out.println("El "+calcularPorcentaje(menores,n)+"% de las personas son menores de edad.");
        
        //prueba de excepción simple

          Persona personanull = null;
          try {
              personaService.esMayorDeEdad(personanull);
              
           } catch (NullPointerException e) {
//               e.printStackTrace();
               System.out.println(e.getMessage());
           }
    }
    
    public static double calcularPorcentaje(int cuantoDelTotal, int total){
        double porcentaje;
        porcentaje = (100*cuantoDelTotal)/total;
        return porcentaje;
    }

}
