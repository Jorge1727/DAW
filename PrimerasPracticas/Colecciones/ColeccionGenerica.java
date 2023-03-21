package Colecciones;

public class ColeccionGenerica <T>
{
    //Atributo
    private T objeto;

    //metodos
    public void insert(T nuevo)
    {
        objeto = nuevo;
    }

    public T extraer()
    {
        T resultado = this.objeto;
        objeto = null;

        return resultado;
    }
}
