package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */

public class Factura {
    
    private Venta venta;
    private String numeroFactura;
    private int hora;

    public Factura(Venta venta, String numeroFactura, int hora) {
        this.venta = venta;
        this.numeroFactura = numeroFactura;
        this.hora = hora;
    }

    public void imprimirFactura() {
        System.out.println("======= FACTURA =======");
        System.out.println("Número de factura: " + numeroFactura);
        System.out.println("Hora de emisión: " + hora + ":00");
        System.out.println();

        venta.mostrarDetalleVenta();

        System.out.println("========================");
    }
}
