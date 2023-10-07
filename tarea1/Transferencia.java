package tarea1 ;
public class Transferencia extends Pago {
    public Transferencia(double montoAPagar) {
        super(montoAPagar);
    }

    @Override
    public double calcularCambio(OrdenCompra ordenCompra) {
        return 0;
    }
}
