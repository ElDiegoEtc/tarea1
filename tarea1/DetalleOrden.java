package tarea1;
public class DetalleOrden {
    private Articulo articulo;
    private int cantidad;

    public DetalleOrden(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    //Metodo para calcular los subtotales de los productos
    public double calcularSubtotal() {
        return articulo.getPrecio() * cantidad;
    }
    //Metodo para el calculo del precio sin iva
    public double PrecioSinIva(){
        return articulo.getPrecio() * cantidad*0.81;
    }
    //Metodo para el calculo del iva
    public double PrecioIva(){
        return articulo.getPrecio() * cantidad*0.19;
    }

    // Getters y setters
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "articulo=" + articulo +
                ", cantidad=" + cantidad +
                ", subtotal sin Iva=" + PrecioSinIva() +
                ", Iva=" + PrecioIva() +
                ", subtotal=" + calcularSubtotal() +
                "\n" +
                '}';
    }
}