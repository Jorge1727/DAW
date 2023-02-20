import java.util.Scanner;

public class Ejercicio2_JorgeTapia 
{
    public static void main(String[] args) 
    {
        System.out.println("Di la altura:");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();

        while(altura <= 0)//CONTROL DE ERRORES
        {
            System.out.println("La opcion no es correcta. Debe ser un número positivo.");
            altura = sc.nextInt();
        }
        sc.nextLine();

        System.out.println("Di la cadena de caracteres: ");
        String cadena = sc.nextLine();
        sc.close();
        
        int lengthCadena = cadena.length();
        int inicio = 1;
        int introducirCadena = altura + 1;//fila donde introduzco el string.

        while(inicio <= (altura * 2) + 1)
        {
            if(inicio == introducirCadena)
            {
                System.out.println("XX" + cadena + "XX");
            }
            else
            {
                if(inicio % 2 == 1)//IMPAR
                {
                    System.out.print("AAAA");
                    for(int i = 0; i < lengthCadena; i++)
                    {
                        System.out.print("A");
                    }
                    System.out.println();
                }
                else if(inicio % 2 == 0)//PAR
                {
                    System.out.print("HHHH");
                    for(int j = 0; j < lengthCadena; j++)
                    {
                        System.out.print("H");
                    }
                    System.out.println();
                }
            }
            inicio++;

        }
    }    
}
