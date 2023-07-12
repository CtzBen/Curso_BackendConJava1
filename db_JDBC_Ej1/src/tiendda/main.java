
package tiendda;


import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Costanzo
 */
public class main {

    public static void main(String[] args) throws Exception {
        
        FabricanteDAO FDAO = new FabricanteDAO();
        Fabricante fabricante1;
        
            FDAO.consultarFabricantePorNombre("Lenovo");
        try {
        } catch (Exception ex) {
        }
        
       
        
        
        
    }
    
}
