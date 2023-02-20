import java.util.Scanner;

public class segEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Nombre del atacanate: ");
        Scanner sc = new Scanner(System.in);
        String nameAtack = sc.next();
        System.out.println("Nombre del defensor: ");
        String nameDef = sc.next();
        System.out.println("Que porcentaje de acierto tiene de 2?");
        int porcAciDos = sc.nextInt();
        System.out.println("Que porcentaje de acierto tiene de 3?");
        int porcAciTres = sc.nextInt();
        System.out.println("El defensa cuantas veces hace que falle el atacante de 0 a 10");
        int eficaciaDef = sc.nextInt();
        System.out.println("--Tira el atacante. De 2 o de 3?");
        int tiroDelAtack = sc.nextInt();
        sc.close();

        if (tiroDelAtack == 2)
        {
            Double ataque = (Math.random() * porcAciDos);
            Double defensa = (Math.random() * (eficaciaDef * 10));
            if(ataque > defensa)
                System.out.println("El jugador " + nameAtack + " ha encestado de 2 sobre el jugador " + nameDef + "(" + ataque + " > " + defensa + ")");
            else
                System.out.println("El jugador " + nameAtack + " NO ha encestado de 2 sobre el jugador " + nameDef + "(" + ataque + " < " + defensa + ")");
        }
        else
        {
            if (tiroDelAtack == 3)
            {
                Double ataque = (Math.random() * porcAciTres);
                Double defensa = (Math.random() * (eficaciaDef * 10));
                if(ataque > defensa)
                    System.out.println("El jugador " + nameAtack + " ha encestado de 3 sobre el jugador " + nameDef + "(" + ataque + " > " + defensa + ")");
                else
                    System.out.println("El jugador " + nameAtack + " NO ha encestado de 3 sobre el jugador " + nameDef + "(" + ataque + " < " + defensa + ")");
            }
            else
                System.out.println("No vale el tiro");
        }
    }    
}
