package ClasesT6.ClasesHerencia;

public class Jefe extends Empleado
{
    private String departamento;
    private double prima;


    protected Jefe(String nombre, int edad, double sueldo, String departamento, double prima)
    {

        super(nombre, edad, sueldo);
        this.departamento = departamento;
        this.prima = prima;
    }

    @Override
    public String decirHola()
    {
        return "Soy uun jefe";
    }

    
    
}
