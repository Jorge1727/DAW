import java.util.Scanner;

public class ej37 
{
    public static void main(String[] args) 
    {
        int mod = 0;

        System.out.println("Introduce tu numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        while(num >= 0)
        {
            mod = num % 10;
            for(int j = 1; j <= mod; j++)
            {
                System.out.print("|");
            }
            System.out.print(" - ");
            num = num / 10;    
        }
    }    
}
