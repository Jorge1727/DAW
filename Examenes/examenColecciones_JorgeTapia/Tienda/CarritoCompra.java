package examenColecciones_JorgeTapia.Tienda;

import java.util.ArrayList;

import examenColecciones_JorgeTapia.Comparador.OrdenaPorCodigo;
import examenColecciones_JorgeTapia.Comparador.OrdenaPorNombre;

public class CarritoCompra 
{
    //Atributos
    private ArrayList<Producto> carrito;

    public CarritoCompra() 
    {
        this.carrito = new ArrayList<>();
    }

    //metodos
    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public boolean insertar(Producto elem)
    {
        boolean resultado = carrito.add(elem);

        return resultado;
    }

    public boolean eliminar(int id)
    {
        for (int i = 0; i < carrito.size(); i++) 
        {
            int numid = carrito.get(i).getId();

            if(numid == id)
            {
                carrito.remove(carrito.get(i));
                return true;
            }
        }

        return false;
    }

    public void limpiarCarrito()
    {
        this.carrito = new ArrayList<>();
    }

    public String mostrarPorCodigo()
    {
        OrdenaPorCodigo ordenaPorCodigo = new OrdenaPorCodigo();
        ArrayList<Producto> copia = new ArrayList<>(carrito);

        copia.sort(ordenaPorCodigo);

        String resultado = "";

        for (int i = 0; i < copia.size(); i++) 
        {
            resultado += copia.get(i) + "\n";    
        }

        return resultado;
    }


    public String mostrarPorNombre()
    {
        OrdenaPorNombre ordenaPorNombre = new OrdenaPorNombre();
        ArrayList<Producto> copia = new ArrayList<>(carrito);

        copia.sort(ordenaPorNombre);

        String resultado = "";

        for (int i = 0; i < copia.size(); i++) 
        {
            resultado += copia.get(i) + "\n";    
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
