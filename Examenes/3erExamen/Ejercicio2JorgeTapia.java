import java.util.Scanner;

public class Ejercicio2JorgeTapia 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String[] frutasArray = new String[0];
        double[] preciosArray = new double[0];
        double[] cantidadVendidaArray = new double[0];
        boolean cerrarProg = false;

        do
        {
            String opcion = menu();

            switch(opcion)
            {
                case "a":
                    System.out.println("Indique la fruta: ");
                    String fruta = sc.nextLine();

                    frutasArray = insertarFruta(frutasArray, fruta);
                    break;
                    
                case "b":
                    System.out.println("Diga el nombre de la fruta: ");
                    fruta =sc.nextLine().toLowerCase();
                    System.out.println("Diga la cantidad vendida: ");
                    double vendido = sc.nextDouble();

                    cantidadVendidaArray = anadirCompra(frutasArray, fruta, vendido);
                    break;
                
                case "c":
                    System.out.println("Di la fruta: ");
                    fruta = sc.nextLine();
                    System.out.println("Di el precio: ");
                    double precio = sc.nextDouble();

                    preciosArray = modificarPrecio(frutasArray, fruta, precio);
                    break;

                // case "d":
                //     preciosArray = modTodosPrecios(cantidadVendidaArray, preciosArray);
                //     break;

                case "e":
                    muestraInforme(frutasArray, preciosArray, cantidadVendidaArray);
                    break;
                
                case "x":
                    cerrarProg = true;
                    break;

            }
            System.out.println();

        }while(cerrarProg == false);
    }

    //-------FUNCIONES---------
    
    /**
     * Muestra el menu devolviendo el string para el siguiente switch
     * @return
     */
    static String menu()
    {
        System.out.println("a - Insertar fruta");
        System.out.println("b - Añadir compra");
        System.out.println("c - modificar precio fruta");
        System.out.println("d - Modificar todos los precios");
        System.out.println("e - mostrar informe");
        System.out.println("x - salir");
        System.out.println("---------------------------------------------");
        System.out.println(" Indique opción...");
        System.out.println();
        String opcion = sc.nextLine().toLowerCase();

        return opcion;
    }

    /**
     * Inserta frutas en el array agrandandolo
     * @param arrayFrutas
     * @param fruta
     * @return
     */
    static String[] insertarFruta(String[] arrayFrutas, String fruta)
    {
        String[] nuevoArray = new String[arrayFrutas.length + 1];

        for(int i = 0; i < nuevoArray.length; i++)
        {
            if(i < arrayFrutas.length)
                nuevoArray[i] = arrayFrutas[i];
            else
                nuevoArray[i] = fruta;
        }
        
        return nuevoArray;
    }


    static double[] anadirCompra(String[] arrayFrutas,String fruta, double vendida)
    {
        double[] nuevoArray = new double[arrayFrutas.length];

        for (int i = 0; i < nuevoArray.length; i++) 
        {
            if(arrayFrutas[i] == fruta)
            {
                nuevoArray[i] = vendida;
            }
        }

        return nuevoArray;
    }

    static double[] modificarPrecio(String[] arrayFrutas, String fruta, double precios)
    {
        double[] nuevoArray = new double[arrayFrutas.length];

        for (int i = 0; i < nuevoArray.length; i++) 
        {
            if(arrayFrutas[i] == fruta)
            {
                nuevoArray[i] = precios;
                i = nuevoArray.length;
            }
        }

        return nuevoArray;
    }

    static void muestraInforme(String[] frutasArray, double[]preciosArray, double[]cantidadArray)
    {
        System.out.println("\t\tPrecio\tCantidad\tGanancia");
        for (int i = 0; i < frutasArray.length; i++) 
        {
            System.out.println("Fruta:" + frutasArray[i] + "\t" + preciosArray[i]+ "\t"+ cantidadArray[i]);
        }
    }

    // static double[] modTodosPrecios(double[] arrayVendido, double[] arrayPrecio)
    // {
    //     int suma = 0;
    //     for (int i = 0; i < arrayVendido.length; i++) 
    //     {
    //         suma += arrayVendido[i];
    //     }

    //     int media = suma / arrayVendido.length;
    // }

    //NO PUDE TERMINARLO, NO ME DIO TIEMPO
}
