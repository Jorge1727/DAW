package examenColecciones_JorgeTapia.Tienda;

public class Producto 
{
    //Atributos
    public static int num_id = 1;

    private int id;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private String categoria;

    public Producto(String nombreProducto, String descripcion, double precio, String categoria) 
    {
        this.id = num_id;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;

        num_id++;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    
    @Override
    public boolean equals(Object obj) 
    {
        boolean resultado = false;
        Producto p = (Producto)obj;

        if(this.nombreProducto.equals(p.nombreProducto))
            resultado = true;

        return resultado;
    }


    @Override
    public String toString() 
    {
        return this.id + " " + this.nombreProducto + ", PVP" + this.precio + " Categoria; " + this.categoria;  
    }    
}
