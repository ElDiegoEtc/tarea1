package tarea1;

public class main {
    public static void main(String[] args) {
        Articulo a1= new Articulo(18,"leche","rica en proteina",12);
        Articulo a2= new Articulo(15,"galleras","rica en proteina",10);
        DetalleOrden D1= new DetalleOrden(a1,2);
        DetalleOrden D2=new DetalleOrden(a2,3);
        OrdenCompra o1= new OrdenCompra(null,"deuda",null);
        o1.AgregaDetalle(D1);
        o1.AgregaDetalle(D2);
        o1.calcularPesoTotal();
        o1.CalPreciSinIva();
        o1.Precio();
        o1.PrecioIva();
        System.out.println(o1.toString());





    }
}
