package tarea1;
public class Direccion {
    private String Direccion;
    public Direccion(String Direccion){
        this.Direccion=Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "Direccion='" + Direccion + '\'' +
                '}';
    }
}
