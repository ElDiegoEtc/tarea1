package tarea1;

import java.util.Date;

public class Boleta extends DocTributario {
    private int numeroBoleta;

    public Boleta(String rut, Date fecha, String direccion, int numeroBoleta) {
        super(rut, fecha, direccion);
        this.numeroBoleta = numeroBoleta;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    @Override
    public String obtenerDescripcionDocumento() {
        return "Número de boleta: " + numeroBoleta+"\n"+ "RUt: "+ getRut()+"\n"+"Direccion: "+getDireccion()+"\n";

    }
}
