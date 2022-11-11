//-------hacerrrr-----------

import java.util.Scanner;

public class ejer26 
{
    public static void main(String[] args) 
    {
        final double PRECIO_BASE = 8.0;
        final double PORC_TARJETA = 10.0;

        double precioFinal = 0;
        double descuentoPorTarjeta = 0;
       

        System.out.println("Venta de entradas CineCampa\n-Cuantas entradas?:");
        Scanner sc = new Scanner(System.in);
        double numEntradas = sc.nextDouble();
        sc.nextLine();

        System.out.println("Que dia de la semana es?");
        String diaSemana = sc.nextLine();

        System.out.println("Tienes la tarjeta CineCampa?");
        String tieneTarjeta = sc.nextLine().toLowerCase();
        sc.close();

        switch (diaSemana)
        {
            case "miercoles":
                precioFinal = PRECIO_BASE - 3;
                break;
            case "jueves":
                precioFinal = PRECIO_BASE + 3;

                double modulo = (numEntradas % 2);
                if(numEntradas == 1)
                {
                    precioFinal = PRECIO_BASE;
                }
                else
                {
                    if (modulo == 0)
                        precioFinal = (numEntradas / 2) * precioFinal;
                    else
                    {
                        precioFinal = ((numEntradas / 2) * precioFinal) + PRECIO_BASE;
                    }
                    
                }
                break;
            default:
                precioFinal = PRECIO_BASE;
        }

        if (tieneTarjeta.equals("s"))
        {
            descuentoPorTarjeta = precioFinal * (PORC_TARJETA / 100);
            precioFinal = precioFinal - descuentoPorTarjeta;
        }

        System.out.println(precioFinal);
    }    
}
