package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */
public class UsuarioAdulto extends Usuario{    

    public UsuarioAdulto(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    @Override
    public int getDescuento() {
        return 0;
    }

    @Override
    public String getTipo() {
        return " adulto ";
    }
}
