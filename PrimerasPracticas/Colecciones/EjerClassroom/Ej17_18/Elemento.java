package Colecciones.EjerClassroom.Ej17_18;

public class Elemento 
{
    //Atributos
    private String nombreProducto;
    private double precio;
    private int cantidad;

    public Elemento(String nombreProducto, double precio, int cantidad) 
    {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        boolean resultado = false;
        Elemento e = (Elemento)obj;

        if(this.nombreProducto.equals(e.nombreProducto) && this.precio == e.precio)
            resultado = true;

        return resultado;
    }


    @Override
    public String toString() 
    {
        return this.nombreProducto + ":PVP" + this.precio + " Unidades: " + this.cantidad + "Subtotal";  
    }
    

    
}
