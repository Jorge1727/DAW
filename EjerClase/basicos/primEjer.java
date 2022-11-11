import java.util.Scanner;

public class primEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("que dia de la semana es");
        Scanner sc =new Scanner(System.in);
        String diaSC = sc.next();
        diaSC = diaSC.toLowerCase();
        sc.close();

        switch (diaSC)
        {
            case "lunes":
                System.out.println("programacion");
                break;
            case "martes":
                System.out.println("lengua");
                break;
            case "miercoles":
                System.out.println("mates");
                break;
            case "jueves":
                System.out.println("fyq");
                break;
            case "viernes":
                System.out.println("biologia");
                break;
            default:
                System.out.println("error");
        }
    }    
}
