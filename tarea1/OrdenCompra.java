package tarea1 ;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class OrdenCompra {
    private Date fecha;
    private String Estado;
    private Cliente cliente;
    private ArrayList<DetalleOrden> Detalles;

    /**
     *
     * @param fecha
     * @param estado
     * @param cliente
     */
    public OrdenCompra(Date fecha, String estado, Cliente cliente){
this.fecha=fecha;
this.Estado=estado;
this.cliente=cliente;
this.Detalles= new ArrayList<DetalleOrden>();
    }

    //metodo para agregar Detalle de orden al array list
    public void AgregaDetalle(DetalleOrden detalleOrden){
        Detalles.add(detalleOrden);

    }


}
