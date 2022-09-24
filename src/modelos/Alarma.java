package modelos;

import App_Menu_Clases.Sonidos;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public class Alarma extends TimerTask {

    private String nombre, tipo;
    private int id_usuario;

    public Alarma( String nombre, String tipo, int id_usuario ) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.id_usuario = id_usuario;
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
