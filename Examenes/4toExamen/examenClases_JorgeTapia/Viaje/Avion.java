package examenClases_JorgeTapia.Viaje;

public class Avion 
{
    //Atributos
    private String matricula;
    private int potencia;
    private int capSaltadores;
    private int alturaMax;
    private boolean alquilado;

    //Constructor
    public Avion(String matricula, int potencia, int capSaltadores, int alturaMax, boolean alquilado) 
    {
        this.matricula = matricula;
        this.potencia = potencia;
        this.capSaltadores = capSaltadores;
        this.alturaMax = alturaMax;
        this.alquilado = alquilado;
    }

    //Metodos
    @Override
    public String toString()
    {
        return "Avion: "+ this.matricula + ", Altura: " + this.alturaMax + ", Capacidad saltadores: " + this.capSaltadores;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCapSaltadores() {
        return capSaltadores;
    }

    public void setCapSaltadores(int capSaltadores) {
        this.capSaltadores = capSaltadores;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    
    

    
}
