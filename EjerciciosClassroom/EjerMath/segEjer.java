import java.util.Scanner;

public class segEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Di el numero base");
        Scanner sc = new Scanner(System.in);
        int nBase = sc.nextInt();
        System.out.println("Di el numero exponente");
        int nExp = sc.nextInt();
        sc.close();

        System.out.println("El resultado es: " + Math.pow(nBase, nExp));
    }    
}
