package examenColecciones_JorgeTapia;

public class Producto 
{
    //Atributos
    public int id = 1;

    private int num_id;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private String categoria;

    public Producto(String nombreProducto, String descripcion, double precio, String categoria) 
    {
        this.num_id = id;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;

        id++;
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
