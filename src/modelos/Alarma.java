package modelos;

import helpers.Sonidos;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 * @author Mendoza Castañeda José Ricardo
 */

// hora_sonar: 00:00:00
public class Alarma extends TimerTask {
    
    // Tipos
    private static String personales = "personales";
    private static String extra = "extra";
    private static String medicina = "medicina";
    private static String pasatiempos = "pasatiempos";
    private static String cumpleaños = "cumpleaños";

    public Alarma( String nombre ) {
        this.nombre = nombre;
    }
    
    public static String getPersonales() {
        return personales;
    }

    public static String getExtra() {
        return extra;
    }

    public static String getMedicina() {
        return medicina;
    }

    public static String getPasatiempos() {
        return pasatiempos;
    }

    public static String getCumpleaños() {
        return cumpleaños;
    }

    private String nombre, tipo, hora_sonar;
    private int id_usuario;

    // Constructor para consultas.
    public Alarma( String nombre, String tipo, int id_usuario, String hora ) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.id_usuario = id_usuario;
        this.hora_sonar = hora;
    }

    public String getHora_sonar() {
        return hora_sonar;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    @Override
    public void run() {
        // Codigo de Juan Pablo, Alarmas
        Sonidos objeto = new Sonidos();
        objeto.Alarma_Ambiental();
        
        JOptionPane.showMessageDialog( null, this.nombre);
        objeto.SoundA.stop();
    }

}
