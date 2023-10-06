package tarea1 ;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String Estado;
    private Cliente cliente;
    private ArrayList<ArrayList<DetalleOrden>> Detalles;
    public OrdenCompra(Date fecha, String estado, Cliente cliente){
this.fecha=fecha;
this.Estado=estado;
this.cliente=cliente;
    }

    //metodo para agregar Detalle de orden al array list
    public void AgregaDetalle(){
       // Detalles.add(Detalles);
    }


}
