package EjerArrays.EjerNDimensiones;

import java.util.Scanner;

public class ej2 
{
    public static void main(String[] args) 
    {
        int[][] matriz = new int[4][4];

        asignaEnMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.print(i + " fila: |");

            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                System.out.print(fila[j] + "\t|");
            }

            int sumaDeArray = sumaArray(fila);
            
            System.out.println("sumaFila = "+ sumaDeArray);
        }

        muestraMatriz(matriz);
    }

    
    static int[][] asignaEnMatriz(int[][] matriz)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) 
        {
            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                System.out.println("Di el valor de la fila " + (i + 1)  + " y columna " + (j+ 1));
                fila[j] = sc.nextInt();
            }
        }
        sc.close();

        return matriz;
    }

    static void muestraMatriz(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.print(i + " fila: |");

            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                System.out.print(fila[j] + " |");
            }
            System.out.println();
        }
    }

    static int sumaArray(int[] array)
    {
        int suma = 0;

        for (int i = 0; i < array.length; i++) 
        {
            suma += array[i];
        }

        return suma;
    }
}
