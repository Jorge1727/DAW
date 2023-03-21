package FrioMijas.Oficinas;

import java.util.Arrays;

import FrioMijas.Equipos.Equipo;
import FrioMijas.RRHumanos.Empleado;
import FrioMijas.RRHumanos.Jefe;

public class Sede 
{
    //Atributos
    private static int codigoSede = 1;

    private String ciudad;
    private String direccion;
    private int cp;
    private int num_codigoSede;
    private Jefe jefeAsignado;
    private Empleado[] empleados;
    private Equipo[] equipos;

    //constructor
    public Sede(String ciudad, String direccion, int cp, Jefe jefeAsignado) 
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.cp = cp;
        this.num_codigoSede = codigoSede;
        this.jefeAsignado = jefeAsignado;
        this.empleados = new Empleado[0];
        this.equipos = new Equipo[0];
    }

    public Sede(String ciudad, String direccion, int cp) 
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.cp = cp;
        this.num_codigoSede = codigoSede;
        this.empleados = new Empleado[0];
        this.equipos = new Equipo[0];
        this.jefeAsignado = null;
    }

    //Metodos
    public void addEmpleado(Empleado empleado)
    {
        Empleado[] empleadosFinal = new Empleado[this.empleados.length + 1];

        for (int i = 0; i < this.empleados.length; i++) 
        {
            empleadosFinal[i] = this.empleados[i];
        }

        empleadosFinal[empleadosFinal.length - 1] = empleado;

        this.empleados = empleadosFinal;
    }

    public void addEquipo(Equipo equipo)
    {
        Equipo[] equiposFinal = new Equipo[this.equipos.length + 1];

        for (int i = 0; i < this.equipos.length; i++) 
        {
            equiposFinal[i] = this.equipos[i];
        }

        equiposFinal[equiposFinal.length - 1] = equipo;

        this.equipos = equiposFinal;
    }

    /**
     * Consulta los empleados con sueldo entre un minimo y maximo
     * @param min
     * @param max
     */
    public void sueldoEntre(int min, int max)
    {
        boolean minUnEmpleado = false;
        for (int i = 0; i < this.empleados.length; i++) 
        {
            if(empleados[i].getSalario() >= min && empleados[i].getSalario() <= max)
            {
                System.out.println("Cumple con el requisito de salario indicado el " + empleados[i] + " con "+empleados[i].getSalario() + "euros.");
                minUnEmpleado = true;
            }
        }

        if(minUnEmpleado == false)
            System.out.println("No se ha encontrado ningun empleado con el salario indicado");
    }

    public String toString()
    {
        return "SEDE:\tDireccion: " + this.direccion + "\n\tCP: " + this.cp + "\n\tJefe: " + this.jefeAsignado + "\n\tEmpleados: " + Arrays.toString(empleados) + "\n\tEquipos: " + Arrays.toString(equipos);
    }

    
    /**
     * Asignar jefe a sede
     * @param jefeAsignado
     */
    public void setJefe(Jefe jefeAsignado) {
        this.jefeAsignado = jefeAsignado;
    }

    public Jefe getJefe() {
        return jefeAsignado;
    }
    
}
