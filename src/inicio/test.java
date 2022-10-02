
package inicio;

import modelos.Usuario;
import database.Database;
import java.util.ArrayList;
import modelos.Alarma;

public class test {

    public static void main(String[] args) {
        Usuario us = new Usuario("Juan", "HOMBRE", "MUJER");
        Alarma alr = new Alarma("VEr Videos", "extra", 1, "10:10:10");
        
        ArrayList<String[]> usr = Database.getUsers();
        
        for( int i = 0; i < usr.size(); i++ ) {
            String[] dataUsr = usr.get(i);
            for( int j = 0; j < dataUsr.length; j++ ) {
                System.out.println( ( i + 1 ) + ". - " + dataUsr[j]);
            }
        }
    }
    
}
