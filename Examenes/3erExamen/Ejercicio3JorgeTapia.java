public class Ejercicio3JorgeTapia 
{
    public static void main(String[] args) 
    {
        int[][] matriz = new int[5][10];

        rellenaMatriz(matriz);
        pintaMatriz(matriz);
        rellenaCeros(matriz);
        pintaMatriz(matriz);
    }    


    //-----FUNCIONES----

    /**
     * Nos rellena la matriz con aleatorios de 0-4
     * @param matriz
     */
    static void rellenaMatriz(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            int[] fila = matriz[i];

            for (int j = 0; j < fila.length; j++) 
            {
                int rndm = (int)(Math.random() * 5);

                matriz[i][j] = rndm;
            }
        }
    }

    static void pintaMatriz(int[][] matriz)
    {
        System.out.println("-------------------------------------------------------------------------------------------");
        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.print("fila " + (i+1) + ": ");
            int[] fila = matriz[i];

            for (int j = 0; j < fila.length; j++) 
            {
                System.out.print(matriz[i][j] + "\t");  
            }
            System.out.print("| == " + suma(fila));
            System.out.println();
        }
        sumaMuestraColumnas(matriz);
    }

    static void sumaMuestraColumnas(int[][] matriz)
    {
        System.out.print("sumaCol\t ");

        for (int i = 0; i < matriz[0].length; i++) 
        {
            int sumaCol = 0;

            for (int j = 0; j < matriz.length; j++)
            {
                sumaCol += matriz[j][i];
            }

            System.out.print(sumaCol + "\t");
        }
        System.out.println();

    }

    static void rellenaCeros(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            int[]fila = matriz[i];
            int suma = suma(fila);
            int ceros = cuentaCeros(fila);
            double falta = 0;

            if(ceros != 0)
            {
                //calculo para saber que añadirle a los 0
                falta = 24 - suma;
                falta = falta / ceros;

                if(suma != 24)
                {
                    if(suma < 24)
                    {
                        int ultimoCero = 0;
                        for (int j = 0; j < fila.length; j++)
                        {
                            if(matriz[i][j] == 0)
                            {
                                ultimoCero = j;//para el siguiente if
                                matriz[i][j] = (int)(Math.floor(falta));
                            }
                        }

                        //Como hemos escogido floor, seguramente en algun caso falte sumarle uno, por eso este if
                        if(suma(fila) < 24)
                        {
                            matriz[i][ultimoCero] += 1;
                        }
                    }
                    else//si es mayor tendrá que restar
                    {
                        int ultimoCero = 0;
                        for (int j = 0; j < fila.length; j++) 
                        {
                            if(matriz[i][j] == 0)
                            {
                                ultimoCero = j;//para el siguiente if
                                matriz[i][j] = (int)(Math.floor(falta));
                            }
                        }

                        //Como hemos escogido floor, seguramente en algun caso falte sumarle uno, por eso este if
                        if(suma(fila) < 24)
                        {
                            matriz[i][ultimoCero] += 1;
                        }
                    }
                }
            }            
        }
    }

    /**
     * Nos devuelve entero de la suma total de las filas
     * @param fila
     * @return
     */
    static int suma(int[] fila)
    {
        int suma = 0;
        for (int i = 0; i < fila.length; i++) 
        {
            suma += fila[i];
        }

        return suma;
    }

    /**
     * Nos devuelve el entero de cuantos ceros hay en la array de fila
     * @param fila
     * @return
     */
    static int cuentaCeros(int[] fila)
    {
        int ceros = 0;
        for (int i = 0; i < fila.length; i++) 
        {
            if(fila[i] == 0)
                ceros++;
        }

        return ceros;
    }
}
