package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */

public class Boleta {
    private Pelicula pelicula;
    private Funcion funcion;
    private IUsuario usuario;
    private int precioFinal;

    public Boleta(Pelicula pelicula, Funcion funcion, IUsuario usuario) {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        this.precioFinal = calcularPrecio();
    }

    private int  calcularPrecio() {
        
        int precioBase = pelicula.getPrecioBase();
        double descuentoFuncion = funcion.getDescuento();
        int descuentoUsuario = usuario.getDescuento();
        int precioTotal = (int) (precioBase * (1 - descuentoFuncion) - descuentoUsuario);

        // Descuento sin validación de mínimo
        return precioTotal;
    }
   
    public int getPrecioFinal() {
        return precioFinal;
    }

    public void mostrarDetalle() {
        System.out.println("Película: " + pelicula.getNombre());
        System.out.println("Función: " + funcion.getNombre() + " (" + funcion.getHorario() + ")");
        System.out.println("Usuario: " + usuario.getTipo());
        System.out.println("Precio final: $" + precioFinal);
    }
}

