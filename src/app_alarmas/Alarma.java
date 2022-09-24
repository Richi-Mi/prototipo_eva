package app_alarmas;

import App_Menu_Clases.Sonidos;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 * @author Mendoza Castañeda José Ricardo
 */
public class Alarma extends TimerTask {

    private String nombre;

    public Alarma(String nombre) {
        this.nombre = nombre;
    }

    public void sonido() {
        
    }

    @Override
    public void run() {
        Sonidos objeto = new Sonidos();
        objeto.Alarma_Ambiental();
        JOptionPane.showMessageDialog( null, this.nombre);
        objeto.SoundA.stop();
        //this.sonido();
        //JOptionPane.showMessageDialog(null, this.nombre);

    }

}
