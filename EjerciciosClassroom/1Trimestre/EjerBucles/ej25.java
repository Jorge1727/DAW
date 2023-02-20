import java.util.Scanner;

public class ej25 
{
    public static void main(String[] args) 
    {
        System.out.println("Di un numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int primerNum =  num;//para saber cual era el primer numero para el ult sout
        int vuelta = 0;

        while(num > 0)
        {
            vuelta = (vuelta * 10) + (num % 10);
            num /= 10;
        }

        System.out.println("Si a " + primerNum + " le damos la vuelta quedaria: " + vuelta);
    }   
}
