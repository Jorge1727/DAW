package examenColecciones_JorgeTapia.Tienda;

public interface Tienda_I {

    boolean insertarProductoAlmacen(Producto producto);
    String mostrarProductosAlmacenPorNombre();
    String mostrarProductosAlmacenPorId();
    Producto buscarProductoAlmacen(int id);
    double obtenerCuentaTotal();
}