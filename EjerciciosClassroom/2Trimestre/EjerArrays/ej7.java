package EjerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej7 
{
    public static void main(String[] args) 
    {
        int[] array = new int[100];

        rellenaAleatorio(array);

        System.out.println(Arrays.toString(array));

        System.out.println("Valor a cambiar:");
        Scanner sc = new Scanner(System.in);
        int cambia = sc.nextInt();

        System.out.println("Por que numero:");
        int nuevoCambio = sc.nextInt();

        pintarValoresCambio(array, cambia, nuevoCambio);

        sc.close();
    }
    
    static void rellenaAleatorio(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int aleatorio = (int)(Math.random() * 21);
            array[i] = aleatorio;
        }
    }

    static void pintarValoresCambio(int[] array, int cambia, int nuevoCambio)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == cambia)
            {
                array[i] = nuevoCambio;

                System.out.print("*" + array[i] + "* ");
            }
            else
                System.out.print(array[i] + " ");
        }
    }
}
