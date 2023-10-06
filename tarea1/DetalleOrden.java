package tarea1;
    public class DetalleOrden {
    private int cantidad;
    public DetalleOrden (Articulo articulo, int cantidad){
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
    public float calcPrecio(){
        return cantidad * articulo.getPrecio();
    }
    public float calcPrecioSinIVA(){
        return cantidad * articulo.getPrecio() * 0.81;
    }
    public float calclIVA(){
        return cantidad * articulo.getPrecio() * 0.19;
    }
    public float calcPeso(){
        return cantidad * articulo.getPeso() * 0.81;
    }
}
