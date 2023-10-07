package tarea1;
public class Efectivo extends Pago {
<<<<<<< HEAD
    public Efectivo(OrdenCompra ordencompra, float monto){
        super(ordencompra, monto);
    }
    public float calcDevolucion(){
        double valorOrdencompra = super.ordencompra.Precio();
        return super.getMonto() - valorOrdencompra;
    }
=======
>>>>>>> 637b60b9afae35848b4edeadcb1c7827dde6e497
}
