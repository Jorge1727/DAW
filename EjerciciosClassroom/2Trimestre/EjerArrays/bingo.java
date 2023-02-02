package EjerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class bingo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        boolean salir = false;

        do 
        {
            //Declaracion de variables
            int[] col0 = new int[3];
            int[] col1 = new int[3];
            int[] col2 = new int[3];
            int[] col3 = new int[3];
            int[] col4 = new int[3];
            int[] col5 = new int[3];
            int[] col6 = new int[3];
            int[] col7 = new int[3];
            int[] col8 = new int[3];
            
            int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

            int[] jugados = new int[0];


            //introduzco los numeros de cada columna
            rellenarNumerosCarton(carton);

            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            ponerBlancos(carton);

            //pinto el cartón
            muestraCarton(carton);

            //pregunto si quiero sacar otra bola o terminar este juego
            boolean jugar = false;
            System.out.println("0 para salir, cualquier otra cosa para sacar bola");
            int scanner = sc.nextInt();

            if(scanner != 0)
                jugar = true;

            while(jugar == true)
            {

                //saco numero aleatorio - no se debe repetir
                int bola = (int)(Math.ceil(Math.random() * 89));

                while(seRirepite(bola, jugados) == true)
                {
                    bola = (int)(Math.ceil(Math.random() * 89));
                    seRirepite(bola, jugados);
                }

                jugados = insertarNumerosJugados(jugados, bola);
                
                //pinto el carton con numeros sacados
                System.out.println("Nuevo numero que ha salido: " + bola);
                System.out.print("Numeros jugados: ");
                System.out.println(Arrays.toString(jugados) + "\n");

                int numeroAciertos = muestraCarton(carton, bola);


                //Eres ganador??
                if (numeroAciertos >= 15)
                {
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("------------------------------  BINGO -----------------------------------");
                    System.out.println("-------------------------------------------------------------------------");
                    jugar = false;
                }
                else
                {
                    //pregunto si quiero sacar otra bola o terminar este juego
                    System.out.println("0 para salir, cualquier otra cosa para sacar bola");
                    scanner = sc.nextInt();

                    if(scanner == 0)
                        jugar = false;
                }

            }

            //Pregunto si quiero jugar otro cartón o salir definitivamente del programa
            System.out.println("¿Quieres empezar una partida? 0 para Salir, cualquier otra cosa será empezar nueva partida");
            scanner = sc.nextInt();

            if(scanner == 0)
                salir = true;

        } while(salir == false);

        sc.close();
    }
    
    //-------------------------FUNCIONES----------------------------------

    /**
     * Rellena el carton con numeros aleatorios sin repetir y añadiendo blancos siguiendo unas reglas.
     * @param matrizCarton
     */
    static void rellenarNumerosCarton(int[][] matrizCarton)
    {
        int[] numerosRepetidos = new int[0];//Array para saber que numeros han salido ya y no repetirlos

        for (int i = 0; i < matrizCarton.length; i++)//columnas 8
        {
            int[] fila = matrizCarton[i];

            for (int j = 0; j < fila.length; j++)//filas 3
            {
                if(i == 0)//solo para la primera columna 1 - 9
                {
                    int rndm = (int)(Math.ceil(Math.random() * 9));

                    boolean repite = seRirepite(rndm, numerosRepetidos);//boolean que nos dice si un numero ya se ha repetido

                    while(repite == true)//si reptite num, genera otro hasta que sea false
                    {
                        rndm = (int)(Math.ceil(Math.random() * 9));
                        repite = seRirepite(rndm, numerosRepetidos);
                    }
                    matrizCarton[i][j] = rndm;
                    numerosRepetidos = insertarNumerosJugados(numerosRepetidos, rndm);
                
                }
                else
                {
                    int rndm = (int)(((Math.random() * 10) + (10 * i)));

                    boolean repite = seRirepite(rndm, numerosRepetidos);

                    while(repite == true)
                    {
                        rndm = (int)(((Math.random() * 10) + (10 * i)));
                        repite = seRirepite(rndm, numerosRepetidos);
                    }
                    matrizCarton[i][j] = rndm;
                    numerosRepetidos = insertarNumerosJugados(numerosRepetidos, rndm);
                
                }
            }
        }
    }


    /**
     * Muestra el carton.
     * @param matrizCarton
     */
    static void muestraCarton(int[][] matrizCarton)
    {
        int[] filas = new int[3];

        System.out.println("*********************  C L U B    D E    B I N G O  *********************");
        System.out.println("┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐");
        for (int i = 0; i < filas.length; i++) 
        {
            System.out.print("|");
            
            for (int j = 0; j < matrizCarton.length; j++) 
            {
                if(matrizCarton[j][i] == -1)
                    System.out.print("▓▓\t|");
                else
                    System.out.print(matrizCarton[j][i] + "\t|");
            }
            System.out.println();
        }
        System.out.println("└───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");

    }


    /**
     * Muestra el carton añadiendo X si es que se ha acertado y devolviendo cuantos aciertos lleva.
     * @param matrizCarton
     * @param numeroJugado
     */
    static int muestraCarton(int[][] matrizCarton, int numeroJugado)
    {
        int aciertos = 0;
        int[] filas = new int[3];

        System.out.println("*********************  C L U B    D E    B I N G O  *********************");
        System.out.println("┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐");
        
        for (int i = 0; i < filas.length; i++) 
        {
            System.out.print("|");
            
            for (int j = 0; j < matrizCarton.length; j++) 
            {
                if(matrizCarton[j][i] == -1)
                    System.out.print("▓▓\t|");
                else
                {
                    if(matrizCarton[j][i] == numeroJugado)
                    {
                        matrizCarton[j][i] = -2;//para marcar los que ya han salido, les he dado el valor de -2
                        System.out.print("X\t|");
                        aciertos++;
                    }
                    else
                    {
                        if(matrizCarton[j][i] == -2)
                        {
                            System.out.print("X\t|");
                            aciertos++;
                        }
                        else
                            System.out.print(matrizCarton[j][i] + "\t|");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("└───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");

        return aciertos;
    }


    /**
     * booleano que nos dice si un numero se repite en un array.
     * @param intMatrizCarton
     * @param numerosRepetidos
     * @return
     */
    static boolean seRirepite(int intMatrizCarton, int[] numerosRepetidos)
    {
        boolean seRepite = false;

        for (int i = 0; i < numerosRepetidos.length; i++) 
        {
            if(intMatrizCarton == numerosRepetidos[i])
                seRepite = true;
        }

        return seRepite;
    }


    /**
     * Pone los blancos en el carton siguiendo sus indicaciones respectivas.
     * @param matrizCarton
     */
    static void ponerBlancos(int[][] matrizCarton)
    {
        for (int i = 0; i < 3; i++)
        {   
            int contBlancos = contBlancos(matrizCarton, i);
        
            while(contBlancos < 4)//solo 4 por cada fila
            {
                if(i == 2)
                {
                    int rndm = (int)(Math.random() * 9);

                    boolean puedeBlanco = sePuedeBlanco(matrizCarton,rndm);//puesto que en una columna no puede haber 3 en blanco

                    if(puedeBlanco == true)
                    {
                        matrizCarton[rndm][i] = -1;
                    }
                }
                else
                {
                    int rndm = (int)(Math.random() * 9);
                    matrizCarton[rndm][i] = -1;
                }

                contBlancos = contBlancos(matrizCarton, i);
            }
        }
    }


    /**
     * Nos dice si la fila ya tiene sus 4 espacios en blanco
     * @param matrizCarton
     * @param filaArray
     * @return
     */
    static int contBlancos(int[][]matrizCarton, int filaArray)
    {
        int blancos = 0;

        for (int i = 0; i < matrizCarton.length; i++) 
        {
            if(matrizCarton[i][filaArray] == -1)
                blancos++;
        }

        return blancos;
    }


    /**
     * Booleano que nos dice si podemos introducir blanco o no en la 3ra fila
     * @param matrizCarton
     * @param random
     * @return
     */
    static boolean sePuedeBlanco(int[][] matrizCarton, int random)
    {
        boolean sePuede = true;
        
        if(matrizCarton[random][0] == matrizCarton[random][1])
            sePuede = false;
        
        return sePuede;
    }


    /**
     * Pasamos el array de los numeros que ya han salido para no repetirlos y vamos incrementando la longitud del array
     * @param array
     * @param elemento
     * @return
     */
    static int[] insertarNumerosJugados(int[] array, int elemento)
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

}
