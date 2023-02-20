package EjerArrays.EjerNDimensiones;

public class ej1 
{
    public static void main(String[] args) 
    {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) 
        {
            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                fila[j] = j + (i * 10);
            }
        }

        muestraMatriz(matriz);
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
}
