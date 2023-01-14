package EjerArrays;

public class ej11 
{
    public static void main(String[] args) 
    {
        //crear array inicial
        int[] array = new int[0];
        int[] arrayPrim = new int[0];
        int[] arrayNoPrim = new int[0];
        
        //rellenar el array
        array = rellenarRndm(array, 10, 15);

        //mostrar array
        UtilesArrayJorgeTapia.imprimir(array);

        //buscar los primos

        for (int i = 0; i < array.length; i++)
        {
            if(UtilesParaNumeros.esPrimo(array[i]) == true)
                arrayPrim = UtilesArrayJorgeTapia.insertarAlPrincipio(arrayPrim, array[i]);
            else
                arrayNoPrim = UtilesArrayJorgeTapia.insertarAlPrincipio(arrayNoPrim, array[i]);
        }

        System.out.print("Los primos son: ");
        UtilesArrayJorgeTapia.imprimir(arrayPrim);

        System.out.print("Los No primos son: ");
        UtilesArrayJorgeTapia.imprimir(arrayNoPrim);

        //unir primos + NO primos
        array = arrayPrim;

        for (int i = 0; i < arrayNoPrim.length; i++) 
        {
            array = UtilesArrayJorgeTapia.insertarAlFinal(array, arrayNoPrim[i]);
        }
        
        //mostrar array resultante
        UtilesArrayJorgeTapia.imprimir(array);

    }    

    static int[] rellenarRndm(int[] array, int numeroElementos, int hasta)
    {
        int[] nuevoArray = new int[numeroElementos];

        for(int i = 0; i < numeroElementos; i++)
        {
            int rndm = (int)(Math.random() * (hasta + 1));

            nuevoArray[i] = rndm;
        }
        
        return nuevoArray;
    }
}
