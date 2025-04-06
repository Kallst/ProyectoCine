package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */

public class Pelicula {
    
    private String nombre;
    private int precioBase;

    public Pelicula(String nombre, int precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    
}

