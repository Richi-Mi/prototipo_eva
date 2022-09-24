package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import modelos.Alarma;
import modelos.Usuario;

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
    private static final String user = "root";
    private static final String pass = "123456789"; // host/nombre_base_datos
    private static final String url  = "jdbc:mysql://localhost:3306/eva_prototipo?characterEncoding=utf8&useSSL=false&useUnicode=true";

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
        int id_user       = alarm.getId_usuario();
        
        String insertQuery = "insert into " + collection + " (nombre, tipo, FK_usuario) values ('" + nombre + "', '" + tipo + "', " + id_user + ");";
        actualizar( insertQuery );
    }
}
