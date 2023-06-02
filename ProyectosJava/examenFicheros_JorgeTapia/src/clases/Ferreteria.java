package clases;

import java.util.ArrayList;

import utiles.Utils;

public class Ferreteria 
{
    //A
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;
    
    //C
    public Ferreteria() 
    {
        this.clientes = Utils.leerClientes();
        this.productos = Utils.leerProductos();
        this.ventas = Utils.leerVentas();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    

    
}
