package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */

public class FuncionN extends Funcion {

    public FuncionN(String horario) {
        super(horario);
    }

    @Override
    public double getDescuento() {
        return 0.0; // Sin descuento
    }

    @Override
    public String getNombre() {
        return " funcion de la noche ";
    }
    
}
