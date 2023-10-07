package tarea1;
public class Cliente {
    private String rut;
    private Direccion direccion;

    public Cliente(String rut, Direccion direccion) {
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
