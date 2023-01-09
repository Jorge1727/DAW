import java.util.Scanner;

public class ej4 
{
    public static void main(String[] args) 
    {
        String medioElegido = "";
        float costeViaje = 0;
        float precioPersona = 0;
        float descuento = 0;
        int hayError = 0;
        String equipajeStr ="";

        System.out.println("Elige el medio");
        Scanner sc = new Scanner(System.in);
        String medio = sc.nextLine().toLowerCase();

        System.out.println("Cuantas personas vais?");
        int personas = sc.nextInt();
        sc.nextLine();

        if(personas >=2 && personas <=4)
        {
            switch(medio)
            {
                case "coche":
                    medioElegido = "coche";
                    break;
                case "avion":
                    medioElegido = "avion";
                    costeViaje = 95 * personas;
                    precioPersona = 95;
                    break;
                case "tren":
                    medioElegido = "tren";
                    costeViaje = 80 * personas;
                    break;
                default:
                    System.out.println("error, introduce bien el medio");
                    hayError++;
                    break;
            }

            switch(medioElegido)
            {
                case "coche":
                    costeViaje = (550 * 14) / 100;
                    precioPersona = costeViaje / personas;
                    break;
                case "avion":
                    System.out.println("llevas equipaje?");
                    String equipaje = sc.nextLine().toLowerCase();

                    if(equipaje.equals("si"))
                    {
                        equipajeStr = "si";
                        costeViaje = costeViaje + 20;
                        precioPersona = costeViaje / personas;
                    }
                    else
                    {
                        equipajeStr = "no";
                        precioPersona = costeViaje / 4;
                    }
                    break;
                case "tren":
                    if(personas == 4)
                    {
                        descuento = costeViaje * (25 / 100f);
                        costeViaje = costeViaje - descuento;
                        precioPersona = costeViaje / personas;
                    }
                    else 
                    {
                        if(personas == 3)
                        {
                            descuento = costeViaje * (10 / 100f);
                            costeViaje = costeViaje - descuento;
                            precioPersona = costeViaje / personas;
                        }
                        else
                            precioPersona = costeViaje / personas;
                    }
                    break;
            }
        }
        else
        {
            System.out.println("error, numero de personas incorrecto solo de 2 a 4");
            hayError++;
        }
        sc.close();

        if(hayError == 0)
        {
        System.out.println("Vais a viajar " + personas + " personas\nViajais en: " + medioElegido);
        System.out.println("Precio por persona: " + precioPersona);
        System.out.println("(tren) Descuento: -" + descuento);
        System.out.println("(avion) añade equipaje por 20e mas? " + equipajeStr);
        }
        else
            System.out.println("repite el programa");
    }    
}
