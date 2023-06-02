package Entitys;

/**
 *
 * @author Costanzo
 */
public class Animal {
//    el nombre, alimento, edad y raza del Animal.
    protected String nombre;
    protected String alimento;
    protected String raza;
    protected int edad;

    public Animal() {
    }

    
    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    
    
    public void alimentarse(){
        
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
