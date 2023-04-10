package practicasArrays.Barcos.Vehículos;

import practicasArrays.Barcos.Pasajeros.Pasajero;

public abstract class Vehiculo
{
    //Atributos
    private String matricula;
    private Pasajero pasajero;

    //Constructor
    public Vehiculo(String matricula, Pasajero pasajero) 
    {
        this.matricula = matricula;
        this.pasajero = pasajero;
    }

    //Metodos
    public abstract String informacion();




    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    

    
}
