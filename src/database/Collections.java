
package database;

/**
 * @author Mendoza Castañeda José Ricardo
 */

public enum Collections {
    USUARIO("usuario"),
    ALARMAS("alarmas");

    @Override
    public String toString() {
        return "Collections{" + "nombre=" + nombre + '}';
    }
    
    private Collections( String nombre ) {
        this.nombre = nombre;
    } 
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    
    
}
