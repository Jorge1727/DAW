import java.util.Scanner;

public class SextEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("introduce un numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int resCubo = (num * num) * num;

        System.out.println("el numero " + num + " al cubo es: " + resCubo);
    }
}
