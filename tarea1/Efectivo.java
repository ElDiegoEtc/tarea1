package tarea1;
public class Efectivo extends Pago {
    public Efectivo(double montoAPagar) {
        super(montoAPagar);
    }

    @Override
    public double calcularCambio(OrdenCompra ordenCompra) {
        double precioTotal = ordenCompra.Precio();
        double montoAPagar = 0;
        return precioTotal - montoAPagar;
    }
}
