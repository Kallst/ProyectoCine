package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioMayor extends Usuario {

    public UsuarioMayor(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    @Override
    public int getDescuento() {
        return 1000;
    }

    @Override
    public String getTipo() {
        return " persona mayor ";
    }
}
