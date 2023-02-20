public class recursivas 
{
    static int suma(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        else
        {
            return n + suma(n  - 1);
        }
    }

    static int factorial(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n  - 1);
        }
    }

    static void piramide(int n)
    {
        if(n > 1)
        {
            pintarFila(n);
            System.out.println();
            piramide(n - 1);
        }
        else
        {
            System.out.println("*");
        }
    }

    static void pintarFila(int num)
    {
        if(num == 0)
        {
            System.out.print(" ");
        }
        else
        {
            System.out.print("*");
            pintarFila(num - 1);
        }
    }

    
    static String recorrerArray(String[] lista)
    {
        String resultado = "";

        int posicion = lista.length;
        resultado = recorrerArray(lista, posicion - 1);

        return resultado;
    }

    static String recorrerArray(String[] lista, int posicion)
    {
        String resultado = "";

        if(posicion == 0)
        {
            resultado = lista[posicion];
        }
        else
        {
            resultado = recorrerArray(lista, posicion - 1) + "\n" + lista[posicion];
        }

        return resultado;
    }

    public static void main(String[] args) 
    {
        System.out.println(suma(5));
        System.out.println(factorial(5));
        
        int alturaPiramide = 5;
        piramide(alturaPiramide);

        String str = "la vaca lola esta loca de la cabeza";
        String[] palabras = str.split(" ");

        recorrerArray(palabras);
    }    
}
