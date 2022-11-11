import java.util.Scanner;

public class ejer7y8 
{
    public static void main(String[] args) 
    {
        System.out.println("-------MEDIA DE NOTAS-------\nDi la primera nota");
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt();
        System.out.println("nota 2");
        int nota2 = sc.nextInt();
        System.out.println("nota 3");
        int nota3 = sc.nextInt();
        sc.close();

        int media = (nota1 + nota2 + nota3) / 3;

        //int[] notas = {nota1};

        if (media >= 0 && media <5)
        {
            System.out.println("Insuficiente");
        }
        else
        {
            if(media == 5)
            {
                System.out.println("Suficiente");
            }
            else
            {
                if(media <=7)
                {
                    System.out.println("Bien");
                }
                else
                {
                    if(media <= 9)
                    {
                        System.out.println("Notable");
                    }
                    else
                    System.out.println("Sobresaliente");
                }
            }
        }
    }    
}
