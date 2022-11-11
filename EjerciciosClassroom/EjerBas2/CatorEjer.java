import java.util.Scanner;

public class CatorEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Di el valor de a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Di el valor de b");
        int b = sc.nextInt();
        System.out.println("Di el valor de c");
        int c = sc.nextInt();
        System.out.println("Di el valor de x");
        int x = sc.nextInt();
        sc.close();

        int y = a * (x * x) + b * x + c;
        System.out.println("El resultado de y es: " + y);
    }
}
