import java.util.Scanner;

public class SeptEjer 
{
    public static void main(String[] args) 
    {
        final double pi = 3.141592;

        System.out.println("Introduce el radio de la circunferencia");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        sc.close();
        double longitud = 2 * pi + radio;
        double area = pi * (radio * radio);

        System.out.println("Longitud: " + longitud + " m\n" + "Area: " + area + " m2");
    }
}
