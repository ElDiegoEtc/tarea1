package tarea1;
import java.util.Date;

public class Factura extends DocTributario {
    private int numeroFactura;

    public Factura(String rut, Date fecha, String direccion, int numeroFactura) {
        super(rut, fecha, direccion);
        this.numeroFactura = numeroFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    @Override
    public String obtenerDescripcionDocumento() {
        return "Número de Factura:"+getNumeroFactura()+"\n"+ "RUt: "+ getRut()+"\n"+"Direccion: "+getDireccion()+"\n";

    }
}
