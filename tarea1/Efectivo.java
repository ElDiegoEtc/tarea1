package tarea1;
public class Efectivo extends Pago {
    public Efectivo(OrdenCompra ordencompra, float monto){
        super(ordencompra, monto);
    }
    public float calcDevolucion(){
        double valorOrdencompra = super.ordencompra.Precio();
        return super.getMonto() - valorOrdencompra;
    }
}
