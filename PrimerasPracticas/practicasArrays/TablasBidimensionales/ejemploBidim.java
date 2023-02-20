package PrimerasPracticas.practicasArrays.TablasBidimensionales;

import java.util.Arrays;

public class ejemploBidim 
{
    public static void main(String[] args) 
    {
        int filas = 3;
        int columnas = 4;

        //declara array bidim
        int[][] matriz = new int[filas][columnas];

        //pos f1 c3
        matriz[1][3] = 10;

        System.out.println(Arrays.deepToString(matriz));
        
        imprimirMAtriz(matriz);

        int[][][] matrizTriple = new int[3][4][2];
        System.out.println(Arrays.deepToString(matrizTriple));
     }

    static void imprimirMAtriz(int[][] arrayBid)
    {
        for (int i = 0; i < arrayBid.length; i++) 
        {
            System.out.println(i + " fila");

            int[] fila = arrayBid[i];
            for (int j = 0; j < fila.length; j++) 
            {
                System.out.print(fila[j] + " |");
            }
        }
        System.out.println();
    }
}
