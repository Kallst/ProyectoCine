package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioMayor extends IUsuario {
    @Override
    public int getDescuento() {
        return 1000;
    }

    @Override
    public String getTipo() {
        return " persona mayor ";
    }
}
