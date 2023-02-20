package EjerArrays;

public class ejBi13 
{
    public static void main(String[] args) 
    {
        //Variables
        String[] pais = {"España", "Rusia", "Japón", "Aus"};
        int[][] alturas = new int[4][10];

        muestraEstadistica(alturas, pais);
    }

    static void muestraEstadistica(int[][] alturas, String[] paises)
    {
        for (int i = 0; i < alturas.length; i++) 
        {
            System.out.print(paises[i]+"\t|");

            int[] fila = alturas[i];
            for (int j = 0; j < fila.length; j++) 
            {
                int rndm = (int)((Math.random() * 70) + 140);

                alturas[i][j] = rndm;

                System.out.print(alturas[i][j] + "\t|");
            }

            mediaAltura(fila);

            //Podemos hacer una sola funcion que devuleva un array de 2 valores la min y max.
            minAltura(fila);

            maxAltura(fila);
        }

    }

    static void mediaAltura(int[] fila)
    {
        int suma = 0;

        System.out.print("MED: ");

        for (int i = 0; i < fila.length; i++) 
        {
            suma += fila[i];
        }

        int media = suma / fila.length;

        System.out.print(media+ "| ");
    }

    static void minAltura(int[] fila)
    {
        int min = 0;

        System.out.print("MIN: ");

        for (int i = 0; i < fila.length; i++) 
        {
            if(i == 0)
                min = fila[i];
            else
            {
                if(fila[i] < min)
                min = fila[i];
            }
            
        }

        System.out.print(min + "| ");
    }

    static void maxAltura(int[] fila)
    {
        int max = 0;

        System.out.print("MAX: ");

        for (int i = 0; i < fila.length; i++) 
        {
            if(i == 0)
                max = fila[i];
            else
            {
                if(fila[i] > max)
                max = fila[i];
            }
            
        }

        System.out.println(max + "| ");
    }
}
