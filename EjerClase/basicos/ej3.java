import java.util.Scanner;

public class ej3 
{
    public static void main(String[] args) 
    {
        System.out.println("HIPOTECA");
        System.out.println("tienes trabajo fijo?");
        Scanner sc = new Scanner(System.in);
        String tieneTrabajo = sc.next();
        tieneTrabajo = tieneTrabajo.toLowerCase();

        System.out.println("tienes cuenta con nostros");
        String tieneCuenta = sc.next();
        tieneCuenta = tieneCuenta.toLowerCase();

        System.out.println("tienes ahorrado mas del 20% del importe ded la casa?");
        String tieneAhorro20 = sc.next();
        tieneAhorro20 = tieneAhorro20.toLowerCase();

        System.out.println("Tienes ahorrado mas del 50% del importe de la casa?");
        String tieneAhorro50 = sc.next();
        tieneAhorro50 = tieneAhorro50.toLowerCase();
        sc.close();

        boolean puedeHipoteca = ((tieneTrabajo.equals("si")) && (tieneCuenta.equals("si")) || (tieneCuenta.equals("si")) && (tieneAhorro20.equals("si")) || (tieneAhorro50.equals("si")));
        
        System.out.println((puedeHipoteca) ? "Si puedes tener hipoteca" : "No puedes tener hipoteca");
    }    
}
