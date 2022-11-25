package app_alarmas;

import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.Date;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Vector;
import database.Database;
import modelos.Alarma;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class CrearAlarmas {
    private int id_usuario = 1;
    private ArrayList<String[]> totalAlarmas = new ArrayList(10);
    private ArrayList<HacerSonar> hilos = new ArrayList(10);
    
    public CrearAlarmas() {
        
    }
    public void cancelarAlarmas() {
        for( int i = 0; i < hilos.size(); i++ ) {
            HacerSonar hiloActual = hilos.get(i);
            
            hiloActual.stop();
        } 
    }

    public void programarTodasLasAlarmas() {
        this.cancelarAlarmas();
        this.obtenerTodasLasAlarmas();
        
        for( int i = 0; i < totalAlarmas.size(); i++ ) {
            String[] alarmaActual = totalAlarmas.get(i);
            String name = alarmaActual[0];
            java.util.Date sonar = convertirTiempo( alarmaActual[1] );
            
            HacerSonar hilo = new HacerSonar( name, sonar );
            hilos.add( hilo );
            hilo.start();
        }
    }
    
    public void obtenerTodasLasAlarmas() {
        String[] keys = { "nombre","hora_sonar" };
        totalAlarmas = Database.selectAlarmas( keys );
    }

    public int[] obtenerTiempo( String tiempo ) {
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
}
