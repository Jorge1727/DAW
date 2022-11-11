import java.util.Scanner;

public class ej3 
{
    public static void main(String[] args) 
    {
        /*
        System.out.println("---------HIPOTECA-----------\n¿Tienes trabajo fijo?\n(responde si o no, cualquier otra cosa sera tomada como no)");
        Scanner sc = new Scanner(System.in);
        String tieneTrabajo = sc.next();
        tieneTrabajo = tieneTrabajo.toLowerCase();
        System.out.println("¿Tienes cuenta con nosotros?");
        String tieneCuenta = sc.next();
        tieneCuenta = tieneCuenta.toLowerCase();
        System.out.println("¿Tienes ahorrado el 20%?");
        String tiene20Ahorro = sc.next();
        tiene20Ahorro = tiene20Ahorro.toLowerCase();
        System.out.println("¿Tienes ahorrado el 50%?");
        String tiene50Ahorro = sc.next();
        tiene50Ahorro = tiene50Ahorro.toLowerCase();
        sc.close();

        boolean tieneHipoteca = ((tieneTrabajo.equals("si")) && (tieneCuenta.equals("si") || (tieneCuenta.equals("si")) && (tiene20Ahorro.equals("si")) || (tiene50Ahorro.equals("si"))));

        System.out.println((tieneHipoteca) ? "SI te damos la hipoteca." : "NO te damos la hipoteca.");
        */

        //la solucion preguntando los valores del piso.

        System.out.println("---------HIPOTECA-----------\n¿Cuanto vale el piso?");
        Scanner sc = new Scanner(System.in);
        int valorPiso = sc.nextInt();
        System.out.println("¿tienes trabajo?\n(responde si o no, cualquier otra cosa sera tomada como no)");
        String tieneTrabajo = sc.next();
        tieneTrabajo = tieneTrabajo.toLowerCase();
        System.out.println("¿Tienes cuenta con nosotros?");
        String tieneCuenta = sc.next();
        tieneCuenta = tieneCuenta.toLowerCase();
        System.out.println("¿Cuanto tienes ahorrado?");
        int ahorrado = sc.nextInt();
        sc.close();

        int porcentajeAhorrado = ((ahorrado * 100) / valorPiso);

        if(porcentajeAhorrado >= 50)
        {
            System.out.println("SI tienes hipoteca");
        }
        else
        {
            if(((porcentajeAhorrado >= 20) && (porcentajeAhorrado < 50) && (tieneCuenta.equals("si"))) || (tieneCuenta.equals("si")) && (tieneTrabajo.equals("si")))
            {
                System.out.println("SI tienes hipoteca");
            }
            else
                System.out.println("NO tienes hipoteca");
        }

    }    
}
