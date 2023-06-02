package clases;

public class Producto 
{
    //A
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    //C
    public Producto() {
    }

    public Producto(int codigo, String nombre, String descripcion, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    //M
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object obj) {
        Producto producto=(Producto)obj;

        return this.codigo == producto.codigo;
    }


    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
                + precio + ", stock=" + stock + "]";
    }

     
    
}
