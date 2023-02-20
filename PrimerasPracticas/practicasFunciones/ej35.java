import java.util.Scanner;

public class ej35 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce el número para convertirlo a Sistema de Palotes: ");
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        String enPalotes = UtilesParaNumeros.convierteEnPalotes(n);

        System.out.println(enPalotes);
    }
}
