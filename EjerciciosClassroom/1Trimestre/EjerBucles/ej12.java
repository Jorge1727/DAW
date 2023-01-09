import java.util.Scanner;

public class ej12 
{
    public static void main(String[] args) 
    {
        long n1 = 0;
        long n2 = 1;
        long n3 = 0;

        System.out.println("di los terminos de fibo");
        Scanner sc = new Scanner(System.in);
        int terminos = sc.nextInt();
        sc.close();

        if(terminos == 1)
            System.out.println(n1);

        else if(terminos == 2)
                System.out.println(n1 + " " + n2);
            
            else
            {   
                System.out.print("0");

                terminos++;//porque sino me coge un termino menos
                while(terminos > 2)
                {
                    n3 = n1;
                    n1 = n2;
                    n2 = n3 + n2;
                    System.out.print(" " + n2);
                    terminos--;
                }
            }
        System.out.println("");
    }
}
