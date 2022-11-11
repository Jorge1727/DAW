import java.util.Scanner;

public class ejer21 
{
    public static void main(String[] args) 
    {
        System.out.println("------NOTA DE PROGRAMACION--------\nDi tu primera nota");
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        System.out.println("Di tu segunda nota");
        double nota2 = sc.nextDouble();

        double media = ((nota1 + nota2) / 2);

        if (media >= 5)
        {
            System.out.println("Tu nota de programacion es de : " + media);
        }
        else
        {
            System.out.println("Cual ha sido tu calificacion de recuperacion (apto/no apto (cualquier otra cosa sera tomada como no apto))");
            String aptNoapt = sc.next();
            aptNoapt = aptNoapt.toLowerCase();
            sc.close();

            if(aptNoapt.equals("apto"))
            {
                System.out.println("Tu nota de programacion es un 5");
            }
            else
                System.out.println("Tu nota de programacion es de un 4.5");
        }
    }    
}
