import java.util.Scanner;

public class ej7 
{
    public static void main(String[] args) 
    {
        int trys = 0;
        final int PASS = 4654;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        
        while((trys != 4) && (num != PASS))
        {
            System.out.println("Introduce la contraseña");
 
            num = sc.nextInt();

            if(num != PASS)
            {
                System.out.println("Contraseña incorrecta, intentalo de nuevo");
                trys++;
            }
        }
        sc.close();

        if(trys == 4)
            System.out.println("Has agotado los intentos.");
        else if(num == PASS)
            System.out.println("Bienvenido!!");
    }    
}
