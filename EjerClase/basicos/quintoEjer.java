import java.util.Scanner;

public class quintoEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Ecaucion 1 grado\nintroduce valor de a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("introduce valor de b");
        int b = sc.nextInt();
        sc.close();

        int ecuacion;
        if(a != 0)
        {
            ecuacion = -b / a;
            System.out.println(ecuacion);
        }
        else
            System.out.println("error");
    }   
}
