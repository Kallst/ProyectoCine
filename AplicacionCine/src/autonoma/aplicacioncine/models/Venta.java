package autonoma.aplicacioncine.models;

/**
 *
 * @author LAPTOP
 */

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Boleta> boletas;

    public Venta() {
        this.boletas = new ArrayList<>();
    }

    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    public int calcularTotal() {
        int total = 0;
        for (Boleta boleta : boletas) {
            total += boleta.getPrecioFinal();
        }
        return total;
    }

    public void mostrarDetalleVenta() {
        
        System.out.println("Detalle de la venta:");
        for (Boleta boleta : boletas) {
            System.out.println("---------------------------");
            boleta.mostrarDetalle();
        }
        System.out.println("---------------------------");
        System.out.println("Total a pagar: $" + calcularTotal());
        
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }
}

