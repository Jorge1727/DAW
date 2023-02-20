import java.util.Scanner;

public class ClaseEjer 
{
    public static void main(String[] args) 
    {
        //ejercicio para hacer CASTING!! cambio de int a char 
        System.out.println("Di un numero");
        Scanner sc = new Scanner(System.in);
        int numOne = sc.nextInt();
        System.out.println("Di  num 2");
        int numTwo = sc.nextInt();
        System.out.println("Pon un char");
        char chr = sc.next().charAt(0);
        sc.close();

        int resultSuma = numOne + numTwo;
        String cadMostradas = (char)numOne + "-" + (char)numTwo;//le meto ints de la tabla ascii
        

        System.out.println((chr == 's') ? resultSuma : cadMostradas);
    }    
}
