package examenColecciones_JorgeTapia.Tienda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DescuentoPorCategoria 
{
    //A
    private Map<String, Integer> map;

    //C
    public DescuentoPorCategoria() 
    {
        this.map = new HashMap<>();
    }

    //M

    public Map<String, Integer> getMap() {
        return map;
    }

    public boolean insertar(String categoria, Integer descuento)
    {
        if(map.containsKey(categoria))
        {
            return false;
        }
        else
        {
            map.put(categoria, descuento);
            return true;
        }
    }

    public boolean modificar(String categoria, Integer nuevoDescuento)
    {
        if(map.containsKey(categoria))
        {
            map.put(categoria, nuevoDescuento);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean eliminar(String categoria)
    {
        if(map.containsKey(categoria))
        {
            map.remove(categoria);
            return true;
        }
        else
        {
            return false;
        }
    }

    public int obtener(String categoria)
    {
        if(map.containsKey(categoria))
        {
            return map.get(categoria);
        }
        else
        {
            return 0;
        }
    }

    public String mostrarDescuentos()
    {
        String resultado = "";

        HashSet<String> Claves = new HashSet<>(map.keySet());
        for (String clave : Claves) 
        {
            resultado += clave + " - " + map.get(clave) + "%\n";
        }

        return resultado;
    }



}
