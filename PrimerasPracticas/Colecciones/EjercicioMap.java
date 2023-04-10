package Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioMap 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Al reves el int string
        HashMap<String, Integer> recambios = new HashMap<>();

        boolean cerrarProg = false;

        while(cerrarProg == false)
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1:
                    System.out.println("Di el nombre");
                    String producto = sc.nextLine().toUpperCase();

                    recambios.put(producto, 0);
                    break;
                
                case 2:
                    System.out.println("Di el codigo del producto");
                    producto = sc.nextLine().toUpperCase();

                    recambios.remove(producto);
                    break;

                case 3:
                    System.out.println("Di el codigo");
                    producto = sc.nextLine();
                    System.out.println("CUal es el stock");
                    int codigo = sc.nextInt();
                    recambios.put(producto, codigo);

                case 4:
                    System.out.println(recambios);
                    System.out.println();
                    break;

                case 0:
                    cerrarProg = true;
                    break;
                
                default:
                    System.out.println("Seleccione una opcion correcta");
                    break;
            }
        }
    }

    static int menu()
    {
        System.out.println("1 - Inertar producto");
        System.out.println("2 - Borrar producto");
        System.out.println("3 - Cambiar Stock");
        System.out.println("4 - Mostrar informacion");
        System.out.println("0 - salir");
        System.out.println("---------------------------------------------");
        System.out.println(" Indique opción...");
        System.out.println();
        int opcion = sc.nextInt();
        sc.nextLine();

        return opcion;
    }
    
}
