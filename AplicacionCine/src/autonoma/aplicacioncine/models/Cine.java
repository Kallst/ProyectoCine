package autonoma.aplicacioncine.models;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP
 */

import java.util.ArrayList;
import java.util.List;

public class Cine {
    
    private List<Pelicula> cartelera;
    private List<Usuario> usuariosRegistrados;

    public Cine() {
        this.cartelera = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
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
        return null;
    }

    // --- Gestión de usuarios ---
    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    public void mostrarUsuarios() {
    System.out.println("Usuarios registrados:");
    for (int i = 0; i < usuariosRegistrados.size(); i++) {
        Usuario u = usuariosRegistrados.get(i);
        System.out.println((i + 1) + ". " + u.getNombre() + " (" + u.getTipo() + ") - Descuento: $" + u.getDescuento());
    }
}

    public Usuario obtenerUsuarioPorNombre(String nombre) {
    for (Usuario usuario : usuariosRegistrados) {
        if (usuario.getNombre().equalsIgnoreCase(nombre)) {
            return usuario;
        }
    }
    return null;
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
