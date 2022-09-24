
package modelos;

public class Usuario {
    private String nombre, sexo, idioma;

    public Usuario(String nombre, String sexo, String idioma) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.idioma = idioma;
    }
    public Usuario( String nombre, String sexo ) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.idioma = "Español";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}
