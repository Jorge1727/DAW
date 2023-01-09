import java.util.Scanner;

public class ej33 
{
    public static void main(String[] args) 
    {
        int planta = 1;

        System.out.println("Introduce la altura:");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        sc.close();

        while(planta <= (altura - 1))
        {
            for(int i = 1; i <= altura; i++)
            {
                if((i >= 2) && (i <= (altura - 1)))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
            planta++;
        }

        if(planta == altura)
        {
            for(int i = 1; i <= altura; i++)
            {
                if((i >= 2) && (i <= (altura - 1)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }    
}
