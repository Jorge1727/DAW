import java.util.Scanner;

public class PrimerEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Escribe el primer numero: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Escribe el segundo numero: ");
        int n2 = sc.nextInt();
        sc.close();

        int multiplicacion = (n1 * n2);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    }
}
