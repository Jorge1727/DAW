package EjerArrays;

public class UtilesArrayJorgeTapia
{
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

    /**
     * Incrementa el array segun el numero que le indiquemos en cuantos 
     * @param array
     * @param numeroElementos
     * @return
     */
    static int[] rellenar(int[] array, int numeroElementos)
    {
        int[] nuevoArray = new int[numeroElementos];
        
        for(int i = 0; i < numeroElementos; i++)
            nuevoArray[i] = 0;

        return nuevoArray;
    }

    /**
     * Vacia el array
     * @param array
     * @return
     */
    static int[] limpiar()
    {
        int[] nuevoArray = new int[0];

        return nuevoArray;
    }

    /**
     * 
     * @param array
     * @param numeroElementos
     * @param valor
     * @return
     */
    static int[] rellenar(int[] array, int numeroElementos, int valor)
    {
        int[] nuevoArray = new int[numeroElementos];

        for(int i = 0; i < numeroElementos; i++)
            nuevoArray[i] = valor;

        return nuevoArray;
    }

    /**
     * 
     * @param array
     * @param elemento
     * @return
     */
    static int[] insertarAlFinal(int[] array, int elemento)
    {
        int[] nuevoArray = new int[array.length + 1];

        for(int i = 0; i < nuevoArray.length; i++)
        {
            if(i < array.length)
                nuevoArray[i] = array[i];
            else
                nuevoArray[i] = elemento;
        }

        return nuevoArray;
    }

    /**
     * Inserta al principio nuevos elementos en el nuevo array
     * @param array
     * @param elemento
     * @return
     */
    static int[] insertarAlPrincipio(int[] array, int elemento)
    {
        int[] nuevoArray = new int[array.length + 1];

        for(int i = 0; i < nuevoArray.length; i++)
        {
            if(i == 0)
                nuevoArray[i] = elemento; 
            else
                nuevoArray[i] = array[i - 1];
        }

        return nuevoArray;
    }

    /**
     * Inserta en tal posición tal elemento
     * @param array
     * @param elemento
     * @param posicion
     * @return
     */
    static int[] insertatEnPosicion(int[] array, int elemento, int posicion)
    {
        int[] nuevoArray = new int[array.length + 1];

        for(int i = 0; i < nuevoArray.length; i++)
        {
            if(i == posicion + 1)
                nuevoArray[i] = elemento;
            else
            {
                if(i > posicion + 1)
                    nuevoArray[i] = array[i - elemento];
                else
                    nuevoArray[i] = array[i];
            }
        }

        return nuevoArray;
        
    }

