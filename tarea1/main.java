package tarea1;

public class main {
    public static void main(String[] args) {
        Articulo a1= new Articulo(18,"leche","rica en proteina",12);
        DetalleOrden D1= new DetalleOrden(a1,2);
        System.out.println(D1.calclIVA());

    }
}
