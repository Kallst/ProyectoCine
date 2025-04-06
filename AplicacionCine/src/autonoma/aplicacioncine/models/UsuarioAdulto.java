package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioAdulto extends IUsuario{
    @Override
    public int getDescuento() {
        return 0;
    }

    @Override
    public String getTipo() {
        return " adulto ";
    }
}
