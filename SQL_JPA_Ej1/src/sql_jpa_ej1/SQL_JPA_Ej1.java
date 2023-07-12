
package sql_jpa_ej1;


import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;

/**
 *
 * @author Costanzo
 */
public class SQL_JPA_Ej1 {


    public static void main(String[] args) {
        
        LibroService libroService = new LibroService();
        EditorialService editorialService = new EditorialService();
        AutorService autorService = new AutorService();
        
//        
//        Autor autor = autorService.crearAutor();
//        autorService.persistirAutor(autor);
//        
//        Editorial editorial = editorialService.crearEditorial();
//        editorialService.persistirEditorial(editorial);
//        
//        Libro libro = libroService.crearLibro(autor, editorial);
//        libroService.persistirLibro(libro);

        List<Libro> query = libroService.consultarLibros();
        
        for (Libro libros : query) {
            System.out.println(libros.toString());
        }
        
        
    }
    
}
