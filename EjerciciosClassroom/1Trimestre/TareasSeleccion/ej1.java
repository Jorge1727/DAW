import java.util.Scanner;

public class ej1 
{
    public static void main(String[] args)
    {
        int descuentoPorAforo = 0;
        int precioFinal = 0;
        int dineroRecaudado = 0;

        System.out.println("Cual es el aforo maximo del local?");
        Scanner sc = new Scanner(System.in);
        int aforoMax = sc.nextInt();
        
        System.out.println("Cual es el precio de las entradas?");
        int precioEntradas = sc.nextInt();

        
        System.out.println("Cual es el numero de entradas vendidas?");
        int entradasVendidas = sc.nextInt();
        sc.close();

        int aforo = (entradasVendidas * 100) / aforoMax;

        if(aforo <= 20)
        {
            System.out.println("El concierto se cancela");
        }
        else if(aforo <= 50)
        {
            descuentoPorAforo = (25 * precioEntradas) / 100;
            precioFinal = precioEntradas - descuentoPorAforo;
            dineroRecaudado = precioFinal * entradasVendidas;
            System.out.println("El dinero recaudado es: " + dineroRecaudado);
        }
        else
        {
            precioFinal = precioEntradas;
            dineroRecaudado = precioFinal * entradasVendidas;
            System.out.println("El dinero recaudado es: " + dineroRecaudado);
        }
    }    
}
