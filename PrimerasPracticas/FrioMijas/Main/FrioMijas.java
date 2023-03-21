package FrioMijas.Main;

import FrioMijas.Equipos.Arcon;
import FrioMijas.Equipos.Camara;
import FrioMijas.Equipos.Frigorifico;
import FrioMijas.Equipos.Minibar;
import FrioMijas.Oficinas.Sede;
import FrioMijas.RRHumanos.Empleado;
import FrioMijas.RRHumanos.Jefe;

public class FrioMijas 
{
    public static void main(String[] args)
    {
        Jefe jefe1 = new Jefe("Jefazo", "Garcia", 45, 2500, "45000001X" );
        Jefe jefe2 = new Jefe("Jefe_malaga", "Lopez", 34, 2100, "77000002P" );

        Sede sede1 = new Sede("Madrid", "Calle ancha", 80881, jefe1);
        
        Sede sede2 = new Sede("Malaga", "Calle Larios", 29001);
        sede2.setJefe(jefe2);

        Empleado empleado1 = new Empleado("Daniel", "ape1", 35, 1000, "88000008W" );
        Empleado empleado2 = new Empleado("Juan", "ape2", 35, 1200, "21000008E" );
        Empleado empleado3 = new Empleado("Maria", "ape3", 55, 1700, "99000008R" );
        Empleado empleado4 = new Empleado("Pepe", "ape4", 45, 900, "66000008Y" );
        Empleado empleado5 = new Empleado("Pedro", "ape5", 30, 2000, "54000008T" );
        Empleado empleado6 = new Empleado("Daniel", "ape6", 24, 1000, "12000008P" );
        Empleado empleado7 = new Empleado("Pilar", "ape7", 24, 1000, "12000008P" );

        System.out.println(empleado1);
        System.out.println(empleado2);

        sede1.addEmpleado(empleado1);
        sede1.addEmpleado(empleado2);

        sede2.addEmpleado(empleado3);
        sede2.addEmpleado(empleado4);
        sede2.addEmpleado(empleado5);
        sede2.addEmpleado(empleado6);
        sede2.addEmpleado(empleado7);

        //Cambiamos contraseñas
        System.out.println(jefe1);
        jefe1.generaPassword(5);
        System.out.println("Nueva contraseña para jefe1");
        System.out.println(jefe1);

        System.out.println(jefe2);
        jefe2.generaPassword(8);
        System.out.println("Nueva contraseña para jefe2");
        System.out.println(jefe2);
        jefe2.generaPassword();
        System.out.println("Nueva contraseña para jefe2");
        System.out.println(jefe2);

        //Mostrar la información completa de cada una de las sedes + jefe + empleados
        System.out.println(sede1);
        System.out.println(sede2);

        /*
         * HACER *
         * Mostrar si la contraseña de los jefes es no Fuerte
         */
        jefe1.generaPassword(20);
        System.out.println(jefe1);
        boolean esSegura = jefe1.esFuerte();
        System.out.println(esSegura);




         /*
          * HACER
          * Generar contraseña de 10 elementos que sea fuerte para cada uno de los jefes
          */
        boolean sonFuertes = false;
        while(sonFuertes == false)
        {
            if(jefe1.esFuerte() == false)
            {
                jefe1.generaPassword(10);
            }
            else if(jefe2.esFuerte() == false)
            {
                jefe2.generaPassword(10);
            }
            else
            {
                sonFuertes = true;
                System.out.println(jefe1);
                System.out.println(jefe2);
            }
        }

        esSegura = jefe1.esFuerte();
        System.out.println(esSegura);
        esSegura = jefe2.esFuerte();
        System.out.println(esSegura);


        /*
         * HACER *
         * Empleados de la sede2 con sueldo entre 500 y 1500 
         */
        sede2.sueldoEntre(500, 1500);


        /*
         * HACER *
         * Crea 5 equipos frigorificos diferentes y asignalos a la 2º sede y muéstralos a continuación
         */
        Minibar minibar1 = new Minibar(2, 4, 3, 1700, "Fujitsu", 4);
        Minibar minibar2 = new Minibar(2, 4, 3, 1700, "Rowenta", 7);
        Frigorifico frigorifico1 = new Frigorifico(2, 4, 3, 1700, "Bosch");
        Arcon arcon1 = new Arcon(2, 4, 3, 1700, "Fujitsu", 2);
        Camara camara1 = new Camara(2, 4, 3, 1700, "Fujitsu", -20);

        sede2.addEquipo(minibar1);
        sede2.addEquipo(minibar2);
        sede2.addEquipo(frigorifico1);
        sede2.addEquipo(arcon1);
        sede2.addEquipo(camara1);
        
        System.out.println(sede2);

        minibar1.consumo();
        minibar2.consumo();
        frigorifico1.consumo();
        arcon1.consumo();
        camara1.consumo();
        
    }
}
