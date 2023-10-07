package tarea1 ;
import java.util.Date;

public abstract class DocTributario {
    private String rut;
    private Date fecha;
    private String direccion;
//creamos el constructor del documentro tributario
    public DocTributario(String rut, Date fecha, String direccion) {
        this.rut = rut;
        this.fecha = fecha;
        this.direccion = direccion;
    }
    //AHORA CREAMOS GETTER Y SETTERS DE CADA CLASE CON SU METODO ToString


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRut() {
        return rut;
    }
    // Método abstracto para obtener la descripción del documento tributario segun sea boleta o factura
    public abstract String obtenerDescripcionDocumento();

    @Override
    public String toString() {
        return "DocTributario{" +
                "rut='" + rut + '\'' +
                ", fecha=" + fecha +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

