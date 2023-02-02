package EjerArrays;

public class ejBi12 
{
    public static void main(String[] args) 
    {
        int[][] matriz = new int[9][9];

        rellenaMatriz(matriz);

        muestraDiagonal(matriz);
    }
    
    static void rellenaMatriz(int[][]matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                int rndm = (int)((Math.random() * 400) + 500);

                matriz[i][j] = rndm;
            }
        }
    }

    static void muestraDiagonal(int[][]matriz)
    {
        int muestra = 8;
        int suma = 0;
        int max = 0;
        int min = 900;

        for (int i = 0; i < matriz.length; i++) 
        {
            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                if(j == muestra)
                {
                    System.out.print(matriz[i][j]);
                    suma += matriz[i][j];

                    max = Math.max(max, matriz[i][j]);
                    min = Math.min(min, matriz[i][j]);
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
            muestra--;

            
        }
        int media = suma / 9;
        System.out.print("Media: "+ media + "\tMinimo: "+ min + "\tMaximo: "+ max);
    }
}
