package practicasArrays.Barcos.Vehículos;

import practicasArrays.Barcos.Pasajeros.Pasajero;

public class Moto extends Vehiculo
{
    //Atributos
    private int cilindrada;
    private boolean necesitaCarnet;

    //Constructor
    public Moto(String matricula, Pasajero pasajero, int cilindrada, boolean necesitaCarnet)
    {
        super(matricula, pasajero);
        this.cilindrada = cilindrada;
        this.necesitaCarnet = necesitaCarnet;
    }

    //Metodos
    @Override
    public String informacion() 
    {
        return "Vehiculo MOTO: Matricula: " + this.getMatricula() + "; Dueño: " + this.getPasajero() + "; Cilindrada: " + this.cilindrada;
    }




    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isNecesitaCarnet() {
        return necesitaCarnet;
    }

    public void setNecesitaCarnet(boolean necesitaCarnet) {
        this.necesitaCarnet = necesitaCarnet;
    }

    

    

    
}
