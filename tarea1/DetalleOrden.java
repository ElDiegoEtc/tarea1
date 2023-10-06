package tarea1;
    public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden (Articulo articulo, int cantidad){
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
    public float calcPrecio(){
        return cantidad * articulo.getPrecio();
    }
    public float calcPrecioSinIVA(){
        return (float) (cantidad * articulo.getPrecio() * 0.81);
    }
    public float calclIVA(){
        return (float) (cantidad * articulo.getPrecio() * 0.19);
    }
    public float calcPeso(){
        return (float) (cantidad * articulo.getPeso() * 0.81);
    }

}
