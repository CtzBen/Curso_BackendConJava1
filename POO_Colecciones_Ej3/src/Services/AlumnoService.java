/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitys.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Costanzo
 */
public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumno> crearListaDeAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        String auxNombre;
        ArrayList<Double> auxNotas = new ArrayList<>();

        String continuar;
        do {
           
            System.out.println("Ingrese el nombre del alumno: ");
            auxNombre = leer.next();
            
            System.out.println("Ingrese las tres notas del alumno: ");
            for (int i = 0; i < 3; i++) {
                auxNotas.add(leer.nextDouble());
            }
            
            alumnos.add(new Alumno(auxNombre, auxNotas));
            auxNotas.clear();
            
            System.out.println("¿Desea agregar un alumno más? (Si/No): ");
            continuar = leer.next().toUpperCase();
        } while (continuar.equals("SI"));
        
        
        return alumnos;
    }
    public Double notaFinal(ArrayList<Alumno> alumnos, String nombre){
        
        Double promedio = 0.0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre() == nombre) {
                Double suma = 0.0;
                for (Double nota : alumno.getNotas()) {
                    suma += nota;
                }
                promedio = suma/alumno.getNotas().size();
            }
        }
        
        return promedio;
    }
}
