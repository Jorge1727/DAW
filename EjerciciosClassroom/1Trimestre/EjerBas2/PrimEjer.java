import java.util.Scanner;

public class PrimEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Introcuce tu nombre");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Introduce un numero entero");
        int numero = sc.nextInt();

        System.out.println("Introduce la hora con decimales");
        float hora = sc.nextFloat();
        sc.close();

        System.out.println("Tu nombre es " + name + "\nEl numero introducido es: " + numero + "\nY la hora es: " + hora);
    }
}
