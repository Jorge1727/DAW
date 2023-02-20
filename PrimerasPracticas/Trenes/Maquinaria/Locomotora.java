package Trenes.Maquinaria;

import Trenes.Personal.Mecanico;

public class Locomotora 
{
    //Atributos
    private String matricula;
    private int potencia;
    private int antiguedad;
    Mecanico mecanico;

    //Constructor
    public Locomotora(String matricula, int potencia, int antiguedad) 
    {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
    }

    public Locomotora(String matricula, int potencia) 
    {
        this.matricula = matricula;
        this.potencia = potencia;
    }

    //Metodos
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void asignaMecanico(Mecanico mecanico)//asignar el mecanico a la locomotora
    {
        this.mecanico = mecanico;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        if(mecanico == null)
            resultado = "Locomotora: " + this.matricula + " (" + this.potencia + " C.V) - ";
        else
            resultado = "Locomotora: " + this.matricula + " (" + this.potencia + " C.V) ; (mecanico asignado = " + getMecanico() +")) - ";


        return resultado;
    }


}
