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

    public float getPrecio() {
        return Precio;
    }

    public float getPeso() {
        return Peso;
    }
}
