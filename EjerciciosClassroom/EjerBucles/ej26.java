import java.util.Scanner;

public class ej26 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Introduce un digito");
        int position = sc.nextInt();
        sc.close();

        int vuelta = 0;

        while(num > 0)
        {
            vuelta = (vuelta * 10) + (num % 10);
            num /= 10;
        }
        System.out.println(vuelta);

        while(vuelta >= 1)
        {
            if((vuelta % 10) == position)
                System.out.print(position + " ");
            
            vuelta /= 10;
            position++;
        }
    }    
}
