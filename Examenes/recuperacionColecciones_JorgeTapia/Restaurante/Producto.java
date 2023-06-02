package recuperacionColecciones_JorgeTapia.Restaurante;

import java.util.HashSet;

public class Producto 
{
    //Atributos
    public static int num_id = 100;
    public enum TipoProducto {BOCATA, SANDWICH, PIZZA, CAMPERO, BEBIDA, POSTRE};


    private int id;
    private String nombreProducto;
    private TipoProducto tipo;
    private HashSet<String> ingredientes;
    private double precio;

    public Producto(String nombreProducto, TipoProducto tipo, HashSet<String> ingredientes, double precio) 
    {
        this.id = num_id;
        this.nombreProducto = nombreProducto;
        this.tipo = tipo;
        this.ingredientes = new HashSet<>();

        num_id++;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
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
        return this.id + " " + this.nombreProducto + ", PVP" + this.precio;  
    }    
}

