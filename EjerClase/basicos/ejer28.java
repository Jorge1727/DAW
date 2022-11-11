import java.util.Scanner;

public class ejer28 
{
    public static void main(String[] args) 
    {
        String j1 = "El ganador es el ¡jugador 1!";
        String j2 = "El ganador es el ¡jugador 2!";
        String ganador = "";
        String error = "ERROR. introduce bien las palabras";

        //COMIENZO
        System.out.println("-----PIEDRA ,PAPEL o TIJERA-----\n-Turno jugador 1:");
        Scanner sc = new Scanner(System.in);
        String eleccion1 = sc.nextLine().toLowerCase();
        System.out.println("Turno jugador 2:");
        String eleccion2 = sc.nextLine().toLowerCase();
        sc.close();

        if(eleccion1.equals(eleccion2))
            System.out.println("---¡EMPATE!---");
        else
        {
            switch(eleccion1)
            {
                case "piedra":
                    if(eleccion2.equals("papel"))
                        ganador = j2;
                    else 
                    {
                        if(eleccion2.equals("tijera"))
                            ganador = j1;
                        else
                            ganador = error;
                    }
                    break;

                case "papel":
                    if(eleccion2.equals("piedra"))
                         ganador = j1;
                    else 
                    {
                        if(eleccion2.equals("tijera"))
                            ganador = j2;
                        else
                            ganador = error;
                    }
                    break;

                case "tijera":
                    if(eleccion2.equals("piedra"))
                        ganador = j2;
                    else 
                    {
                        if(eleccion2.equals("papel"))
                            ganador = j1;
                        else
                            ganador = error;
                    }
                    break;
                default:
                    ganador = error;
                    break;
            }

            System.out.println(ganador);
        }
    }    
}
