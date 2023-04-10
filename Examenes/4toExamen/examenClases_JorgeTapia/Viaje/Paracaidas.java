package examenClases_JorgeTapia.Viaje;

import examenClases_JorgeTapia.RRHH.Instructor;

public class Paracaidas 
{
    //Atributos
    public enum Fabricante{MOLTEM, CAIDALIBRE, ALTUS};

    private static int id = 1;

    private int num_id;
    private int anioFab;
    private Fabricante tipoFabricante;
    private Instructor instructor;

    //Constructor
    public Paracaidas(int anioFab, Fabricante tipoFabricante, Instructor instructor)
    {
        this.num_id = id;
        this.anioFab = anioFab;
        this.tipoFabricante = tipoFabricante;
        this.instructor = instructor;

        id++;
    }

    //metodos
    public int getNum_id() {
        return num_id;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public Fabricante getTipoFabricante() {
        return tipoFabricante;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public String toString()
    {
        return "Paracaidas: "+ getTipoFabricante();
    }
    
    

    
}
