package EjerArrays;

import java.util.Scanner;

public class ej15 
{
    //-------MAIN------
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean cerrarProg = false;

        int[] mesas = new int[20];//Mi programa puede admitir mas mesas, empezando un descuadre de la impresion de la funcion muestraMesas a partir de 100 mesa.

        rellenaMesas(mesas);

        while(cerrarProg == false)
        {
            muestraMesas(mesas);

            System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int numPersonas = sc.nextInt();

            do
            {
                if(numPersonas > 4)
                {
                    System.out.println("Lo siento, no admitimos grupos de " + numPersonas + ", haga grupos de 4 personas como máximo e intente de nuevo.");
                    System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
                    numPersonas = sc.nextInt();
                }
            }while(numPersonas > 4);

            if(numPersonas <= -1)
                cerrarProg = true;
            else 
            {
                int aux = 0;
                for (int i = 0; i < mesas.length; i++) 
                {
                    if(mesas[i] == 0)
                    {
                        mesas[i] = numPersonas;
                        i = mesas.length;
                        aux = 1;
                    }
                }

                if(aux == 0)
                {
                    int aux2 = 0;
                    for (int i = 0; i < mesas.length; i++) 
                    {
                        if((mesas[i]) + (numPersonas) <= 4)
                        {
                            mesas[i] += numPersonas;
                            aux2 = 1;

                            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1));
                            i = mesas.length;
                        }
                    }

                    if(aux2 == 0)
                        System.out.println("Lo siento, en estos momentos no queda sitio.");

                }
            }
        }

        sc.close();
    }

    //-------FUNCIONES------

    /**
     * Rellenará las mesas que tenga el array, hasta un máximo de 4 personas.
     * @param array
     * @return
     */
    static int[] rellenaMesas(int[] arrayMesas)
    {
        for (int i = 0; i < arrayMesas.length; i++) 
        {
            arrayMesas[i] = (int)(Math.random() * 5);
        }

        return arrayMesas;
    }

    /**
     * Nos muestra por la consola el numero de mesas escogido y la ocupación que tienen
     * @param arrayMesas
     */
    static void muestraMesas(int[] arrayMesas)
    {
        //Parte que muestra el numero de mesas.
        System.out.print("┌─────────┬─");

        for(int i = 1; i < arrayMesas.length + 1; i++)
        {
            if(i >= 10)//Parte para el descuadre a partir del numero 10.
            {
                if(i == ((arrayMesas.length + 1) - 1))
                    System.out.print("────┐");
                else
                    System.out.print("────┬─");
            }
            else
            {
                if(i == ((arrayMesas.length + 1) - 1))
                    System.out.print("───┐");
                else
                    System.out.print("───┬─");
            }
        }

        System.out.println("");

        System.out.print("│Mesa no  │ ");

        for(int i = 1; i < arrayMesas.length + 1; i++)
        {
            if(i == ((arrayMesas.length + 1) - 1))
                System.out.print(i + "  ");
            else
                System.out.print(i + "  | ");
        }

        System.out.println("|");

        System.out.print("├─────────┼─");

        for(int i = 1; i < arrayMesas.length + 1; i++)
        {
            if(i >= 10)//Parte para el descuadre a partir del numero 10.
            {
                if(i == ((arrayMesas.length + 1) - 1))
                    System.out.print("────┤");
                else
                    System.out.print("────┼─");
            }
            else
            {
                if(i == ((arrayMesas.length + 1) - 1))
                    System.out.print("───┤");
                else
                    System.out.print("───┼─");
            }
        }

        System.out.println();

        //Parte que muestra el array con el numero de clientes en cada mesa.
        System.out.print("│Ocupación│ ");

        for(int i = 0; i < arrayMesas.length; i++)
        {
            if(i >= 9)//Parte para el descuadre a partir del numero 10.
            {
                if(i == arrayMesas.length - 1)
                    System.out.print(arrayMesas[i] + "   |");
                else
                    System.out.print(arrayMesas[i] + "   | ");
            }
            else
            {
                if(i == ((arrayMesas.length + 1) - 1))
                    System.out.print(arrayMesas[i] + " |");
                else
                    System.out.print(arrayMesas[i] + "  | ");
            }
        }

        System.out.println();

        System.out.print("└─────────┴─");

        for(int i = 1; i < arrayMesas.length + 1; i++)
        {
            if(i >= 10)//Parte para el descuadre a partir del numero 10.
            {
                if(i == ((arrayMesas.length + 1) - 1))
                    System.out.print("────");
                else
                    System.out.print("────┴─");
            }
            else
            {
                if(i == ((arrayMesas.length + 1) - 1))
                    System.out.print("───");
                else
                    System.out.print("───┴─");
            }
        }

        System.out.println("┘");
    }


}
