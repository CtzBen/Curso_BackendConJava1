package Entitys;
public class Persona {

    private String nombre;

    private String apellido;

    private Dni Dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni Dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getDni() {
        return Dni;
        
    }
 
    public void setDni(Dni Dni) {
        this.Dni = Dni;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni.getNumero() + '}';
    }
    
    
}
