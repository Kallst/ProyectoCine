package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class FuncionP extends Funcion {

    public FuncionP(String horario) {
        super(horario);
    }

    @Override
    public double getDescuento() {
        return 0.5; // 50% de descuento
    }

    @Override
    public String getNombre() {
        return " primera funcion ";
    }
}
