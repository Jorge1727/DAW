import java.util.Scanner;

public class NovEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num % 2 == 0)
            System.out.println("Es par");
        else 
            System.out.println("Es impar");
    }    
}
