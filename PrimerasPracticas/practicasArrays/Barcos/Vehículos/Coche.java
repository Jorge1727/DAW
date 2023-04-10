package practicasArrays.Barcos.Vehículos;

import practicasArrays.Barcos.Pasajeros.Pasajero;

public class Coche extends Vehiculo
{
    //Atributos
    public enum Tipo {PARTICULAR, PROFESIONAL};

    private int plazas;
    private Tipo tipo;

    //Constructor
    public Coche(String matricula, Pasajero pasajero, int plazas, Tipo tipo) 
    {
        super(matricula, pasajero);
        this.plazas = plazas;
        this.tipo = tipo;
    }

    //Metodos
    @Override
    public String informacion() 
    {
        return "Vehiculo COCHE: Matricula" + this.getMatricula() + "Pasajero: " + this.getPasajero() + "; Plazas: " + this.plazas + "; Tipo: " + this.tipo;
    }


    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    

    

    
    
}
