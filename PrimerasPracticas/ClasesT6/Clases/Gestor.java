package ClasesT6.Clases;

public class Gestor 
{
    //Atributos
    public String nombre;
    private String tlf;
    //solo visible por clases vecinas
    double importeMax;

    //Constructores
    public Gestor(String nombre, String tlf)
    {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = 10000;
    }

    public Gestor(String nombre, String tlf, double importe)
    {
        this(nombre, tlf);
        this.importeMax = importe;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public double getImporteMaximo() {
        return importeMax;
    }

    public void setImporteMaximo(double importeMaximo) {
        this.importeMax = importeMaximo;
    }

    



}
