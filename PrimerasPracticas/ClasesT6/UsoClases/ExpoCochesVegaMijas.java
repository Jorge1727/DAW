package ClasesT6.UsoClases;

import java.util.Scanner;
import ClasesT6.Clases.Zona;

public class ExpoCochesVegaMijas 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //Variables
        boolean cerrarProg = false;

        //Creo las tres zonas
        Zona zPrincipal = new Zona(1000);
        Zona zCompVent = new Zona(200);
        Zona zVip =  new Zona(25);

        //Bucle para el menu
        do
        {
            menu();
            int opcion = sc.nextInt();

            switch(opcion)
            {
                case 1:
                    imprimirLibres(zPrincipal, zCompVent, zVip);
                    break;
                case 2:
                    System.out.println("Cuantas entradas?");
                    int cantidad = sc.nextInt();

                    System.out.println("De que zona? (1Principal 2ComprVebta 3VIP)");
                    int zonaVenta = sc.nextInt();

                    switch(zonaVenta)
                    {
                        case 1:
                            zPrincipal.vender(cantidad);
                            break;
                        case 2:
                            zCompVent.vender(cantidad);
                            break;
                        case 3:
                            zVip.vender(cantidad);
                            break;
                        
                        default:
                            System.out.println("opcion no valida");
                            break;
                    }
                    break;
                
                default:
                    System.out.println("No valido");
                    break;
            }
        }while(cerrarProg == false);
        
        sc.close();
    }
    
    public static void menu()
    {
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
    }

    public static void imprimirLibres (Zona z1, Zona z2, Zona z3)
    {
        System.out.println("Zona principal "+ z1.getEntradasPorVender() + " entradas");
        System.out.println("Zona CompVenta "+ z2.getEntradasPorVender() + " entradas");
        System.out.println("Zona VIP "+ z3.getEntradasPorVender() + " entradas");
    }

}
