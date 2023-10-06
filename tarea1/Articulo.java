/**
 *
 */
package tarea1;
public class Articulo {
    private float Peso;
    private String NombreProducto;
    private String Descripcion;
    private float Precio;
    public Articulo(float Peso,String NombreProducto,String Descripcion,float Precio){
        this.Peso=Peso;
        this.NombreProducto=NombreProducto;
        this.Descripcion=Descripcion;
        this.Precio=Precio;
    }
//GETTERS
    public float getPrecio() {
        return Precio;
    }

    public float getPeso() {
        return Peso;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }
    //SETTERS

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "Peso=" + Peso +
                ", NombreProducto='" + NombreProducto + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
