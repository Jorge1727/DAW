package EjerArrays;

public class UtilesParaNumeros 
{
    /**
     * Devuelve verdadero si el número que se pasa como paráme-
        tro es capicúa y falso en caso contrario.   
     * @param numero
     * @return boolean
     */
    static boolean esCapicua(int numero)
    {
        boolean resultado = false;
        int nuevoNumero = numero;
        int numeroAlReves = 0;

        while(nuevoNumero > 0)
        {
            int resto = nuevoNumero % 10;
            numeroAlReves = (numeroAlReves * 10) + resto;

            nuevoNumero /= 10;
        }

        if(numeroAlReves == numero)
        {
            resultado = true;
        }

        return resultado;
    }

    /**
     * Devuelve verdadero si el número que se pasa como parámetro
        es primo y falso en caso contrario.
     * @param numero
     * @return boolean
     */
    static boolean esPrimo(int numero)
    {
        boolean resultado = false;

        int cont = 0;

        for(int i = 1; i <= numero; i++)
        {
            if(numero % i == 0)
            {
                cont++;
            }
        }

        if(cont <= 2)
            resultado = true;

        return resultado;
    }

    /**
     * Devuelve el menor primo que es mayor al número que
        se pasa como parámetro.
     * @param numero
     * @return 
     */
    static int siguientePrimo(int numero)
    {
        boolean resultado = false;
        numero += 1;

        while(resultado == false)
        {
            int cont = 0;

            for(int i = 1; i <= numero; i++)
            {
                if(numero % i == 0)
                {
                    cont++;
                }
            }

            if(cont <= 2)
                resultado = true;
            else
                numero++;
        }

        return numero;
    }

    /**
     * Dada una base y un exponente devuelve la potencia.
     * @param numero
     * @return
     */
    static int potencia(int base, int exponente)
    {
        int potencia = base;

        if(exponente == 1)
            potencia = base;
        else if(exponente == 0)
            potencia = 1;
            else
            {
                for(int i = 1; i < exponente; i++)
                {
                    potencia *= base;
                }
            }

        return potencia;
    }

    /**
     * Cuenta el número de dígitos de un número entero.
     * @param numero
     * @return
     */
    static int digitos(int numero)
    {
        int digitos = 0;

        while(numero > 0)
        {
            digitos++;
            numero /= 10;
        }

        return digitos;
    }

    /**
     * le da la vuelta a un numero
     * @param numero
     * @return
     */
    static int voltea(int numero)
    {
        int vuelta = 0;

        while(numero > 0)
        {
            vuelta = (vuelta * 10) + (numero % 10);
            numero /= 10;
        }

        return vuelta;
    }

    /**
     * Devuelve el dígito que está en la posición n de un número entero.
        Se empieza contando por el 0 y de izquierda a derecha.
     * @param posicion
     * @param numero
     * @return
     */
    static int digitoN(int posicion, int numero)
    {
        int volteado = voltea(numero);
        int mod = 0;

        for(int i = 0; i <= posicion; i++)
        {
            mod = volteado % 10;

            volteado /= 10;
        }

        return mod;
    }

    /**
     * Da la posición de la primera ocurrencia de un dígito
        dentro de un número entero. Si no se encuentra, devuelve -1.
     * @param busca
     * @param numero
     * @return
     */
    static int posicionDeDigito(int busca, int numero)
    {
        int volteado = voltea(numero);
        int mod = 0;
        int posicion = -1;

        for(int i = 0; i <= digitos(numero); i++)//podria hacerlo con while.
        {
            mod = volteado % 10;

            if(mod == busca)
            {
                posicion = i;
                i = digitos(numero);//para que salga del bucle y coja solo la primera posicion que encuentre
            }

            volteado /= 10;
        }

        return posicion;
    }

    /**
     * Le quita a un número n dígitos por detrás (por la
        derecha).
     * @param quita
     * @param numero
     * @return
     */
    static int quitaPorDetras(int quita, int numero)
    {
        for(int i = 1; i <= quita; i++)
        {
            numero /= 10;
        }

        return numero;
    }

    /**
     * Le quita a un número n dígitos por delante (por la
        izquierda).
     * @param quita
     * @param numero
     * @return
     */
    static int quitaPorDelante(int quita, int numero)
    {
        int volteado = voltea(numero);

        for(int i = 1; i <= quita; i++)
        {
            volteado /= 10;
        }

        volteado = voltea(volteado);

        return volteado;
    }

    /**
     * Añade un dígito a un número por detrás.
     * @param añade
     * @param numero
     * @return
     */
    static int pegaPorDetras(int añade, int numero)
    {
        numero = (numero * 10) + añade;

        return numero;
    }

    /**
     * Añade un dígito a un número por delante.
     * @param añade
     * @param numero
     * @return
     */
    static int pegaPorDelante(int añade, int numero)
    {
        int volteado = voltea(numero);

        numero = (volteado * 10) + añade;

        numero = voltea(numero);

        return numero;
    }
    
    /**
     * Toma como parámetros las posiciones inicial y final
    dentro de un número y devuelve el trozo correspondiente.
     * @return
     */
    static int trozoDeNumero(int inicio, int ultimo, int numero)
    {
        int volteado = voltea(numero);

        for(int i = 0; i < inicio; i++)
            volteado /= 10;

        volteado = voltea(volteado);

        for(int i = 0; i < ultimo; i++)
            volteado /= 10;

        return volteado;
    }

    /**
     * pega dos num para formar uno
     * @param numero1
     * @param numero2
     * @return
     */
    static int juntaNumeros(int numero1, int numero2)
    {
        int volteadoN2 = voltea(numero2);
        int mod = 0;
        int pega = 0;

        while(volteadoN2 > 0)
        {
            mod = volteadoN2 % 10;

            pega = pegaPorDetras(mod, numero1);

            numero1 = pega;

            volteadoN2 /= 10;
        }

        return pega;

    }

    /**
     * Esta función convierte el número n al sistema de palotes y lo devuelve en una
    cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
    | - - | | - | - | | | en el sistema de palotes.
     * @param n
     * @return
     */
    public static String convierteEnPalotes(int numero)
    {
        int digitos = digitos(numero);
        String palotesFinal = "";

        for(int i = 0; i < digitos; i++)
        {
            int queDigito = digitoN(i, numero);
            String palotes = "";

            while(queDigito > 0)
            {
                palotes += "|";

                queDigito--;
            }

            if(i == (digitos - 1))
                palotesFinal += palotes;

            else
                palotesFinal += palotes + " - ";

        }
        return palotesFinal;
    
    }

    // /**
    //  * Esta función convierte el número n al sistema Morse y lo devuelve en una
    //     cadena de caracteres.
    //  * @param n
    //  * @return
    //  */
    // public String convierteEnMorse(int n)
    // {
        
    // }

}
//     //---------------------------------------------psvm--------------------------------------------------
//     public static void main(String[] args) 
//     {
//         int num1 = 532;
//             System.out.println(convierteEnPalotes(num1));
//     }
// }
