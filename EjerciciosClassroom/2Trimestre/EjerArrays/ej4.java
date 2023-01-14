package EjerArrays;

public class ej4 
{
    public static void main(String[] args) 
    {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        System.out.println("Numero:");
        for(int i = 0; i <= 19; i++)
        {
            numero[i] = (int)(Math.random() * 101);
            System.out.print("(" + i + ")" + numero[i] + " ");
        }

        System.out.println("\nCuadrado:");
        for(int i = 0; i <= 19; i++)
        {
            cuadrado[i] = (int)(Math.pow(numero[i], 2));
            System.out.print("(" + i + ")" + cuadrado[i] + " ");
        }

        System.out.println("\nCubo:");
        for(int i = 0; i <= 19; i++)
        {
            cubo[i] = (int)(Math.pow(numero[i], 3));
            System.out.print("(" + i + ")" + cubo[i] + " ");
        }
    }    
}
