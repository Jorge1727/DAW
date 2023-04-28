package examenColecciones_JorgeTapia;

import java.util.ArrayList;

public class CarritoCompra 
{
    //Atributos
    ArrayList<Producto> carrito;

    public CarritoCompra() 
    {
        carrito = new ArrayList<>();
    }

    //metodos
    public boolean insertar(Producto elem)
    {
        boolean resultado = carrito.add(elem);

        return resultado;
    }

    public boolean eliminar(int id)
    {
        boolean resultado = false;

        for (int i = 0; i < carrito.size(); i++) 
        {
            int numid = carrito.get(i).getId();

            if(numid == id)
            {
                carrito.remove(carrito.get(i));
                resultado = true;
            }
        }

        return resultado;
    }

    public void limpiarCarrito()
    {
        for (int i = 0; i < carrito.size(); i++) 
        {
            carrito.remove(i);   
        }
    }

    public String mostrarPorCodigo()
    {
        String resultado = "";

        for (Producto producto : carrito) 
        {
            resultado += producto.toString() + "\n";
        }

        return resultado;
    }


    public String mostrarPorNombre()
    {
        String resultado = "";

        for (Producto producto : carrito) 
        {
            resultado += producto.toString() + "\n";
        }

        return resultado;
    }

    @Override
    public String toString() 
    {
        String resultado = "";

        for (Producto producto : carrito) 
        {
            resultado += producto.toString() + "\n";
        }

        return resultado;
    }
}
