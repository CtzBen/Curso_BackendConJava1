
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Costanzo
 */
public final class FabricanteDAO extends DAO{
    
    public void insertarFabricante(Fabricante fabricante) throws Exception{
        try {
            if(fabricante == null){
                throw new Exception("Debe ingresar un fabricante");
            }
            
            String sql = "INSERT INTO fabricante (codigo, nombre)"
                       + " VALUES ('" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "')";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;            
        }
        
    }
    
    public void modificarFabricante(Fabricante fabricante) throws Exception{
        try {
            if(fabricante == null){
                throw new Exception("Debe ingresar un fabricante");
            }
            
            String sql = "UPDATE fabricante "
                       + "SET nombre = '" + fabricante.getNombre() + "' "
                       + "WHERE codigo = '" + fabricante.getCodigo() + "'";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;            
        }
        
    }
    
     public void eliminarFabricante(int codigo) throws Exception{
        try {

            String sql = "DELETE FROM fabricante "
                       + "WHERE codigo = '" + codigo + "'";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;            
        }
    }
     
     public void consultarFabricantePorNombre(String nombre) throws Exception{
         
         try {
             String sql = "SELECT * FROM fabricante WHERE nombre = '" + nombre + "';";
             consultarBase(sql);
             Fabricante fabricante = null;
//             while (resultado.next()){
                 fabricante = new Fabricante();
                 System.out.println(resultado.getInt(1));
                 System.out.println(resultado.getString(2));
//             }
             
             desconectarBase();
             
//             return fabricante;
         } catch (Exception e) {
             desconectarBase();
             throw e;
         }

     }
     
}
