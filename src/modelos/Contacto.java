
package modelos;

/**
 * @author José Ricardo Mendoza Castañeda
 */
public class Contacto extends Usuario {
    
    private String parentesco;
    private String numero;
    private int id_usuario;
    
    public Contacto( String nombre, String sexo, String idioma, int id_usuario ) {
        super(nombre, sexo, idioma);
        this.id_usuario = id_usuario;
    }
    public Contacto( String nombre, String sexo, int id_usuario ) {
        super( nombre, sexo );
        this.id_usuario = id_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
//    
}
