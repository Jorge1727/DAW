package ClasesT6.Clases;

//HECHA PARA PROBAR LA CARPETA VECINA DE CLASEHERENCIA 

public class Trabajador2 extends ClasesT6.ClasesHerencia.Persona
{
    String posicion;

    public Trabajador2(String nombre, int edad, String posicion) 
    {
        super(nombre, edad);
        this.posicion = posicion;
    }
}
