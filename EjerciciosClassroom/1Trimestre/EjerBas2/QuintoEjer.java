import java.util.Scanner;

public class QuintoEjer
{
    public static void main(String[] args) 
    {
        System.out.println("introduce el primer num decimal");
        Scanner sc = new Scanner(System.in);
        double primDecimal = sc.nextDouble();
        
        System.out.println("introduce el segundo num decimal");
        double segDecimal = sc.nextDouble();
        sc.close();
        double multDecimal = primDecimal * segDecimal;

        System.out.println("la multiplicacion de los decimales son: " + multDecimal);
    }
}
