package practicasArrays.Barcos.Barcos;

import java.time.LocalDate;
import java.util.Arrays;

import practicasArrays.Barcos.Pasajeros.Pasajero;
import practicasArrays.Barcos.Vehículos.Vehiculo;

public class Barco 
{
    //Atributos
    private String nombre;
    private int fechaBotadura;
    private Vehiculo[] vehiculos;
    private Capitan capitan;
    private Pasajero[] pasajeros;
    private int capMaxKilos;

    //Constructor
    public Barco(String nombre, Capitan capitan, int capMaxKilos) 
    {
        this.nombre = nombre;
        this.capitan = capitan;
        this.capMaxKilos = capMaxKilos;
        vehiculos = new Vehiculo[0];
        pasajeros = new Pasajero[0];
    }

    //Metodos
    public void embarcarVehiculo(Vehiculo vehiculo)
    {
        boolean estaba = false;

        for (int i = 0; i < pasajeros.length; i++) 
        {
            if(estaba == false)
            {
                if(this.pasajeros[i].equals(vehiculo.getPasajero()));
                {
                    Vehiculo[] vehiculosFinales = new Vehiculo[this.vehiculos.length + 1];

                    for (int j = 0; j < this.vehiculos.length; j++) 
                    {
                        vehiculosFinales[j] = this.vehiculos[j];
                    }

                    vehiculosFinales[vehiculosFinales.length-1] = vehiculo;

                    this.vehiculos = vehiculosFinales;

                    estaba = true;
                } 
            }
        }

        if(estaba == false)
            System.out.println("El dueño del vehiculo no se encuentra en el barco, metelo sino no entra el vehiculo xd");
            
    }

    public void embarcarPasajero(Pasajero pasajero)
    {
        Pasajero[] pasajerosFinales = new Pasajero[this.pasajeros.length + 1];

        for (int i = 0; i < this.pasajeros.length; i++) 
        {
            pasajerosFinales[i] = this.pasajeros[i];
        }

        pasajerosFinales[pasajerosFinales.length-1] = pasajero;

        this.pasajeros = pasajerosFinales;
    }

    public void desembarcarVehiculo()
    {
        Vehiculo vehiculoQueSale = null;
        Pasajero pasajeroQueSale = null;

        if(this.vehiculos.length > 0) 
        {    

            Vehiculo[] vehiculosFinales = new Vehiculo[this.vehiculos.length - 1];

            for (int i = 0; i < vehiculosFinales.length; i++) 
            {
                vehiculosFinales[i] = this.vehiculos[i];
            }

            vehiculoQueSale = this.vehiculos[this.vehiculos.length - 1];

            this.vehiculos = vehiculosFinales;

            Pasajero[] pasajerosFinales = new Pasajero[this.pasajeros.length - 1];
            for (int i = 0; i < pasajeros.length; i++) 
            {
                if(this.pasajeros[i].equals(vehiculoQueSale.getPasajero()))
                {
                    pasajerosFinales[i] = this.pasajeros[i+1];
                    pasajeroQueSale = this.pasajeros[i];
                }
                else 
                {
                    pasajerosFinales[i] = this.pasajeros[i];
                }
            }

            System.out.println("El " + vehiculoQueSale.informacion() + " desembarca junto al pasajero: " + pasajeroQueSale);
        }
        else
        {
           System.out.println("No hay mas Vehiculos"); 
        }
        
    }

    public String informacionBarco()
    {
        LocalDate fechaActual = LocalDate.now();

        String resultado =  "------------Barco--------------\nNombre " + this.nombre + "\nCapitan: " + this.capitan + "\nCap max kilos: " + this.capMaxKilos + "\nfecha botadura: " + this.fechaBotadura + "\nFecha: "+ fechaActual + "\nVehiculos en barco: ";
        
        for (int i = 0; i < this.vehiculos.length; i++) 
        {
            resultado += this.vehiculos[i].informacion() + "| ";
        }
        

        resultado += "\n" + Arrays.toString(pasajeros);

        return resultado;
    }

    
    

}
