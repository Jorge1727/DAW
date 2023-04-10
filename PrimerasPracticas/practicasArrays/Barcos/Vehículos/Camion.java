package practicasArrays.Barcos.Vehículos;

import practicasArrays.Barcos.Pasajeros.Pasajero;

public class Camion extends Vehiculo
{
    //Atributos
    private int pesoMax;
    private boolean mercanciaPeligrosa;

    //Constructor
    public Camion(String matricula, Pasajero pasajero, int pesoMax, boolean mercanciaPeligrosa)
    {
        super(matricula, pasajero);
        this.pesoMax =pesoMax;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    //Metodos
    @Override
    public String informacion() 
    {
        return "Vehiculo CAMION: Matricula: " + this.getMatricula() + "; Dueño: " + this.getPasajero() + ";pesoMax: " + this.pesoMax + "; Merc Pelig: " + this.mercanciaPeligrosa;
    }



    
    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public boolean isMercanciaPeligrosa() {
        return mercanciaPeligrosa;
    }

    public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    
}
