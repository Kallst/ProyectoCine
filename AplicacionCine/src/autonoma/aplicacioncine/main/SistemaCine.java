package autonoma.aplicacioncine.main;
import autonoma.aplicacioncine.models.Boleta;
import autonoma.aplicacioncine.models.Cine;
import autonoma.aplicacioncine.models.Factura;
import autonoma.aplicacioncine.models.Funcion;
import autonoma.aplicacioncine.models.FuncionN;
import autonoma.aplicacioncine.models.FuncionP;
import autonoma.aplicacioncine.models.FuncionT;
import autonoma.aplicacioncine.models.Usuario;
import autonoma.aplicacioncine.models.Pelicula;
import autonoma.aplicacioncine.models.UsuarioAdulto;
import autonoma.aplicacioncine.models.UsuarioMayor;
import autonoma.aplicacioncine.models.UsuarioNino;
import autonoma.aplicacioncine.models.Venta;

/**
 *
 * @author LAPTOP
 */
import java.util.Scanner;

public class SistemaCine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine();
        Venta venta = new Venta(); // Venta en curso

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- SISTEMA DE VENTA DE ENTRADAS ---");
            System.out.println("1. Agregar película");
            System.out.println("2. Mostrar cartelera");
            System.out.println("3. Registrar usuario");
            System.out.println("4. Mostrar usuarios");
            System.out.println("5. Vender boleta");
            System.out.println("6. Generar factura");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la película: ");
                    String nombrePelicula = scanner.nextLine();
                    System.out.print("Precio base: ");
                    int precio = scanner.nextInt();
                    scanner.nextLine();
                    cine.agregarPelicula(new Pelicula(nombrePelicula, precio));
                    break;

                case 2:
                    cine.mostrarCartelera();
                    break;

                case 3:
                    System.out.print("Nombre del usuario: ");
                    String nombreUsuario = scanner.nextLine();

                    System.out.print("Tipo de usuario (Niño, Adulto, Mayor): ");
                    String tipo = scanner.nextLine().toLowerCase();

                    Usuario nuevoUsuario = switch (tipo) {
                        case "niño" -> new UsuarioNino(nombreUsuario, tipo);
                        case "adulto" -> new UsuarioAdulto(nombreUsuario, tipo);
                        case "mayor" -> new UsuarioMayor(nombreUsuario, tipo);
                        default -> {
                            System.out.println("Tipo inválido.");
                            yield null;
                        }
                    };
                    if (nuevoUsuario != null) cine.registrarUsuario(nuevoUsuario);
                    break;

                case 4:
                    cine.mostrarUsuarios();
                    break;

                case 5:
                    System.out.print("Nombre de la película: ");
                    String nombre = scanner.nextLine();
                    Pelicula pelicula = cine.obtenerPelicula(nombre);
                    if (pelicula == null) {
                        System.out.println("Película no encontrada.");
                        break;
                    }

                    System.out.print("Tipo de función (primera, tarde, noche): ");
                    String tipoFuncion = scanner.nextLine().toLowerCase();
                    Funcion funcion = switch (tipoFuncion) {
                        case "primera" -> new FuncionP("08:00");
                        case "tarde" -> new FuncionT("16:00");
                        case "noche" -> new FuncionN("20:00");
                        default -> {
                            System.out.println("Función inválida.");
                            yield null;
                        }
                    };
                    if (funcion == null) break;
                    scanner.ignore();
                    System.out.print("Tipo de usuario (Niño, Adulto, Mayor): ");
                    String tipoUsuario = scanner.nextLine();
                    Usuario usu = cine.obtenerUsuarioPorTipo(tipoUsuario);
                    if (usu == null) {
                        System.out.println("Usuario no registrado.");
                        break;
                    }

                    Boleta boleta = cine.venderBoleta(pelicula, funcion, usu);
                    venta.agregarBoleta(boleta);
                    System.out.println("Boleta agregada a la venta.");
                    break;

                case 6:
                    System.out.print("Número de factura: ");
                    String numFactura = scanner.nextLine();
                    System.out.print("Hora de emisión (solo la hora): ");
                    int hora = scanner.nextInt();
                    scanner.nextLine();

                    Factura factura = cine.generarFactura(venta, numFactura, hora);
                    factura.imprimirFactura();

                    // Reiniciar venta después de facturar
                    venta = new Venta();
                    break;

                case 0:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
