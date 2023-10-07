package tarea1;
import java.util.Date;

public abstract class Pago {
    private float monto;
    private OrdenCompra ordencompra;
    public Pago(OrdenCompra ordencompra, float monto){
        this.ordencompra = ordencompra;
        this.monto = monto;
    }

    public Pago(double montoAPagar) {
    }

    public Date getFechaOrdenCompra() {
        return ordencompra.getFecha();
    }
    public abstract double calcularCambio(OrdenCompra ordenCompra);

}
