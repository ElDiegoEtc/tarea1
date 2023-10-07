package tarea1;
public class Tarjeta extends Pago{
    public Tarjeta(double montoAPagar) {
        super(montoAPagar);
    }

    @Override
    public double calcularCambio(OrdenCompra ordenCompra) {
return 0;
    }
}
