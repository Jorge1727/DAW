package Colecciones.EjerClassroom.Ej17_18;

import java.util.ArrayList;

public class Carrito  
{
    //Atributos
    ArrayList<Elemento> carrito;

    public Carrito() 
    {
        carrito = new ArrayList<>();
        
    }

    //metodos
    public void agrega(Elemento elem)
    {
        if(carrito.contains(elem))
        {
            for (Elemento elemento : carrito) 
            {
                if(elemento.equals(elem))
                {
                    elemento.setCantidad(elemento.getCantidad() + elem.getCantidad());
                }
            }
        }
        else 
        {
            carrito.add(elem);
        }

    }

    public int numeroDeElementos()
    {
        return carrito.size();
    }

    public int cantidadElementos()
    {
        int total = 0;

        for (Elemento elemento : carrito) 
        {
            int cantidad = elemento.getCantidad();
            total += cantidad;
        }

        return total;
    }

    public double importeTotal()
    {
        double total = 0;

        for (Elemento elemento : carrito) 
        {
            int cantidad = elemento.getCantidad();
            double precio = elemento.getPrecio();

            total += cantidad * precio;
        }

        return total;
    }

    @Override
    public String toString() 
    {
        String resultado = "";

        for (Elemento elemento : carrito) 
        {
            resultado += elemento.toString() + "\n";
        }

        return resultado;
    }
}
