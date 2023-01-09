import java.util.Scanner;

public class ej18 
{
    public static void main(String[] args) 
    {
        int comprendidos = 0;
        int hasta = 0;

        System.out.println("----COMPRENDIDOS ENTRE 2 NUMEROS-----\nIntoduce el primer numero:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Introduce el segundo numero:");
        int n2 = sc.nextInt();
        sc.close();

        if(n1 < n2)
        {
            comprendidos = n1 + 8;
            hasta = n2;
        }
        else if(n1 > n2)
            {
                comprendidos = n2 + 8;
                hasta = n1;
            }
            else
                System.out.println("error, numeros iguales");

        while(comprendidos < hasta)
        {
            System.out.print(" " + comprendidos);
            comprendidos += 7;
        }
        System.out.println("");
    }    
}
