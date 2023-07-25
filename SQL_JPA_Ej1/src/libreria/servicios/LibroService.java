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
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author Costanzo
 */
public class LibroService {
      
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro crearLibro(Autor autor, Editorial editorial){
        
//     String isbn;
//     String titulo;
//     Integer yyyy;
//     boolean alta;
//     Integer ejemplares;
//     Integer ejemplaresPrestados;
//     Integer ejemplaresRestantes;
//     
     Libro libro = new Libro();
     
        System.out.println("Ingrese el ISBN del libro:");
         libro.setIsbn(leer.next());
        System.out.println("Ingrese el título del libro:");
         libro.setTitulo(leer.next());
        System.out.println("Ingrese el año de publicación:");
         libro.setYyyy(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares del libro:");
         libro.setEjemplares(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares prestados del libro:");
         libro.setEjemplaresPrestados(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares restantes del libro:");
         libro.setEjemplaresRestantes(leer.nextInt());
        
         libro.setAutor(autor);
         libro.setEditorial(editorial);
        
     return libro;
    
    }

     public List<Libro> buscarLibroPorISBN(String isbn){
        
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
        
        List<Libro> libros = 
        em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn").setParameter("isbn", isbn).getResultList();
        
        return libros;
    }
    
     public List<Libro> buscarLibroPorTitulo(String titulo){
        
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
        
        List<Libro> libros = 
        em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getResultList();
        
        return libros;
    }
     
     public List<Libro> buscarLibroPorAutor(String autor){
        
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
        
        List<Libro> libros = 
        em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :autor").setParameter("autor", autor).getResultList();
        
        return libros;
    }
     
     public List<Libro> buscarLibroPorEditorial(String editorial){
        
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
        
        List<Libro> libros = 
        em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :editorial").setParameter("editorial", editorial).getResultList();
        
        return libros;
    }
    
    public List<Libro> consultarLibros(){
        
        
        EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
        
        List<Libro> libros = 
        em.createQuery("SELECT l FROM Libro l").getResultList();
        
        return libros;
    }
    public void persistirLibro(Libro libro){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Persiste el autor
            entityManager.persist(libro);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
    
    public void actualizarLibro(Libro libro){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Actualiza el autor
            entityManager.merge(libro);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
    
    public void borrarLibro(Libro libro){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // borra el autor
            entityManager.remove(libro);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
    
    public void cambiarAltaLibro(Libro libro,boolean alta){
        
                
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libreriaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        libro.setAlta(alta);
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Actualiza el autor
            entityManager.merge(libro);
        entityManager.getTransaction().commit();
        
        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
        
    }
      
     
}
