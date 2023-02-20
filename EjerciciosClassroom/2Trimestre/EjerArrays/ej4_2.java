package EjerArrays;

public class ej4_2 
{
    public static void main(String[] args) 
    {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        rellenaAleatorio(numero);
        //System.out.println(Arrays.toString(numero));
    
        rellenarExponente(cuadrado, numero, 2);

        rellenarExponente(cubo, numero, 3);

        pintarValores(numero, cuadrado, cubo);
    }
    
    static void rellenaAleatorio(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int aleatorio = (int)(Math.random() * 101);
            array[i] = aleatorio;
        }
    }

    static void rellenarExponente(int[]arrayDestino, int[] arrayOrigen, int exponente)
    {
        for(int i = 0; i < arrayOrigen.length; i++)
        {
            arrayDestino[i] = (int)(Math.pow(arrayOrigen[i], exponente));
        }
    }

    static void pintarValores(int[] array1, int[] array2, int[] array3)
    {
        for(int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i] + "\t" + array2[i] + "\t" + array3[i]);
        }
    }
}
