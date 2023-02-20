package ClasesT6.Clases;

public class Incidencia 
{
    //Atributos
    private int codigo;
    private String estado;
    private String descripcionFallo;
    private int puesto;
    private String solucion;

    private static int numeroIncidenciasTotales;
    private static int incidenciasPendientes;
    

    //Constructor
    public Incidencia(int puesto, String descripcionFallo)
    {
        this.descripcionFallo = descripcionFallo;
        this.puesto = puesto;

        this.estado = "Pendiente";

        numeroIncidenciasTotales++;
        incidenciasPendientes++;
        this.codigo = numeroIncidenciasTotales;
    }

    //Metodos
    public void resuelve(String descripcionSolucion)
    {
        this.solucion = descripcionSolucion;

        this.estado = "Resuelto";

        incidenciasPendientes--;
    }

    public static int getPendientes()
    {
        return incidenciasPendientes;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        resultado = "Incidencia " + this.codigo + " - Puesto " + this.puesto + " - " + this.descripcionFallo +
    }

}
