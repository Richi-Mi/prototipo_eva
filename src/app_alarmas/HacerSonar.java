
package app_alarmas;

import modelos.Alarma;
import java.util.Date;
import java.util.Timer;

/**
 * @author richi_mc
 */

public class HacerSonar extends Thread {

    private String nombre;
    private Date sonar;

    public HacerSonar(String nombre, Date sonar) {
        this.nombre = nombre;
        this.sonar = sonar;
    }
    
    @Override
    public void run() {
        Timer timer = new Timer();
        Alarma alarma = new Alarma( nombre );
        
        System.out.println("HOla");
        timer.schedule(alarma, sonar);
    }
    
}
