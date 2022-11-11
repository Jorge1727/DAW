import java.util.Scanner;

public class CuarEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("En que año naciste?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        int edadAhora = 2022 - edad;
        System.out.println("tu edad a 1 de enero es de " + edadAhora);

        System.out.println("Di a que año quieres ir");
        int yearToGo = sc.nextInt();
        sc.close();

        int edadDespues = (yearToGo - 2022) + edadAhora;
        System.out.println("tu edad en el año " + yearToGo + " sera de " + edadDespues + " años");
    }
}
