import java.util.Scanner;

public class ej26 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        System.out.println("Introduce un digito");
        int position = sc.nextInt();
        sc.close();

        int positionFinal = 1;
        long vuelta = 0;
        String posicionesStr = "";

        while(num > 0)
        {
            vuelta = (vuelta * 10) + (num % 10);
            num /= 10;
        }

        System.out.print("El numero " + position + " se repite en las posiciones: ");

        while(vuelta >= 10)
        {
            if((vuelta % 10) == position)
                //System.out.print(positionFinal + " ");
                posicionesStr += positionFinal + " ";

            vuelta /= 10;
            positionFinal++;
        }
        System.out.println(posicionesStr);
    }    
}
