package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public abstract class Usuario {
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract int getDescuento();
    public abstract String getTipo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
