package recuperacionColecciones_JorgeTapia.Restaurante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class MiLista <T> implements Comparator<T>
{
    //Atributos
    ArrayList<T> lista;

    public MiLista() 
    {
        this.lista = new ArrayList<>();
    }

    //metodos
    public ArrayList<T> geLista() {
        return lista;
    }


    public boolean eliminar(int id)
    {
        for (int i = 0; i < lista.size(); i++) 
        {
            int numid = ((Producto) lista.get(i)).getId();

            if(numid == id)
            {
                lista.remove(lista.get(i));
                return true;
            }
        }

        return false;
    }


    @Override
    public String toString() 
    {
        String resultado = "";

        for (T producto : lista) 
        {
            resultado += producto.toString() + "\n";
        }

        return resultado;
    }

    @Override
    public int compare(T o1, T o2) {
        return ((Producto) o1).getId()-((Producto) o2).getId();

    }

}
