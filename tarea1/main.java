package tarea1;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) {
        // Crea una instancia de Calendar y configura la fecha deseada (por ejemplo, 23 de marzo)
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.MARCH); // Marzo es el tercer mes
        calendar.set(Calendar.DAY_OF_MONTH, 23);

        // Convierte el Calendar a un objeto Date
        Date fechaEspecifica = calendar.getTime();

        // Crea un objeto Boleta o Factura (según corresponda) con la fecha específica
        Direccion direccion=new Direccion("concepcion2121");
        Direccion direccion2=new Direccion("concepcion2121");
        Direccion direccion3=new Direccion("concepcion2121");

        Cliente cliente = new Cliente("123456789", direccion);
        Cliente cliente2 = new Cliente("123456789", direccion);
        Cliente cliente3 = new Cliente("123456789", direccion);

        DocTributario documento = new Boleta(cliente.getRut(), fechaEspecifica, "Calle Ejemplo 123", 12345);
        DocTributario documento2 = new Boleta(cliente2.getRut(), fechaEspecifica, "Calle Ejemplo 123", 12345);
        DocTributario documento3 = new Boleta(cliente3.getRut(), fechaEspecifica, "Calle Ejemplo 123", 12345);

        Articulo a1 = new Articulo(18, "leche", "rica en proteina", 12);
        Articulo a2 = new Articulo(9, "harina", "rica en proteina", 16);
        Articulo a3 = new Articulo(7, "porotos", "rica en proteina", 15);
        Articulo a4 = new Articulo(6, "choritos", "rica en proteina", 17);
        Articulo a5 = new Articulo(3, "gelatina", "rica en proteina", 19);

        DetalleOrden D1 = new DetalleOrden(a1, 2);
        DetalleOrden D2 = new DetalleOrden(a2, 3);
        DetalleOrden D3 = new DetalleOrden(a3, 4);

        // Asigna el documento tributario al crear la OrdenCompra
        OrdenCompra o1 = new OrdenCompra(fechaEspecifica, "deuda", cliente, documento);

        o1.AgregaDetalle(D1);
        o1.AgregaDetalle(D2);
        o1.AgregaDetalle(D3);

        o1.calcularPesoTotal();
        o1.CalPreciSinIva();
        o1.Precio();
        o1.PrecioIva();
        System.out.println(o1.toString());




    }
}
