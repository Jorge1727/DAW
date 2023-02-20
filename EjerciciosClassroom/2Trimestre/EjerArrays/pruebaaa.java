package EjerArrays;

public class pruebaaa 
{
    public static void main(String[] args) 
    {
        int[] array = new int[0];
        array = insertarAlFinal(array, 25);
        imprimir(array);

    }   
    
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
