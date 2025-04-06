package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */

public class FuncionT extends Funcion {

    public FuncionT(String horario) {
        super(horario);
    }

    @Override
    public double getDescuento() {
        return 0.1; // 10% de descuento
    }

    @Override
    public String getNombre() {
        return "Función de la tarde";
    }
}
