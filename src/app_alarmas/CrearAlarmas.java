package app_alarmas;

import app_connection.Conexion_Base;
import app_connection.Conexion_Base;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.Date;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Vector;

/**
 * @author Mendoza Castañeda José Ricardo
 */

/*
alter table alarmas change alarmas_extra alarmas_extra tinytext not null;
alter table caso_uno change alarma_conocidos alarma_conocidos tinytext not null;
alter table caso_dos change alarma_pasatienpo alarma_pasatienpo  tinytext not null;
alter table caso_tres change alarma_desíerta alarma_desíerta tinytext not null;
alter table caso_tres change alarma_dormir alarma_dormir tinytext not null;
alter table caso_cinco change alarma_datos alarma_datos tinytext not null;
alter table caso_seis change alarma_medicinas alarma_medicinas tinytext not null;
 */
public class CrearAlarmas {

    // private Conexion_Base conexion;
    private Conexion_Base conexion;
    private Connection con;
    private Statement st, st2, st3, st4, st5;
    private ResultSetImpl resAlarmas, resPasatiempos, resCasoTres, resConocidos, resMedicinas;

    private int id = 1;
    // Caso 4 no tiene Alarmas
    String queryAlarmas    = "select alarmas_extra, nombre from alarmas where FK_usuario=" + id + ";";
    String queryConocidos  = "select alarma_conocidos, nombre, parentesco, cumpleaños from caso_uno where FK_usuario=" + id + ";";
    String queryPasatiempo = "select hobbie, alarma_pasatienpo from caso_dos where FK_usuario =" + id + ";";
    String queryCasoTres   = "select alarma_desíerta, alarma_dormir from caso_tres where FK_usuario =" + id + ";";
    String queryMedicinas  = "select nombre, alarma_medicinas from caso_seis where FK_usuario=" + id + ";";

    private Vector<Vector> totalAlarmas = new Vector(10, 1);
    private Vector<HacerSonar> hilos = new Vector(10, 1);
    
    // Cambiar la conexion
    public CrearAlarmas() {
        // conexion = new Conexion_Base();
        conexion = new Conexion_Base();
    }
    public void cancelarAlarmas() {
        for( int i = 0; i < hilos.size(); i++ ) {
            HacerSonar hiloActual = hilos.elementAt(i);
            
            hiloActual.stop();
        } 
    }

    public void programarTodasLasAlarmas() {
        this.cancelarAlarmas();
        this.obtenerTodasLasAlarmas();
        
        for( int i = 0; i < totalAlarmas.size(); i++ ) {
            Vector alarmaActual = totalAlarmas.elementAt(i);
            String name = (String) alarmaActual.elementAt(0);
            java.util.Date sonar = (java.util.Date) alarmaActual.elementAt(1);
            
            HacerSonar hilo = new HacerSonar( name, sonar );
            hilos.addElement(hilo);
            
            hilo.start();
        }
    }
    
