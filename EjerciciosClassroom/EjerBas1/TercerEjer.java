import java.util.Scanner;

public class TercerEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce las pesetas: ");
        Scanner sc = new Scanner(System.in);
        double pesetas = sc.nextDouble();
        sc.close();

        double euros = (pesetas * 0.006);
        System.out.println(euros + " euros son: " + pesetas + " pesetas");
    }
}
