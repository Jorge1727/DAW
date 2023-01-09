import java.util.Scanner;

public class octEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("ingresa un char");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);
        sc.close();

        int ASCII = Integer.valueOf(caracter);
        System.out.println(ASCII);

        boolean esDigito = ((ASCII >= 48) && (ASCII <= 57));
        System.out.println(esDigito ? ASCII + ", si" : ASCII + ", no");
    }   
}
