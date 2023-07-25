/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

/**
 *
 * @author Costanzo
 */
public class AutorService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    
    
    
    public Autor crearAutor(){
        
        System.out.println("Ingrese el nombre del autor:");
        return new Autor(leer.next());
        
    }

    
    public List<Autor> buscarAutorPorNombre(String nombre){
        
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
        
        List<Autor> autores = 
        em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();

        return autores;
        
    }
    
    public void persistirAutor(Autor autor){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Persiste el autor
            entityManager.persist(autor);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
    
    public void actualizarAutor(Autor autor){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Actualiza el autor
            entityManager.merge(autor);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
      
    public void borrarAutor(Autor autor){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // borra el autor
            entityManager.remove(autor);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
      
    public void cambiarAltaAutor(Autor autor, boolean alta){
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        autor.setAlta(alta);
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Actualiza el autor
            entityManager.merge(autor);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
}
