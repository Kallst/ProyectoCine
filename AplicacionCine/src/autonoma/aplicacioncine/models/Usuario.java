package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public abstract class Usuario {
    protected String nombre;
    protected String tipo;

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract int getDescuento();
}

