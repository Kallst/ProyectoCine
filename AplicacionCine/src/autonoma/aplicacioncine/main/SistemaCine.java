package autonoma.aplicacioncine.main;
import autonoma.aplicacioncine.models.Boleta;
import autonoma.aplicacioncine.models.Factura;
import autonoma.aplicacioncine.models.Funcion;
import autonoma.aplicacioncine.models.FuncionP;
import autonoma.aplicacioncine.models.IUsuario;
import autonoma.aplicacioncine.models.Pelicula;
import autonoma.aplicacioncine.models.UsuarioNino;
import autonoma.aplicacioncine.models.Venta;

/**
 *
 * @author LAPTOP
 */
public class SistemaCine {
    public static void main(String[] args) {
        // Crear película
        Pelicula pelicula = new Pelicula("Interestelar", 10000);

        // Crear función (primera función a las 8:00)
        Funcion funcion = new FuncionP("08:00");

        // Crear usuario (niño)
        IUsuario usuario = new UsuarioNino();

        // Crear boleta
        Boleta boleta = new Boleta(pelicula, funcion, usuario);

        // Crear venta y agregar boleta
        Venta venta = new Venta();
        venta.agregarBoleta(boleta);

        // Crear factura con número y hora de emisión
        Factura factura = new Factura(venta, "F001", 8);

        // Imprimir factura
        factura.imprimirFactura();
    }
}
