package examenClases_JorgeTapia.Viaje;

import examenClases_JorgeTapia.Viaje.Avion;

import java.time.LocalDate;

import examenClases_JorgeTapia.RRHH.Cliente;
import examenClases_JorgeTapia.RRHH.Piloto;
import examenClases_JorgeTapia.RRHH.Saltador;

public class Vuelo 
{
    //Atributos
    private static int codigo = 1;

    private int num_cod;
    private Avion avion;
    private Piloto piloto;
    private Saltador[] saltadores;


    //Constructor
    public Vuelo(Avion avion, Piloto piloto) 
    {
        this.num_cod = codigo;
        this.avion = avion;
        this.piloto = piloto;
        saltadores = new Saltador[0];

        codigo++;
    }

    public void addSaltador(Cliente cliente, Paracaidas paracaidas1, Paracaidas paracaidas2)
    {
        Saltador[] saltadoresFinales = new Saltador[this.saltadores.length + 1];

        for (int i = 0; i < this.saltadores.length; i++) 
        {
            saltadoresFinales[i] = this.saltadores[i];
        }

        saltadoresFinales[saltadoresFinales.length-1] = new Saltador(cliente, paracaidas1, paracaidas2);

        this.saltadores = saltadoresFinales;
    }

    public void saleSaltador()
    {
        Saltador saltadorQueSale = null;

        if(this.saltadores.length > 0) 
        {    

            Saltador[] saltadoresFinales = new Saltador[this.saltadores.length - 1];

            for (int i = 0; i < saltadoresFinales.length; i++) 
            {
                saltadoresFinales[i] = this.saltadores[i];
            }

            saltadorQueSale = this.saltadores[this.saltadores.length - 1];

            this.saltadores = saltadoresFinales;

            System.out.println("El " + saltadorQueSale.informacion() + " ha saltado.");
        }
        else
        {
           System.out.println("No hay mas saltadores"); 
        }
        
    }


    public String ordenSalto()
    {
        String resultado = "";

        for (int i = 0; i < this.saltadores.length; i++) 
        {
            resultado += this.saltadores[i].informacion() + "| ";
        }

        return resultado;
    }

    public String informacionVuelo()
    {
        LocalDate fechaActual = LocalDate.now();

        return "------------Vuelo--------------\nCodigo: " + this.num_cod + "\nPiloto: " + this.piloto.informacion() + "\nAvion: " + this.avion + "\nFecha: "+ fechaActual
        + "\nSaltadores: " + saltadores.length;
    }
    
} 
