package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioNino extends Usuario 
{    

    public UsuarioNino(String nombre) {
        super(nombre);
    }

    @Override
    public int getDescuento() {
        return 500;
    }

    @Override
    public String getTipo() {
        return " niño ";
    }
    
}
