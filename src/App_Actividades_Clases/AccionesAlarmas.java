/** Acciones.
 * - Conectarse y ejecutar las consultas a MySQL
 */
package App_Actividades_Clases;


import app_connection.Conexion_Base;
import com.mysql.jdbc.ResultSetImpl;

import app_connection.Conexion_Base;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo
 */

/*
            Date fechaHoraActuales = new Date();
            SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
            String horA = hora.format(fechaHoraActuales);
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MMMM/yyyy");
            String fechA = fecha.format(fechaHoraActuales);

tableUsers.getRowCount() - Cantidad total de Filas
*/
public class AccionesAlarmas {
    private Conexion_Base conexion; 
    private Connection con;
    private Statement st;
    private ResultSetImpl res;
    private SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
    
    public AccionesAlarmas() {
        conexion = new Conexion_Base();
        con = conexion.conexion();
        try {
            st = (Statement) con.createStatement();
        } catch (SQLException ex) {
            System.out.println(" - Error al crear el Statement");
            this.cerrarConexion();
        }
    }
    public Vector<Object[]> getAlarmas( int id ) {
        // Cambiado
        try {
            String query = "select id_alarmas_extra, alarmas_extra, nombre from alarmas where FK_usuario=" + id + ";";
            res = (ResultSetImpl) st.executeQuery(query);
            
            Vector<Object[]> alarmas = new Vector(10, 1);
            while( res.next() ) {
                Object[] alarma = new Object[3];
           
                alarma[0] = res.getInt("id_alarmas_extra");                
                alarma[1] = res.getString("nombre");
                alarma[2] = res.getString("alarmas_extra");
                
                alarmas.addElement( alarma );
            }
            
            return alarmas;
            
        } catch (SQLException ex) {
            System.out.println(" - No se pudieron obtener los usuarios");
            System.out.println( ex );
            this.cerrarConexion();
            return null;
        }
    } 
    public boolean insertarAlarma( String nombre, String hora, int idUser ) {
        try {
            String query = "insert into alarmas (alarmas_extra, FK_usuario, nombre ) values ('" + hora + "', " + idUser + ", '" + nombre + "');";
            
            st.executeUpdate( query );
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            this.cerrarConexion();
            return false;
        }
    }
    public boolean eliminar( int id ) {
        try {
            String query = "delete from alarmas where id_alarmas_extra = " + id + ";";
            st.executeUpdate( query );
            return true;
        } catch (SQLException ex) {
            System.out.println(" - No se pudo eliminar la alarma");
            System.out.println( ex );
            this.cerrarConexion();
            return false;
        }
        
    }
    public void cerrarConexion() {
        try {
            this.con.close();
        } catch (SQLException ex) {
            System.out.println(" - No se pudo cerrar la conexión a MySQL");
            System.out.println( ex );
        }
    }
}
