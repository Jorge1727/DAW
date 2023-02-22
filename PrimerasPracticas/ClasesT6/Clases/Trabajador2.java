package ClasesT6.Clases;

//HECHA PARA PROBAR LA CARPETA VECINA DE CLASEHERENCIA 

public class Trabajador2 extends ClasesT6.ClasesHerencia.Persona
{
    protected double salario;
    String posicion;

    public Trabajador2(String nombre, int edad, double salario, String posicion) {
        super(nombre, edad);
        this.salario = salario;
        this.posicion = posicion;
    }

    
}
