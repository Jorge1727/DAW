package examenColecciones_JorgeTapia;

import java.util.HashMap;
import java.util.HashSet;

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
        boolean resultado = almacen.add(producto);

        return resultado;
    }

    @Override
    public String mostrarProductosAlmacenPorNombre() 
    {
        String resultado = "";

        for (Producto producto : almacen) 
        {
            resultado += producto.toString() + "\n";
        }

        return resultado;
    }

    @Override
    public String mostrarProductosAlmacenPorId() 
    {
        String resultado = "";

        for (Producto producto : almacen) 
        {
            resultado += producto.toString() + "\n";
        }

        return resultado;
    }

    @Override
    public Producto buscarProductoAlmacen(int id) 
    {
        Producto p;

        for (int i = 0; i < almacen.size(); i++) 
        {
            if(numid == id)
            {
                carrito.remove(carrito.get(i));
                resultado = true;
            }
        }

        return resultado;
    }

    @Override
    public double obtenerCuentaTotal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerCuentaTotal'");
    }
    
}
