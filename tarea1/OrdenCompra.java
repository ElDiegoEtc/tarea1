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
        this.losdetalles = new ArrayList<>();
    }
    //metodo para agregar Detalle de orden al array list
    public void AgregaDetalle(DetalleOrden detalle){
       losdetalles.add(detalle);
    }

    public double Precio(){
        float total = 0;
        for (int i=0;i<losdetalles.size();i++ ){
            DetalleOrden detalle = losdetalles.get(i);
            total = (float) (total + detalle.calcularSubtotal());
        }
        return total;
    }
    //Metodo para el calculo del precio total de compra sin IVA
public double CalPreciSinIva(){
        double totalSinIva= Precio()*0.81;
        return totalSinIva;
}
    //Metodo para el calculo del IVA
    public double PrecioIva(){
       double PrecioIva=Precio()*0.19;
       return PrecioIva;
    }
    public ArrayList<DetalleOrden> getLosdetalles() {
        return losdetalles ;
    }
    //METODO PARA CALCULAR EL PESO TOTAL, HAREMOS UN FOR EACH
    public double calcularPesoTotal() {
        double pesoTotal = 0;
        for (DetalleOrden detalle : losdetalles){
            pesoTotal += detalle.getArticulo().getPeso() * detalle.getCantidad();
        }
        return pesoTotal;
    }
    //Getter y setters

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", cliente=" + cliente +
                ", Total sin Iva='" + CalPreciSinIva()+ '\'' +
                ", Total IVA='" + PrecioIva()+ '\'' +
                ", Total PRECIO CON IVA='" + Precio()+ '\'' +

                ", losdetalles=" + losdetalles  +
                "\n" +
                '}';
    }
}
