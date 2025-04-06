package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioAdulto implements IUsuario{
    @Override
    public int getDescuento() {
        return 0;
    }

    @Override
    public String getTipo() {
        return "Adulto";
    }
}
