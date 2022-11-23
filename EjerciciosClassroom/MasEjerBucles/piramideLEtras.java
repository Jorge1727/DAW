import java.util.Scanner;

public class piramideLEtras 
{
    public static void main(String[] args) 
    {
        int inicio = 1;
        int fila = 1;

        System.out.println("Introduce la altura");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        sc.close();

        if(altura <= 26)
        {
            while(inicio <= altura)
            {
                char chr = 65;
                for(int i = 1; i <= fila; i++)
                {
                    System.out.print(chr);
                    chr++;
                }
                inicio++;
                fila++;
                System.out.println();
            }
        }
        else
            System.out.println("Altura incorrecta, debe ser menor a 26");
        
    }
}
