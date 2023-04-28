package examenColecciones_JorgeTapia;

import java.util.HashMap;
import java.util.Map;

public class DescuentoPorCategoria 
{
    
    Map<String, Integer> descuentoCategoria;

    public DescuentoPorCategoria() 
    {
        this.descuentoCategoria = new HashMap<>();
    }

    public void insertar(String categoria, Integer descuento)
    {
        descuentoCategoria.put(categoria, descuento);

        System.out.println(descuentoCategoria);
    }
}
