package tarea1;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) {
        // Crea una instancia de Calendar y configura la fecha deseada (por ejemplo, 23 de marzo)
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.MARCH); // Marzo es el tercer mes (0-indexed)
        calendar.set(Calendar.DAY_OF_MONTH, 23);

        // Convierte el Calendar a un objeto Date
        Date fechaEspecifica = calendar.getTime();

        // Crea un objeto Boleta o Factura (según corresponda) con la fecha específica
        DocTributario documento = new Boleta("123456789", fechaEspecifica, "Calle Ejemplo 123", 12345);

        Articulo a1 = new Articulo(18, "leche", "rica en proteina", 12);
        Articulo a2 = new Articulo(15, "galleras", "rica en proteina", 10);
        DetalleOrden D1 = new DetalleOrden(a1, 2);
        DetalleOrden D2 = new DetalleOrden(a2, 3);

        // Asigna el documento tributario al crear la OrdenCompra
        OrdenCompra o1 = new OrdenCompra(null, "deuda", null, documento);

        o1.AgregaDetalle(D1);
        o1.AgregaDetalle(D2);

        o1.calcularPesoTotal();
        o1.CalPreciSinIva();
        o1.Precio();
        o1.PrecioIva();
        System.out.println(o1.toString());




    }
}
