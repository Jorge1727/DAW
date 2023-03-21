package JugadoresDeFutbol;

public class Jugador implements Comparable, Jugar_I
{
    //Atributos
    private static int cod = 1000;

    private String nombreCompleto;
    private String apodo;
    private int num_Licencia;
    private int numeroGoles;
    private int numeroFaltas;

    //Constructor
    public Jugador(String nombreCompleto, String apodo) 
    {
        this.nombreCompleto = nombreCompleto;
        this.apodo = apodo;
        this.num_Licencia = cod;

        cod++;
    }

    public Jugador()
    {
        this.num_Licencia = cod;

        cod++;
    }

    //Metodos
    

    @Override
    public int compareTo(Object o) 
    {
        Jugador j = (Jugador)o;

        return (int)(this.num_Licencia - j.num_Licencia);
    }

    @Override
    public String toString() {
        
        return this.nombreCompleto + "(" + this.num_Licencia + ") " + "[" + this.apodo + "]";
    }

    @Override
    public void hacerGol()
    {
        setNumeroGoles(numeroGoles + 1);
    }

    @Override
    public void cometerFalta() 
    {
        setNumeroFaltas(numeroFaltas + 1);
    }


    public int getCod() {
        return cod;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNum_Licencia() {
        return num_Licencia;
    }

    public void setNum_Licencia(int num_Licencia) {
        this.num_Licencia = num_Licencia;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }

    

    
}
