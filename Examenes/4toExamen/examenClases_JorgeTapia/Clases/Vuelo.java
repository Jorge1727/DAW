package examenClases_JorgeTapia.Clases;

import examenClases_JorgeTapia.Clases.Personas.Cliente;
import examenClases_JorgeTapia.Clases.Personas.Piloto;
import examenClases_JorgeTapia.Clases.Personas.Saltador;

public class Vuelo 
{
    //Atributos
    Avion avion;
    Piloto piloto;

    //Constructor
    public Vuelo(Avion avion, Piloto piloto) 
    {
        this.avion = avion;
        this.piloto = piloto;
    }

    public void addSaltador(Cliente cliente, Paracaidas paracaidas1, Paracaidas paracaidas2)
    {
        Saltador saltador = new Saltador(cliente, paracaidas1, paracaidas2);
    }
    
}
