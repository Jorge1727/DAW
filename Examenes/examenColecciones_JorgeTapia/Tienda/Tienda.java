package examenColecciones_JorgeTapia.Tienda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import examenColecciones_JorgeTapia.Comparador.OrdenaPorCodigo;
import examenColecciones_JorgeTapia.Comparador.OrdenaPorNombre;

public class Tienda implements Tienda_I
{
    CarritoCompra carrito;
    DescuentoPorCategoria descuentoPorCategoria;
    HashSet<Producto> almacen;

    public Tienda() {
        almacen = new HashSet<>();
        carrito = new CarritoCompra();
        descuentoPorCategoria = new DescuentoPorCategoria();
    }

    public CarritoCompra getCarrito() {
        return carrito;
    }

    public DescuentoPorCategoria getDescuentoPorCategoria() {
        return descuentoPorCategoria;
    }

    @Override
    public boolean insertarProductoAlmacen(Producto producto) 
    {
        for (Producto prod : almacen) 
        {
            if(prod.equals(producto))
                return false;    
        }

        return almacen.add(producto);
    }

    @Override
    public String mostrarProductosAlmacenPorNombre() 
    {
        OrdenaPorNombre ordenaPorNombre = new OrdenaPorNombre();
        ArrayList<Producto> copia = new ArrayList<>(almacen);

        copia.sort(ordenaPorNombre);

        String resultado = "";

        for (int i = 0; i < copia.size(); i++) 
        {
            resultado += copia.get(i) + "\n";    
        }

        return resultado;
    }

    @Override
    public String mostrarProductosAlmacenPorId() 
    {
        OrdenaPorCodigo ordenaPorCodigo = new OrdenaPorCodigo();
        ArrayList<Producto> copia = new ArrayList<>(almacen);

        copia.sort(ordenaPorCodigo);

        String resultado = "";

        for (int i = 0; i < copia.size(); i++) 
        {
            resultado += copia.get(i) + "\n";    
        }

        return resultado;
    }

    @Override
    public Producto buscarProductoAlmacen(int id) 
    {
        for (Producto producto : almacen) 
        {
            int numid = producto.getId();
            
            if(numid == id)
                return producto;
        }

        return null;

    }

    @Override
    public double obtenerCuentaTotal() 
    {
        return 10.0;
    }
    
}
