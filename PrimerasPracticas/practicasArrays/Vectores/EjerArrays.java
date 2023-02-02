import java.util.Scanner;

public class EjerArrays
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        String[] array = new String[10];
        boolean cerrarProg = false;

        do
        {
            int opcion = menu();

            switch(opcion)
            {
                case 1:
                    limpiar(array);
                    break;

                case 2:
                    insertar(array);
                    break;
                
                case 3:
                    mostrar(array);
                    break;

                case 4:
                    llenarArray(array);
                    break;

                case 5:
                    mostrarTodo(array);
                    break;

                case 0:
                    cerrarProg = true;
                    break;
                
                default:
                    System.out.println("Error, Introduce de 0 a 5");
            }

        }while(cerrarProg == false);
    }


    //------FUNCIONES--------

    /**
     * Muestra del menu de Arrays
     * @return
     */
    static int menu()
    {
        System.out.println("1 - limpia\n2 - inserta en posicion\n3 - muestra en tal posicion\n4 - llenar todo array con i\n5 - mostrar todo array\n0 - salir");

        int opcion = sc.nextInt();

        return opcion;
    }

    /**
     * Limpia el array
     * @param puntero
     */
    static void limpiar(String[] puntero)
    {
        for(int i = 0; i < puntero.length; i++)
        {
            puntero[i] = null;
        }
    }

    /**
     * Inserta en la posicion indicada lo que se desee en el array
     * @param array
     */
    static void insertar(String[] array)
    {
        System.out.println("Di la posicion que quieres modificar");
        int posicion = sc.nextInt();
        sc.nextLine();

        System.out.println("Que quieres añadir?");
        String add = sc.nextLine();

        array[posicion] = add;
    }

    /**
     * Muestra el array seleccionado
     * @param array
     */
    static void mostrar(String[] array)
    {
        System.out.println("Di la posicion que quieres ver");
        int posicion = sc.nextInt();

        System.out.println(array[posicion]);
    }

    /**
     * Lleana el array de i
     * @param puntero
     */
    static void llenarArray(String[] puntero)
    {
        for(int i = 0; i < puntero.length; i++)
        {
            puntero[i] = "cadena i";
        }
    }

    /**
     * Muestra todo el array
     * @param array
     */    
    static void mostrarTodo(String[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
