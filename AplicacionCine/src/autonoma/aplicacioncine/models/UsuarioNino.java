package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioNino implements IUsuario 
{

    @Override
    public int getDescuento() {
        return 500;
    }

    @Override
    public String getTipo() {
        return " niño ";
    }
    
}
