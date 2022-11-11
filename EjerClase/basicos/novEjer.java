import java.util.Scanner;

public class novEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Ecuacion 2 grado\nIntroduce a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Introduce b");
        int b = sc.nextInt();
        System.out.println("Introduce c");
        int c = sc.nextInt();
        double loDeRaiz = ((b * b) - 4 * a  * c);
        sc.close();

        double ecuacion1;
        double ecuacion2;

        if((loDeRaiz <= 0) || (a == 0))
            System.out.println("error");
        else
        {
            ecuacion1 = ((-b + (Math.sqrt(loDeRaiz))) / (2 * a));
            ecuacion2 = ((-b - (Math.sqrt(loDeRaiz))) / (2 * a));

            System.out.println("El primer resultado seria: " + ecuacion1 + "\nEl segundo resultado seria: " + ecuacion2);
        }
    }    
}
