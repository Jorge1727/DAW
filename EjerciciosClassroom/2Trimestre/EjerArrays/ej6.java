package EjerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[15];

        for(int i = 0; i < 15; i++)
        {
            array[i] = sc.nextInt();
        }

        rotarArray(array);

        System.out.println(Arrays.toString(array));

        sc.close();
    }    

    static void rotarArray(int[] array)
    {
        int[] copia = Arrays.copyOfRange(array, 0, array.length);

        for(int i = 0; i < array.length; i++)
        {
            if(i < array.length - 1)
            {
                array[i + 1] = copia[i];
            }
            else
            {
                array[0] = copia[i];
            }
        }

        System.out.println(Arrays.toString(copia));
    }
}
