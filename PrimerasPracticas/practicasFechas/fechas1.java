import java.util.Scanner;

public class fechas1 
{
    public static void main(String[] args) 
    {
        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;

        boolean cerraProg = false;
        String str1Platos = "**Primeros platos";
        String str2Platos = "**Segundos platos";
        String strPostres = "**Postres";
        String strdescuentoFinal = "";
        double tipoSeleccion = 0;
        double total1Plato = 0;
        double total2Plato = 0;
        double totalPostre = 0;
        int descuento = 0;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        while(cerraProg == false)
        {
            System.out.println(" *** RESTAURANTE VEGA DE MIJAS ****");
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

            if(seleccion == 0)
            {
                cerraProg = true;
                total += total1Plato + total2Plato + totalPostre;

                if (total >= 20 && total <= 30)
                {
                    total -= 2;
                    strdescuentoFinal = "(con 2€ de descuento final)";
                }
                else
                { 
                    if(total >= 30 && total <= 50)
                    {
                        total -= 3;
                        strdescuentoFinal = "(con 3€ de descuento final)";
                    }
                    else
                    { 
                        if(total >= 50)
                        {
                            total -= 5;
                            strdescuentoFinal = "(con 5€ de descuento final)";
                        }
                    }
                }
                System.out.println("----------------\n" + str1Platos);
                System.out.println(str2Platos);
                System.out.println(strPostres);
                System.out.println("----------------\nTOTAL A PAGAR: " + total + "€ " + strdescuentoFinal + "\n----------------");
            }
                
            else
            {
                System.out.println("¿Cuantos platos?");
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
                        tipoSeleccion = PLATO1;
                        total1Plato += tipoSeleccion * cantidadPlantos;
                        str1Platos += "\nSalmorejo (5€) x" + cantidadPlantos;
                        break;

                    case 2:
                        tipoSeleccion = PLATO2;
                        total1Plato += tipoSeleccion * cantidadPlantos;
                        str1Platos += "\nSopa picadillo (4€) x" + cantidadPlantos;
                        break;

                    case 3:
                        tipoSeleccion = PLATO3;
                        total1Plato += tipoSeleccion * cantidadPlantos;
                        str1Platos += "\nEnsalada de atún (4.5€) x" + cantidadPlantos;
                        break;

                    //SEGUNDOS PLATOS
                    case 4:
                        descuento = 0;

                        if(cantidadPlantos >= 2)//si es mayor o igual a dos platos se le resta 1 euro a cada plato, sin caumular descuentos.
                            descuento = cantidadPlantos;
                        
                        tipoSeleccion += PLATO4;
                        total2Plato = (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nPaella (6€) x" + cantidadPlantos;
                        break;

                    case 5:
                        descuento = 0;

                        if(cantidadPlantos >= 2)
                            descuento = cantidadPlantos;

                        tipoSeleccion = PLATO5;
                        total2Plato += (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nSalmón (8€) x" + cantidadPlantos;
                        break;

                    case 6:
                        descuento = 0;

                        if(cantidadPlantos >= 2)
                            descuento = cantidadPlantos;
                        
                        tipoSeleccion = PLATO6;
                        total2Plato += (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nCodillo al horno (9€) x" + cantidadPlantos;
                        break;
                    
                    case 7:
                        descuento = 0;

                        if(cantidadPlantos >= 2)
                            descuento = cantidadPlantos;
                        
                        tipoSeleccion = PLATO7;
                        total2Plato += (tipoSeleccion * cantidadPlantos) - descuento;
                        str2Platos += "\nLentejas (5€) x" + cantidadPlantos;
                        break;

                    //POSTRES
                    case 8:
                        tipoSeleccion = PLATO8;
                        totalPostre += tipoSeleccion * cantidadPlantos;
                        strPostres += "\nFruta (1.50€) x" + cantidadPlantos;
                        break;

                    case 9:
                        tipoSeleccion = PLATO9;
                        totalPostre += tipoSeleccion * cantidadPlantos;
                        strPostres += "\nCafé (1.25€) x" + cantidadPlantos;
                        break;

                    case 10:
                        tipoSeleccion = PLATO10;
                        totalPostre += tipoSeleccion * cantidadPlantos;
                        strPostres += "\nHelado (2€) x" + cantidadPlantos;
                        break;
                }
                
            }

        }
        sc.close();
    }    
}
