
package inicio;

import modelos.Usuario;
import database.Database;
import java.util.ArrayList;
import modelos.Alarma;

public class test {

    private static String[] keys_usr = {"id_usuario", "nombre", "sexo", "idioma"};
    private static String[] keys_alr = {"id_alarmas_extra", "nombre", "tipo", "hora_sonar"};
    private static String[] keys_con = {"id_contact", "nombre", "sexo", "idioma", "id_usuario", "parentesco", "numero"};
    
    public static void main(String[] args) {        
        ArrayList<String[]> usr = Database.selectContacts( keys_con, "id_contact = 1" );
        
        for( int i = 0; i < usr.size(); i++ ) {
            String[] dataUsr = usr.get(i);
            for( int j = 0; j < dataUsr.length; j++ ) {
                System.out.println( ( i + 1 ) + ". - " + dataUsr[j]);
            }
        }
    }
    
}
