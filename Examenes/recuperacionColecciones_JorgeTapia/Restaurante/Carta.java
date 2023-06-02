package recuperacionColecciones_JorgeTapia.Restaurante;

import java.util.ArrayList;

public class Carta 
{
    //A
    FactoriaProductos factoriaProductos;
    HashSet<Producto> productos;

    //C
    public Carta(FactoriaProductos factoriaProductos) {
        this.factoriaProductos = factoriaProductos;
        this.productos = new HashSet<>();
    }

    //M
    public FactoriaProductos getFactoriaProductos() {
        return factoriaProductos;
    }

    public boolean addNuevoProducto(Producto producto) 
    {
        for (Producto prod : productos) 
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


}
