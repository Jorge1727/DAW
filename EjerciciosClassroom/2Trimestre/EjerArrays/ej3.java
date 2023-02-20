package EjerArrays;

import java.util.Scanner;

public class ej3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i <= 9; i++)
        {
            System.out.println("Di un numero:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("El array al reves seria: ");
        for(int i = 9; i >= 0; i--)
        {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        sc.close();
    }    
}
