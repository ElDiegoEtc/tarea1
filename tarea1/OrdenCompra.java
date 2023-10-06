package tarea1 ;
import java.util.ArrayList;
import java.util.Date;
public class OrdenCompra {
    private Date fecha;
    private String estado;
    private Cliente cliente;
    private ArrayList<DetalleOrden> losdetalles;
    public OrdenCompra(Date fecha, String estado, Cliente cliente){
        this.fecha=fecha;
        this.estado=estado;
        this.cliente=cliente;
    }
    //metodo para agregar Detalle de orden al array list
    public void AgregaDetalle(DetalleOrden detalle){
       losdetalles.add(detalle);
    }

    public float calcPrecio(){
        float total = 0;
        for (int i=0;i<losdetalles.size();i++ ){
            DetalleOrden detalle = losdetalles.get(i);
            total = total + detalle.calcPrecio();
        }
        return total;
    }
    /* hay que usar el calcPrecio para los 2 primeros
    public float calcPrecioSinIVA(){
        return (float) (cantidad * articulo.getPrecio() * 0.81);
    }
    public float calclIVA(){
        return (float) (cantidad * articulo.getPrecio() * 0.19);
    }
    public float calcPeso(){
        return (float) (cantidad * articulo.getPeso() * 0.81);
    }*/
}
