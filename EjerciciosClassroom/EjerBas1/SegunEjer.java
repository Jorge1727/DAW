import java.util.Scanner;

public class SegunEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce los euros: ");
        Scanner sc = new Scanner(System.in);
        float euros = sc.nextFloat();
        sc.close();

        float pesetas = (euros * 16639) / 100;
        System.out.println(euros + " euros son: " + pesetas + " pesetas");
    }
}
