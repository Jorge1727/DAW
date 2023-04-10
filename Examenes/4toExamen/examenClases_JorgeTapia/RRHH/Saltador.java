package examenClases_JorgeTapia.RRHH;

import examenClases_JorgeTapia.Viaje.Paracaidas;

public class Saltador extends Cliente
{
    //Atributos
    Cliente clientee;
    Paracaidas p1;
    Paracaidas p2;

    //Constructor
    public Saltador(Cliente clientee, Paracaidas p1, Paracaidas p2) 
    {
        super(clientee.getNombre(), clientee.getApellidos(), clientee.getTlf(), clientee.getAlturaSalto(), clientee.isSegVida());
        this.clientee = clientee;
        this.p1 = p1;
        this.p2 = p2;
    }

    //Metodos
    @Override
    public String informacion()
    {
        return "Saltador: " + this.clientee.informacion();
    }
    
}