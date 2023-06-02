package recuperacionColecciones_JorgeTapia.Restaurante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import recuperacionColecciones_JorgeTapia.Comparador.OrdenaPorCodigo;
import recuperacionColecciones_JorgeTapia.Comparador.OrdenaPorNombre;

public class Restaurante
{
    //A
    private Map<Integer, Producto> map;
    Carta carta;

    //C
    public Restaurante() 
    {
        this.map = new HashMap<>(10);
        FactoriaProductos factoriaProductos = new FactoriaProductos();
        carta = new Carta(factoriaProductos);
    }

    //M

    public Carta getCarta() {
        return carta;
    }

    public Map<Integer, Producto> getMap() {
        return map;
    }

    public boolean addProducto(int mesa, Producto producto)
    {
        if(map.containsKey(mesa))
        {
            return false;
        }
        else
        {
            map.put(mesa, producto);
            return true;
        }
    }


    public boolean deleteProducto(int mesa, Producto producto)
    {
        if(map.containsKey(mesa))
        {
            map.remove(mesa);
            return true;
        }
        else
        {
            return false;
        }
    }

    public String productosMesasOrdenadorPorNombre() 
    {
        OrdenaPorNombre ordenaPorNombre = new OrdenaPorNombre();
        HashMap<Integer, Producto> copia = new HashMap<>(map);

        copia.sort(ordenaPorNombre);

        String resultado = "";

        for (int i = 0; i < copia.size(); i++) 
        {
            resultado += copia.get(i) + "\n";    
        }

        return resultado;
    }

    public String productosMesasOrdenadorPorCodigo(int mesa) 
    {
        OrdenaPorCodigo ordenaPorCodigo = new OrdenaPorCodigo();
        HashMap<Integer, Producto> copia = new HashMap<>(map);

        Collections.sort(copia, ordenaPorCodigo);

        String resultado = "";

        for (int i = 0; i < copia.size(); i++) 
        {
            resultado += copia.get(i) + "\n";    
        }

        return resultado;
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
    
}
