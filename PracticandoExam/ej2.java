import java.util.Scanner;

public class ej2 
{
    public static void main(String[] args) 
    {
        System.out.println("-------BALONCESTO--------\nDi el nombre del primer jugador");
        Scanner sc = new Scanner(System.in);
        String atack = sc.nextLine();
        System.out.println("Di el nombre del defensa");
        String defender = sc.nextLine();
        System.out.println("Que porcentaje de acierto tiene el atacantee de 2?");
        int porcDeDos = sc.nextInt();
        System.out.println("Que porcentaje de acierto tiene el atacante de 3?");
        int porcDeTres = sc.nextInt();
        System.out.println("Cuantas veces de 10 hace que falle el atacante el defensor?");
        int defFalleAtack = sc.nextInt();
        System.out.println("Como decide tirar de 2 o de 3");
        int comoTira = sc.nextInt();
        sc.close();

        if(comoTira == 2)
        {
            double PorcAtack = (Math.random() * porcDeDos);
            double PorcDefen = (Math.random() * (defFalleAtack * 10));
            
            if(PorcAtack > PorcDefen)
            {
                System.out.println("El jugador " + atack + " a encestado de 2 sobre el jugador " + defender + ". (" + PorcAtack + " > " + PorcDefen + ")");                
            }
            else
                System.out.println("El jugador " + atack + " NO a encestado de 2 sobre el jugador " + defender + ". (" + PorcAtack + " < " + PorcDefen + ")");
        }
        else
        {
            if(comoTira == 3)
            {
                double PorcAtack = (Math.random() * porcDeTres);
                double PorcDefen = (Math.random() * (defFalleAtack * 10));
                
                if(PorcAtack > PorcDefen)
                {
                    System.out.println("El jugador " + atack + " a encestado de 3 sobre el jugador " + defender + ". (" + PorcAtack + " > " + PorcDefen + ")");                
                }
                else
                    System.out.println("El jugador " + atack + " NO a encestado de 3 sobre el jugador " + defender + ". (" + PorcAtack + " < " + PorcDefen + ")");
            }
            else
                System.out.println("ERROR, di si de 2 o de 3");
        }
    }    
}
