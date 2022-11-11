import java.util.Scanner;

public class OctEjer 
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Tienes dinero?");
        boolean tienesDinero = sc.nextBoolean();
        System.out.println("Tienes reserva?");
        boolean tienesReserva = sc.nextBoolean();
        System.out.println("tienes pasaporte?");
        boolean tienesPasaporte = sc.nextBoolean();
        
        boolean puedesIr = (tienesDinero || (tienesReserva && tienesPasaporte));
        System.out.println("Puedo ir de vacaciones?: " + puedesIr);

        //hijos
        System.out.println("Hijo 1, playa = false; montaña = true");
        boolean hijo1 = sc.nextBoolean();
        System.out.println("Hijo 2, playa = false; montaña = true");
        boolean hijo2 = sc.nextBoolean();
        System.out.println("Hijo 3, playa = false; montaña = true");
        boolean hijo3 = sc.nextBoolean();
        sc.close();

        boolean voyMountain = (hijo1 && hijo2 && hijo3);

        System.out.println("Voy a la montaña?: " + voyMountain);
    }
}
