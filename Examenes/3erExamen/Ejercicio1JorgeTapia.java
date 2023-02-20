public class Ejercicio1JorgeTapia 
{
    public static void main(String[] args) 
    {
        int[] array = {4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4};

        imprimir(array);

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = (i+1); j < array.length; j++)//j = i+1 para que siga buscando a partir del siguiente
            {
                if(array[i] == array[j])
                {
                    array[j] = numeroMayor(array) + 1; //+1 para añadirle el siguiente mayor actual
                }
            }
        }

        imprimir(array);
    }
    
    //--------FUNCIONES--------

    /**
     * Nos devuelve el numero mayor en el array
     * @param array
     * @return
     */
    static int numeroMayor(int[] array)
    {
        int numMayor = 0;

        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] > numMayor)
                numMayor = array[i];
        }

        return numMayor;
    }

    /**
     * Imprime el array
     * @param array
     */
    public static void imprimir(int[]  array)
    {
        System.out.print("[ ");

        for(int i = 0; i < array.length; i++)
        {
            if(i == (array.length - 1))
                System.out.print(array[i] + " ");
            else
                System.out.print(array[i] + " | ");
        }

        System.out.println("]");
    }
}
