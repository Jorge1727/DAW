package EjerArrays.EjerNDimensiones;

public class ej3 
{
    public static void main(String[] args) 
    {
        int matriz[][] = new int[4][5];

        asignaEnMatriz(matriz);

        muestraMatriz(matriz);

    }

    static int[][] asignaEnMatriz(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                fila[j] = (int)(Math.random() * 100);
            }
        }

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
                System.out.print(fila[j] + "\t|");
            }

            int sumaDeArray = sumaArray(fila);
            
            System.out.println("sumaFila = "+ sumaDeArray);
        }

        sumaMuestraColumnas(matriz);

        sumaTotal(matriz);
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

    static void sumaMuestraColumnas(int[][] matriz)
    {
        System.out.print("sumaCol: ");

        for (int i = 0; i < matriz[0].length; i++) 
        {
            int sumaCol = 0;

            for (int j = 0; j < matriz.length; j++)
            {
                sumaCol += matriz[j][i];
            }

            System.out.print(sumaCol + "\t");
        }

    }

    static void sumaTotal(int[][] matriz)
    {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) 
        {
            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) 
            {
                suma += matriz[i][j];
            }
        }

        System.out.print("TOTAL: "+ suma);
    }
}
