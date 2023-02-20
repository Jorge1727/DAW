import java.util.Scanner;

public class quinEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Di los segundos: ");
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();
        sc.close();

        float minutos = segundos/60f;
        System.out.println((int)(Math.ceil(minutos)));
    }
}
