package autonoma.aplicacioncine.models;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP
 */

public class Cine {
    private List<Pelicula> cartelera;

    public Cine() {
        this.cartelera = new ArrayList<>();
    }

    // --- Gestión de cartelera ---
    public void agregarPelicula(Pelicula pelicula) {
        cartelera.add(pelicula);
    }

    public void mostrarCartelera() {
        System.out.println("Cartelera actual:");
        for (Pelicula p : cartelera) {
            System.out.println("- " + p.getNombre() + " (Precio base: $" + p.getPrecioBase() + ")");
        }
    }

    public Pelicula obtenerPelicula(String nombre) {
        for (Pelicula pelicula : cartelera) {
            if (pelicula.getNombre().equalsIgnoreCase(nombre)) {
                return pelicula;
            }
        }
        return null; // No encontrada
    }

    // --- Venta de boletas ---
    public Boleta venderBoleta(Pelicula pelicula, Funcion funcion, Usuario usuario) {
        return new Boleta(pelicula, funcion, usuario);
    }

    // --- Facturación ---
    public Factura generarFactura(Venta venta, String numeroFactura, int hora) {
        return new Factura(venta, numeroFactura, hora);
    }
}