    public void obtenerTodasLasAlarmas() {
        // 0 - nombre
        // 1 - hora
        try
        {
            // siuuu
            con = conexion.conexion();
         
            st = (Statement) con.createStatement();
            st2 = (Statement) con.createStatement();
            st3 = (Statement) con.createStatement();
            st4 = (Statement) con.createStatement();
            st5 = (Statement) con.createStatement();

            resAlarmas = (ResultSetImpl) st.executeQuery(queryAlarmas);
            resConocidos = (ResultSetImpl) st2.executeQuery(queryConocidos);
            resPasatiempos = (ResultSetImpl) st3.executeQuery(queryPasatiempo);
            resCasoTres = (ResultSetImpl) st4.executeQuery(queryCasoTres);
            resMedicinas = (ResultSetImpl) st5.executeQuery(queryMedicinas);

            this.recorreRes( resAlarmas, "nombre", "alarmas_extra", "Una alarma Extra: ");
            this.recorreRes( resPasatiempos, "hobbie", "alarma_pasatienpo", "Es hora de tu hobbie: ");
         
            this.recorreRes( resMedicinas, "nombre", "alarma_medicinas", "Es hora de tu medicina: ");
            
            while( resConocidos.next() ) {
                Vector alarma = new Vector(2, 1);
                String nombre = resConocidos.getString("nombre");
                String parentesco = resConocidos.getString("parentesco");
                Date cumple = resConocidos.getDate("cumpleaños");
                
                String msg = "Es hora de recordar que " + nombre + " es tu " + parentesco + " y su cumpleaños es el " + cumple.getTime();
                alarma.addElement( msg );
                
                String alarma_conocidos = resConocidos.getString("alarma_conocidos");
                java.util.Date tiempoASonar = this.convertirTiempo( alarma_conocidos );
                alarma.addElement( tiempoASonar );
                
                totalAlarmas.addElement( alarma );
            }
            while( resCasoTres.next() ) {
                Vector alarmaDes = new Vector(2,1);
                Vector alarmaDor = new Vector(2,1);
                
                String hora_despertar = resCasoTres.getString("alarma_desíerta");
                java.util.Date tiempoASonarDes = this.convertirTiempo( hora_despertar );
                String msgDes = "Es hora de despertar!!!";
                
                alarmaDes.addElement( msgDes );
                alarmaDes.addElement( tiempoASonarDes );
                
                String hora_mimir = resCasoTres.getString("alarma_dormir");
                java.util.Date tiempoASonarDor = this.convertirTiempo( hora_mimir );
                String msgMimir = "Es hora de despertar!!!";
                
                alarmaDor.addElement( msgMimir );
                alarmaDor.addElement( tiempoASonarDor );
                
                totalAlarmas.addElement( alarmaDes );
                totalAlarmas.addElement( alarmaDor );
            }
            this.cerrarConexion();
            
        } catch (SQLException ex)
        {
            System.out.println(ex);
            System.out.println(" - Error, no se pudieron ejecutar los Querys - Alarmas");
        }
    }

    public void recorreRes(ResultSetImpl res, String param1, String param2, String msg ) throws SQLException {
        if( res != null ) {
            while (res.next()) {
                Vector alarma = new Vector(2, 1);
                alarma.addElement( msg + res.getString( param1 ));

                java.util.Date tiempoASonar = this.convertirTiempo( res.getString( param2 ) );

                alarma.addElement( tiempoASonar );
                totalAlarmas.addElement( alarma );
            }
            
        }
    }

    public int[] obtenerTiempo(String tiempo) {
        // 0 - hora
        // 1- minuto
        // 2 - segundo
        int[] tiempoFinal = new int[3];
        String valorActual = "";
        int contador = 0;

        for (int i = 0; i < tiempo.length(); i++)
        {
            if (tiempo.charAt(i) != ':')
            {
                valorActual += tiempo.charAt(i) + "";
            }
            if (tiempo.charAt(i) == ':' || i == (tiempo.length() - 1))
            {
                int num = Integer.parseInt(valorActual);
                tiempoFinal[contador] = num;
                valorActual = "";
                contador++;
            }

        }
        return tiempoFinal;
    }
    public java.util.Date convertirTiempo( String tiempo ) {
        LocalDateTime actual = LocalDateTime.now();
        LocalDate todaysDate = LocalDate.now();
        int year = todaysDate.getYear() - 1900;
        int month = todaysDate.getMonthValue() - 1;
        int day;
        
        int horaActual = actual.getHour();
        int minutoActual = actual.getMinute();
        int segundoActual = actual.getSecond();
        
        int[] time = this.obtenerTiempo( tiempo );
        
        if( time[0] < horaActual ) {
           
            day = todaysDate.getDayOfMonth() + 1;
        }
        else if( time[0] == horaActual && time[1] < minutoActual ) {
            day = todaysDate.getDayOfMonth() + 1;
        }
        else {
            day = todaysDate.getDayOfMonth();
        }
        
        java.util.Date horaSonar = new java.util.Date( year, month, day, time[0], time[1], time[2] );
        
        return horaSonar;
    }

    public void cerrarConexion() {
        try
        {
            this.con.close();
        } catch (SQLException ex)
        {
            System.out.println(" - No se pudo cerrar la conexión a MySQL");
            System.out.println(ex);
        }
    }
}
