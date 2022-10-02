package database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Alarma;
import modelos.Usuario;
import modelos.Contacto;

/**
 * @author Mendoza Castañeda José Ricardo
 *
 * Modelo para guardar Datos. [ id, data... ]
 */
public class Database {

    // Declaramos la conexion a mysql 
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user   = "root";
    private static final String pass   = "123456789"; // host/nombre_base_datos
    private static final String url    = "jdbc:mysql://localhost:3306/eva_prototipo?characterEncoding=utf8&useSSL=false&useUnicode=true";

    // Funcion que va conectarse a mi bd de mysql
    private static Connection conectar() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try
        {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null)
            {
                System.out.println("Conectado a base de datos en MySQL");
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("ERROR A LA HORA DE CONECTARSE");
            System.out.println(e);
        }
        return con;
    }

    public static void desconectar() {
        try {
            con.close();
        } catch (SQLException ex)
        {
            System.out.println("Error al cerrar la Conexion a MySQL");
        }
    }

    /**
     * Acciones de la Base de Datos. insert update delete obtener
     */
    private static void actualizar(String query) {
        Connection con = conectar();
        try {
            Statement st = con.createStatement();
            st.executeUpdate( query );
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el query");
            System.out.println( ex );
        }
        finally {
            try {
                con.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException ex) {
                System.out.println("ERROR Al cerrar la conexión a la DB.");
            }
        }
    }

    public static void insert(Collections coll, String[] keys, String[] data) {
        String collection = coll.getNombre();
        String ac_keys = "", ac_values = "";

        for (int i = 0; i < keys.length; i++)
        {
            if (i == keys.length - 1)
            {
                ac_keys += keys[i];
            } else
            {
                ac_keys += keys[i] + ", ";
            }
        }
        for (int i = 0; i < data.length; i++) {
            try {
                Integer.parseInt(data[i]);
                ac_values += data[i];
            } 
            catch (NumberFormatException e) {
                ac_values += "'" + data[i] + "'";
            } 
            finally {
                if (!(i == data.length - 1)) {
                    ac_values += ", ";
                }
            }
        }
        String insertQuery = "insert into " + collection + "( " + ac_keys + " ) values (" + ac_values + ");";
        actualizar(insertQuery);
    }
    public static void insert( Usuario user ) {
        
        String collection = Collections.USUARIO.getNombre();
        String nombre     = user.getNombre();
        String sexo       = user.getSexo();
        String idioma     = user.getIdioma();
        
        String insertQuery = "insert into " + collection + " (nombre, sexo, idioma) values ('" + nombre + "', '" + sexo + "', '" + idioma + "');";
        actualizar( insertQuery );
    }
    public static void insert( Alarma alarm ) {
        
        String collection = Collections.ALARMAS.getNombre();
        String nombre     = alarm.getNombre();
        String tipo       = alarm.getTipo();
        String hora       = alarm.getHora_sonar();
        int id_user       = alarm.getId_usuario();
        
        String insertQuery = "insert into " + collection + " (nombre, tipo, FK_usuario, hora_sonar) values ('" + nombre + "', '" + tipo + "', " + id_user + ", '" +  hora + "');";
        actualizar( insertQuery );
    }
    public static void insert( Contacto contact ) {
        
        String collection = Collections.CONTACTOS.getNombre();
        String nombre = contact.getNombre();
        String sexo = contact.getSexo();
        String idioma = contact.getIdioma();
        int id_usuario = contact.getId_usuario();
        String parentesco = contact.getParentesco();
        String numero = contact.getNumero();
        
        String insertQuery = "insert into " + collection + " (nombre, sexo, idioma, id_usuario, parentesco, numero) values (\" "+ nombre +" \", \" " + sexo + " \", \" " + idioma + " \", " + id_usuario + ", \" " + parentesco + " \", \" " + numero + " \");";
        actualizar( insertQuery );
    }
    public static void delete( Usuario usr ) {
        String collection = Collections.USUARIO.getNombre();
        String nombre = usr.getNombre();
        
        String deleteQuery = "delete from " + collection + " where nombre = \"" + nombre + "\"";
        actualizar( deleteQuery );
    }
    public static void delete( Alarma alarm ) {
        String collection = Collections.ALARMAS.getNombre();
        String nombre = alarm.getNombre();
        
        String deleteQuery = "delete from " + collection + " where nombre = \"" + nombre + "\"";
        actualizar( deleteQuery );
    }
    public static void delete( Contacto contact ) {
        String collection = Collections.CONTACTOS.getNombre();
        String nombre = contact.getNombre();
        
        String deleteQuery = "delete from " + collection + " where nombre = \"" + nombre + "\"";
        actualizar( deleteQuery );
    }
    
    public static String formatSelectQuery( String collection, String[] keys ) {
        String getQuery = "select ";
        
        for( int i = 1; i <= keys.length; i++ ) {
            if( i < keys.length ) {
                getQuery += keys[i - 1] + ", ";
            }
            if( i == keys.length ) {
                getQuery += keys[i - 1] + " ";
            }
        }
        getQuery += " from " + collection + ";";
        
        
        return getQuery;
    }
    public static ArrayList<String[]> select( String collection, String[] keys ) {
        // [ id, ...data ]
        ArrayList<String[]> list = new ArrayList<String[]>();
       
        String getQuery = formatSelectQuery( collection, keys );
        
        try {
            Connection con = conectar();
            Statement st = con.createStatement();
            ResultSetImpl res = (ResultSetImpl) st.executeQuery( getQuery );
            
            while( res.next() ) {
                
                String[] data = new String[ keys.length ];
                
                for( int i = 0; i < data.length; i++ ) {
                    
                    data[i] = res.getString( keys[i] );
                    
                }
                
                list.add(data);
     
            }
            return list;
        } catch (SQLException ex) {
            System.out.println( ex );
            System.out.println("No Data.");
            
            return null;
        }
        
    }

    public static ArrayList<String[]> getUsers() {
        String collection = Collections.USUARIO.getNombre();
        String[] keys = {"sexo"};
        
        ArrayList<String[]> data = select( Collections.USUARIO.getNombre(), keys );
        return data;
    }
}
