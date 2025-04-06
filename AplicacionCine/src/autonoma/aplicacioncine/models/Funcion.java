package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */

public abstract class Funcion {
    
    protected String horario;

    public Funcion(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public abstract double getDescuento();  // Retorna un valor entre 0.0 y 1.0
    public abstract String getNombre();     // Retorna el nombre de la función
    
}
