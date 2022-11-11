import java.util.Scanner;

public class ejer28v2 
{
    public static void main(String[] args) 
    {
        //VARIABLES
        String j1 = "\nEl ganador es el ¡jugador 1!";
        String machine = "\nEl ganador es el ¡oredandor!";
        String ganador = "";
        String error = "ERROR. introduce bien las palabras";
        String eleccionMachineStr = "";
        int eleccionNum = 0;

        //COMIENZO
        System.out.println("-----PIEDRA ,PAPEL o TIJERA-----\n-Turno jugador 1:");
        Scanner sc = new Scanner(System.in);
        String eleccion = sc.nextLine().toLowerCase();
        sc.close();

        switch(eleccion)
        {
            case "piedra":
                    eleccionNum = 1;
                    break;

                case "papel":
                    eleccionNum = 2;
                    break;

                case "tijera":
                    eleccionNum = 3;
                    break;
                default:
                    ganador = error;
                    break;
        }

        int eleccionMachine = (int)(Math.ceil(Math.random() * 3));

        switch(eleccionMachine)
        {
            case 1:
                eleccionMachineStr = "-PC: piedra";
                break;
            case 2:
                eleccionMachineStr = "-PC: papel";
                break;
            case 3:
                eleccionMachineStr = "-PC: tijera";
                break;
        }

        System.out.println(eleccionMachineStr);

        if(eleccionNum == eleccionMachine)
            System.out.println("\n---¡EMPATE!---");
        else
        {
            switch(eleccionNum)
            {
                case 1:
                    if(eleccionMachine == 2)
                        ganador = machine;
                    else 
                    {
                        if(eleccionMachine == 3)
                            ganador = j1;
                        else
                            ganador = error;
                    }
                    break;

                case 2:
                    if(eleccionMachine == 1)
                         ganador = j1;
                    else 
                    {
                        if(eleccionMachine == 3)
                            ganador = machine;
                        else
                            ganador = error;
                    }
                    break;

                case 3:
                    if(eleccionMachine == 1)
                        ganador = machine;
                    else 
                    {
                        if(eleccionMachine == 2)
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
