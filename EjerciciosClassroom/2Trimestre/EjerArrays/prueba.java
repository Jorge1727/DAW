package EjerArrays;

public class prueba 
{
    public static void main(String[] args) 
    {
        int[] arrayInt = new int[5];

        int valorArray = arrayInt.length;

        int[] nuevoArray = new int[valorArray + 4];

        for(int i = 0; i < nuevoArray.length; i++)
        {
            if(i < arrayInt.length)
                nuevoArray[i] = arrayInt[i];
            else
                nuevoArray[i] = 0;
        }
    }    
}
