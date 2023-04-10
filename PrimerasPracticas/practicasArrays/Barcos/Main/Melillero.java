package practicasArrays.Barcos.Main;

import practicasArrays.Barcos.Barcos.Barco;
import practicasArrays.Barcos.Barcos.Capitan;
import practicasArrays.Barcos.Pasajeros.Pasajero;
import practicasArrays.Barcos.Vehículos.Camion;
import practicasArrays.Barcos.Vehículos.Coche;
import practicasArrays.Barcos.Vehículos.Moto;
import practicasArrays.Barcos.Vehículos.Coche.Tipo;

public class Melillero 
{
    public static void main(String[] args) 
    {
        Pasajero p1 = new Pasajero("Juan", "Lopez", "Español", false);
        Pasajero p2 = new Pasajero("Maria", "uuuu", "Español", true);
        Pasajero p3 = new Pasajero("Ana", "fdfdf", "Español", false);
        Pasajero p4 = new Pasajero("Jose", "kejeje", "Español", true);
        Pasajero p5 = new Pasajero("Luis", "poppo", "Español", false);
        Pasajero p6 = new Pasajero("Julian", "Lolo", "Español", false);

        Moto moto1 = new Moto("1111aaa", p1, 25, true);
        Coche coche1 = new Coche("2222bbb", p2, 7, Tipo.PROFESIONAL);
        Camion camion1 = new Camion("3333ccc", p3, 500, false);
        Moto moto2 = new Moto("4444ddd", p4, 45, true);

        Capitan capitan1 = new Capitan("Cap 1", 1998);
        Capitan capitan2 = new Capitan("Cap 2", 2008);

        Barco barco1 = new Barco("Titanic", capitan1, 1500);
        barco1.embarcarPasajero(p1);
        barco1.embarcarPasajero(p2);
        barco1.embarcarVehiculo(moto1);

        Barco barco2 = new Barco("Bestia", capitan2, 3500);
        barco2.embarcarPasajero(p3);
        barco2.embarcarPasajero(p4);
        barco2.embarcarPasajero(p5);
        barco2.embarcarPasajero(p6);
        barco2.embarcarVehiculo(moto2);
        barco2.embarcarVehiculo(coche1);
        barco2.embarcarVehiculo(camion1);

        System.out.println(barco1.informacionBarco());
        System.out.println(barco2.informacionBarco());

    }
    
}
