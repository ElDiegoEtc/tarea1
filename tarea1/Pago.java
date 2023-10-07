package tarea1;
import java.util.Date;

public abstract class Pago {
    private float monto;
    private OrdenCompra ordencompra;
    public Pago(OrdenCompra ordencompra, float monto){
        this.ordencompra = ordencompra;
        this.fecha = fecha;
        this.monto = monto;
    }
    public Date getFechaOrdenCompra() {
        return ordencompra.getFecha();
    }
}
