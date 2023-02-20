import java.util.Scanner;

public class ej24 
{
    public static void main(String[] args) 
    {
        System.out.println("----PIRAMIDE DE NUMEROS----\nDi un numero");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        sc.close();

        int planta = 1;
        int espacios = altura - 1;

        while(planta <= altura)
        {
            for(int i = 1; i <= espacios; i++)
                System.out.print(" ");

            for(int i = 1; i < planta; i++)
                System.out.print(i);
                
            for(int i = planta; i >= 1; i--)
                System.out.print(i);    

            System.out.println();
            planta++;
            espacios--;
        }
    }
}
