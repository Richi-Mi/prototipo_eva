
package inicio;

import modelos.Usuario;
import database.Database;
import modelos.Alarma;

public class test {

    public static void main(String[] args) {
        Usuario us = new Usuario("Juan", "HOMBRE", "MUJER");
        Alarma alr = new Alarma("VEr Videos", "extra", 1);
        Database.insert(alr);
        Database.insert(us);
    }
    
}
