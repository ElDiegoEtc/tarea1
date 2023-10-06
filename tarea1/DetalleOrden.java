package tarea1;
    public class DetalleOrden {
    private int cantidad;
    private float Iva;
    private float PrecioTotal;
    private float PrecioSinIVA;
    private Articulo articulo;
    private float CalculoPeso;
    public DetalleOrden (Articulo articulo, int cantidad){
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
    public void calcPrecio(){
        PrecioTotal=  cantidad * articulo.getPrecio();
    }

    public void calcPrecioSinIVA(){
        PrecioSinIVA= (float) (cantidad * articulo.getPrecio() * 0.81);
    }
    public void calclIVA(){
        Iva= (float) (cantidad * articulo.getPrecio() * 0.19);
    }
    public void calcPeso(){
        CalculoPeso= (float) (cantidad * articulo.getPeso() * 0.81);
    }

        @Override
        public String toString() {
            return "DetalleOrden{" +
                    "cantidad=" + cantidad +
                    ", Iva=" + Iva +
                    ", PrecioTotal=" + PrecioTotal +
                    ", PrecioSinIVA=" + PrecioSinIVA +
                    ", articulo=" + articulo +
                    ", CalculoPeso=" + CalculoPeso +
                    '}';
        }
    }
