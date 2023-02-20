import java.util.Scanner;

public class DieciseisEjer 
{
    public static void main(String[] args) 
    {
        final double PRECIO_INFANTIL = 12.50;
        final double PRECIO_ADULTO = 20;
        
        System.out.println("Entradas adulto?");
        Scanner sc = new Scanner(System.in);
        int entradaAdulto = sc.nextInt();
        System.out.println("Entrada niños?");
        int entradaNiño = sc.nextInt();
        sc.close();

        double precioTotal = (entradaAdulto * PRECIO_ADULTO) + (entradaNiño * PRECIO_INFANTIL);

        if (precioTotal >= 100)
        {
            double descuento = ((precioTotal * 15) / 100);
            System.out.println("El precio sera: " + (precioTotal - descuento));
        }
        else
            System.out.println("El precio sera: " + precioTotal);
    }
}
