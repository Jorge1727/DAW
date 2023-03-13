package examenClases_JorgeTapia.Clases.Personas;

import examenClases_JorgeTapia.Clases.Paracaidas;

public class Saltador extends Cliente
{
    //Atributos
    Cliente cliente;
    Paracaidas p1;
    Paracaidas p2;

    //Constructor
    public Saltador(Cliente cliente, Paracaidas p1, Paracaidas p2) 
    {
        super(cliente.getNombre(), cliente.getApellidos(), cliente.getTlf(), cliente.getAlturaSalto(), cliente.isSegVida());
        this.cliente = cliente;
        this.p1 = p1;
        this.p2 = p2;
    }

    //Metodos
    @Override
    public String informacion()
    {
        return getNombre() + getApellidos() + getAlturaSalto();
    }
    
}