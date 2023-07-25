/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;

/**
 *
 * @author Costanzo
 */
public class EditorialService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Editorial crearEditorial(){
          System.out.println("Ingrese el nombre del autor:");
        return new Editorial(leer.next());
    }
      
    public void persistirEditorial(Editorial editorial){
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Persiste el Editorial
            entityManager.persist(editorial);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
    
    public void actualizarEditorial(Editorial editorial){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // actualiza el Editorial
            entityManager.merge(editorial);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
     
    public void borrarEditorial(Editorial editorial){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // SE BORRAAAAAA el Editorial
            entityManager.remove(editorial);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
      
    public void cambiarAltaEditorial(Editorial editorial, boolean alta){
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        editorial.setAlta(alta);
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Actualiza el autor
            entityManager.merge(editorial);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
        
    }
    
}
