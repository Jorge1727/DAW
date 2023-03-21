package Colecciones.clases;

public class Notas<T extends Alumno>  //que el de mas arriba empieze desde alumno
{
    private T objeto;

    public Notas(T nuevo)
    {
        objeto = nuevo;
    }

    public void escribirNota()
    {
        System.out.println(objeto.toString() + "Sobresaliente");
    }    


}
