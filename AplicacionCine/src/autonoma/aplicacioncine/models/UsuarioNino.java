package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioNino extends Usuario 
{    

    public UsuarioNino(String nombre, String tipo) {
        super(nombre, tipo);
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
