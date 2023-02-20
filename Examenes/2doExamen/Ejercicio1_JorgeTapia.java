import java.util.Scanner;

public class Ejercicio1_JorgeTapia 
{
    public static void main(String[] args) 
    {
        final double[] PLATOS = new double[10];
        //final double[] PLATOS = {5, 4, 4.5, 6, 8, 9, 5 ...};

        PLATOS[0] = 5;
        PLATOS[1] = 4;
        PLATOS[2] = 4.5;
        PLATOS[3] = 6;
        PLATOS[4] = 8;
        PLATOS[5] = 9;
        PLATOS[6] = 5;
        PLATOS[7] = 1.5;
        PLATOS[8] = 1.25;
        PLATOS[9] = 2;

        boolean cerrarProg = false;
        double tipoSeleccion = 0;
        int descuento = 0;
        double total1Plato = 0;
        String str1Platos = "";
        double total2Plato = 0;
        String str2Platos = "";
        double totalPostre = 0;
        String strPostres = "";
        String strdescuentoFinal = "";
        double total = 0;
        Scanner sc = new Scanner(System.in);

        while(cerrarProg == false)
        {
            System.out.println(" *** RESTAURANTE IES VEGA DE MIJAS ****");
            System.out.println(" ----------------------------------");
            System.out.println("Primeros platos");
            System.out.println(" 1. Salmorejo (5€)");
            System.out.println(" 2. Sopa picadillo (4€)");
            System.out.println(" 3. Ensalada de atún (4.5€)");
            System.out.println("Segundos platos");
            System.out.println(" 4. Paella (6€)");
            System.out.println(" 5. Salmón (8€)");
            System.out.println(" 6. Codillo al horno (9€)");
            System.out.println(" 7. Lentejas (5€)");
            System.out.println("Postres");
            System.out.println(" 8. Fruta (1.5€)");
            System.out.println(" 9. Café (1.25€)");
            System.out.println("10. Helado (2€)");
            System.out.println();
            System.out.println();
            System.out.println("0. SALIR (Imprimir Ticket + FIN) ");
            System.out.println("Selecciona la opción deseada por el cliente...");

            int seleccion = sc.nextInt();

            while(seleccion < 0 || seleccion > 10)//CONTROL DE ERRORES
            {
                System.out.println("La opcion no es correcta. Di los platos del 1 al 10");
                seleccion = sc.nextInt();
            }

            if (seleccion == 0)
            {
                cerrarProg = true;
                total += total1Plato + total2Plato + totalPostre;

                //APLICACION DE DESCUENTOS SEGUN SU TOTAL
                if (total >= 20 && total <= 30)
                {
                    total -= 2;
                    strdescuentoFinal = "(-2€ de descuento ya aplicados)";
                }
                else
                { 
                    if(total >= 30 && total <= 50)
                    {
                        total -= 3;
                        strdescuentoFinal = "(-3€ de descuento ya aplicados)";
                    }
                    else
                    { 
                        if(total >= 50)
                        {
                            total -= 5;
                            strdescuentoFinal = "(-5€ de descuento ya aplicados)";
                        }
                    }
                }

                //IMPRIMIR TICKET
                System.out.println("-----------------------------\n**Primeros platos" + str1Platos);
                System.out.println("**Segundos platos" + str2Platos);
                System.out.println("**Postres" + strPostres);
                System.out.println("\nTOTAL A PAGAR: " + total + "€ " + strdescuentoFinal +"\n----------------------------");
            }
            else
            {
                System.out.println("¿Que cantidad?");
                int cantidadPlantos = sc.nextInt();

                while(cantidadPlantos <= 0)//CONTROL DE ERRORES
                {
                    System.out.println("La opcion no es correcta. Como minimo un plato");
                    cantidadPlantos = sc.nextInt();
                }

                switch(seleccion)
                {
                    //PRIMEROS PLATOS
                    case 1:
                        tipoSeleccion = PLATOS[0];
                        total1Plato += tipoSeleccion * cantidadPlantos;
                        str1Platos += "\nSalmorejo (5€) x" + cantidadPlantos;
                        break;

                    case 2:
                        tipoSeleccion = PLATOS[1];
                        total1Plato += tipoSeleccion * cantidadPlantos;
                        str1Platos += "\nSopa picadillo (4€) x" + cantidadPlantos;
                        break;

                    case 3:
                        tipoSeleccion = PLATOS[2];
                        total1Plato += tipoSeleccion * cantidadPlantos;
                        str1Platos += "\nEnsalada de atún (4.5€) x" + cantidadPlantos;
                        break;

                    //SEGUNDOS PLATOS.
                    case 4:
                        descuento = 0;

                        if(cantidadPlantos > 2)//si es mayor a dos platos se le resta 1 euro a cada plato, sin caumular descuentos.
                            descuento = cantidadPlantos;
                        
                        tipoSeleccion = PLATOS[3];
                        total2Plato += (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nPaella (6€) x" + cantidadPlantos;
                        break;
                    
                    case 5:
                        descuento = 0;

                        if(cantidadPlantos > 2)
                            descuento = cantidadPlantos;
                        
                        tipoSeleccion = PLATOS[4];
                        total2Plato += (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nSalmón (8€) x" + cantidadPlantos;
                        break;

                    case 6:
                        descuento = 0;

                        if(cantidadPlantos > 2)
                            descuento = cantidadPlantos;
                        
                        tipoSeleccion = PLATOS[5];
                        total2Plato += (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nCodillo al horno (9€) x" + cantidadPlantos;
                        break;
                
                    case 7:
                        descuento = 0;

                        if(cantidadPlantos > 2)
                            descuento = cantidadPlantos;
                        
                        tipoSeleccion = PLATOS[6];
                        total2Plato += (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nLentejas (5€) x" + cantidadPlantos;
                        break;

                    //POSTRES
                    case 8:
                        tipoSeleccion = PLATOS[7];
                        totalPostre += tipoSeleccion * cantidadPlantos;
                        strPostres += "\nFruta (1.50€) x" + cantidadPlantos;
                        break;

                    case 9:
                        tipoSeleccion = PLATOS[8];
                        totalPostre += tipoSeleccion * cantidadPlantos;
                        strPostres += "\nCafé (1.25€) x" + cantidadPlantos;
                        break;

                    case 10:
                        tipoSeleccion = PLATOS[9];
                        totalPostre += tipoSeleccion * cantidadPlantos;
                        strPostres += "\nHelado (2€) x" + cantidadPlantos;
                        break;
                }
            }
        }
        sc.close();
    }   
}
