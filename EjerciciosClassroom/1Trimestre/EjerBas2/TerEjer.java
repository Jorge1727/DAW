import java.util.Scanner;

public class TerEjer {
    public static void main(String[] args) 
    {
        System.out.println("En que año naciste?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        sc.close();

        int edadAhora = 2022 - edad;
        System.out.println("tu edad a 1 de enero es de " + edadAhora);
    }
}
