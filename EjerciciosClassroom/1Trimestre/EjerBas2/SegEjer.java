import java.util.Scanner;

public class SegEjer {
    public static void main(String[] args) 
    {
        System.out.println("Introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        sc.close();

        int edadSiguiente = edad + 1;
        System.out.println("Tu edad el año que viene sera: " + edadSiguiente); 
    }
}