    /**
     * Boolean que nos dice si el array esta ordenado o no.
     * @param array
     * @return
     */
    static boolean estaOrdenado(int[] array)
    {
        boolean ordenado = true;

        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] > array[i + 1])
            {
                ordenado = false;
                i = array.length;
            }
                
        }

        return ordenado;
    }

    /**
     * Eliminaremos el ultimo elememto del array
     * @param array
     * @return
     */
    static int[] eliminarUltimo(int[] array)
    {
        int[] nuevoArray = new int[array.length - 1];

        for (int i = 0; i < nuevoArray.length; i++) 
        {
            nuevoArray[i] = array[i];
        }

        return nuevoArray;
    }

    /**
     * Eliminaremos el primer elemento del array
     * @param array
     * @return
     */
    static int[] eliminarPrimero(int[] array)
    {
        int[] nuevoArray = new int[array.length - 1];

        for (int i = 0; i < nuevoArray.length; i++) 
        {
            nuevoArray[i] = array[i + 1];
        }

        return nuevoArray;
    }

    /**
     * Eliminaremos el elememto del array que contenga el valor que le indiquemos.
     * @param array
     * @param elemento
     * @return
     */
    static int[] eliminar(int[] array, int elemento)
    {
        int[] nuevoArray = new int[array.length - 1];
        int aux = 0;

        for (int i = 0; i < nuevoArray.length; i++) 
        {
            if(array[i] != elemento)
            {
                if(aux == 0)
                    nuevoArray[i] = array[i];
                else
                    nuevoArray[i] = array[i + 1];
            }
            else
            {
                nuevoArray[i] = array[i + 1];
                aux = 1;
            }
        }

        return nuevoArray;
    }

    /**
     * Ordenar el array de menor a mayor
     * @param array
     * @return
     */
    static int[] ordenar(int[] array)
    {
        for (int x = 0; x < array.length; x++) 
        {
            for (int i = 1; i < array.length-x; i++) 
            {
                if(array[i - 1] > array[i])
                {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                }
            }
        }

        return array;
    }

    /**
     * Inserta el elemento nuevo de forma ordenada en el array
     * @param array
     * @param elemento
     * @return
     */
    static int[] insertarOrdenado(int[] array, int elemento)
    {
        int[] nuevoArray = new int[array.length + 1];
        int aux = 0;

        for (int i = 0; i < nuevoArray.length - 1; i++) 
        {
            if(array[array.length - 1] < elemento || array[0] > elemento)
            {
                if(array[array.length - 1] < elemento)
                {
                    if(i == array.length - 1)
                    {
                        nuevoArray[i + 1] = elemento;
                        nuevoArray[i] = array[i];
                    }
                    else
                        nuevoArray[i] = array[i];
                }
                else
                {
                    if(i == 0)
                    {
                        nuevoArray[i] = elemento;
                        nuevoArray[i + 1] = array[i];
                    }
                    else
                        nuevoArray[i + 1] = array[i];
                }
            }
            else
            {
                if(array[i] < elemento && elemento < array[i + 1])
                {
                    nuevoArray[i + 1] = elemento;
                    nuevoArray[i] = array[i];
                    aux = 1;
                    
                }
                else
                {
                    if(aux == 0)
                        nuevoArray[i] = array[i];
                    else
                        nuevoArray[i + 1] = array[i];
                }
            }
        }

        return nuevoArray;
    }

    /**
     * Devuelve -1 si el elemento NO está en el array y en caso de estar DEVUELVE la posición en la que está 
     * @param array
     * @param elemento
     * @return
     */
    static int buscar(int[] array, int elemento)
    {
        int numero = -1;

        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] == elemento)
                numero = i;
        }

        return numero;
    }

    /**
     * Invierte el array
     * @param array
     * @return
     */
    static int[] invertir(int[] array)
    {
        int[] nuevoArray = new int[array.length];
        int suma = -1;

        for (int i = array.length; i > 0; i--) 
        {
            suma++;
            nuevoArray[suma] = array[i - 1];
        }

        return nuevoArray;
    }

    /**
     * Partir el array desde una posicion inicial y final
     * @param array
     * @param posicionInicial
     * @param posicionCorte
     * @return
     */
    static int[] partirPor(int[] array, int posicionInicial, int posicionCorte)
    {
        int longitud = array.length - posicionInicial;
        int longitudFinal = longitud - (posicionCorte - posicionInicial);

        int[] nuevoArray = new int[longitudFinal];

        for (int i = 0; i < nuevoArray.length; i++) 
        {
            nuevoArray[i] = array[i + posicionInicial];
        }

        return nuevoArray;
    }

    /**
     * Boolean que devuelve true si los arrays a comparar son iguales, sino devuelve false
     * @param array1
     * @param array2
     * @return
     */
    static boolean sonIguales(int[]  array1, int[] array2)
    {
        boolean iguales = false;

        if(array1.length == array2.length)
        {
            for (int i = 0; i < array1.length; i++) 
            {
                if(array1[i] != array2[i])
                    i = array1.length;
                else
                    iguales = true;
            }
        }

        return iguales;
    }

    /**
     * Boolean que devuelve true si el elemento es igual al otro array en la misma posición, sino false
     * @param array1
     * @param array2
     * @param posicionAComparar
     * @return
     */
    static boolean elementosIguales(int[]array1,  int[] array2, int posicionAComparar)
    {
        boolean iguales = false;

        if(array1[posicionAComparar] == array2[posicionAComparar])
            iguales = true;

        return iguales;
    }
}
