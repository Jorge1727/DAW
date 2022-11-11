import java.util.Scanner;

public class numeroSecreto 
{
    public static void main(String[] args) 
    {
        int partidasGanadas = 0;
        int partidasRendidas = 0;
        int totalPartidas = 0;
        int intentos = 0;
        String jugarOtraVez = "si";

        Scanner sc =new Scanner(System.in);
        
        while(jugarOtraVez.equals("si"))
        {
            int random = (int)(Math.random() * 100);

            System.out.println("Adivina el numero, del 1 al 100, para rendirte, -1");
            int num = sc.nextInt();

            while(num != random && num != -1)
            {
                if(num >= 1 && num < 100)
                {
                    if(num > random)
                    System.out.println("el numero a adivinar es menor al dicho");
                    else if(num < random)
                        {
                            System.out.println("el numero a adivinar es mayor al dicho");
                        }
                    num = sc.nextInt();
                    intentos = intentos + 1;
                }
                else 
                    System.out.println("el numero no esta en el rango 1-100");
            }
            sc.nextLine();

            if(num == random)
            {
                System.out.println("has acertado, el numero era: " + random +", Lo has intentado: " + intentos + " veces.");
                partidasGanadas = partidasGanadas + 1;
            }
            else if(num == -1)
            {
                System.out.println("Te has rendido, el num era: " + random);
                partidasRendidas = partidasRendidas + 1;
            }

            totalPartidas = partidasGanadas + partidasRendidas;
            
            System.out.println("Quieres jugar otra vez? (si, otra cosa sera no)");
            jugarOtraVez = sc.nextLine(); 
        }
        sc.close();

        System.out.println("Las partidas totales han sido: " + totalPartidas + "\nLas ganadas: "+ partidasGanadas + " y las rendidas: " + partidasRendidas);
    }
}
