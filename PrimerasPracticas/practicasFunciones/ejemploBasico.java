public class ejemploBasico 
{
    public static void main(String[] args) 
    {
        String saludo = "Que pasa";

        System.out.println("ejercicio de ejemplo");

        //imprimir();
        imprimir(saludo, 2);

        System.out.println("parte del medio");

        imprimir(saludo, 5);

        System.out.println("parte final");

        imprimir(saludo);

        System.out.println("---------------");

        int n1 = 5;
        int n2 = 8;
        int n3 = 2;

        int resultadoSuma = suma(n1, n2);
        imprimir(resultadoSuma + "", 3);

        System.out.println("-------------");

        resultadoSuma = suma(n1, n2, n3);
        imprimir(resultadoSuma + "", 1);

    }

    //VARIABLES
    static void imprimir()
    {

        for(int i = 0; i < 3; i++)
        {
            System.out.println("holaaaaaaa");
        }
    }

    static void imprimir(String texto)
    {
        texto += " adios";

        for(int i = 0; i < 3; i++)
        {
            System.out.println(texto);
        }
    }

    static void imprimir(String texto, int repeticiones)
    {
        for(int i = 0; i < repeticiones; i++)
        {
            System.out.println(texto);
        }
    }

    static int suma(int a, int b)
    {
        int resultado = a + b;

        System.out.println("suma " + a + "+" + b);
        return(resultado);
    }

    //CREACION DE JAVADOC: para documentar y despues me aparecerá cuando lo vaya a poner en el codigo me dará información de dicha función
    /**
     * suma de tres sumandos
     * @param a primer sumando
     * @param b segundo sumando
     * @param c tercer sumando
     * @return resultado de esas sumas
     */
    static int suma (int a, int b, int c)
    {
        return suma(a, suma(b, c));
    }
}
