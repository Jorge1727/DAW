import java.util.Scanner;

public class ej32 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce un numero positivo: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();

        long vuelta = 0;
        long suma = 0;
        String paresStr = "";

        while(num >= 1)
        {
            vuelta = (vuelta * 10) + (num % 10);
            num /= 10;
        }
        
        System.out.print("\nDigitos pares: ");

        while(vuelta >= 1)
        {
            if((vuelta % 2) == 0)
            {
                //System.out.print(vuelta % 10 + " ");
                paresStr += (vuelta % 10) + " ";
                suma += (vuelta % 10);
            }
            vuelta /= 10;
        }
        System.out.println(paresStr);

        System.out.println("Suma de los digitos: " + suma);
    }    
}
