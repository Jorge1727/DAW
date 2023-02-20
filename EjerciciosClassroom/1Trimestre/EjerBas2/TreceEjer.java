import java.util.Scanner;

public class TreceEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("eres vip? (Di si o no en todos los casos)");
        Scanner sc = new Scanner(System.in);
        String vip = sc.next();
        System.out.println("Tienes las cuotas al dia?");
        String cuotas = sc.next();
        System.out.println("Vienes recomendado por alguien vip?");
        String recomendado = sc.next();
        System.out.println("Estas en el periodo de prueba?");
        String periodoPrueba = sc.next();
        sc.close();

        if ((vip.equals("si") && cuotas.equals("si")) || (recomendado.equals("si") && periodoPrueba.equals("si")))
            System.out.println("Eres cliente vip");
        else
            System.out.println("No eres usuario vip");
    }
}
