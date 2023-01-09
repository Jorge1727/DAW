import java.util.Scanner;

public class primEjer 
{
    //Lee de teclado un texto y devuelve por pantalla la cantidad de caracteres tiene dicho texto.
    public static void main(String[] args) 
    {
        System.out.println("Escribe algo");
        Scanner sc = new Scanner(System.in);
        String scan = sc.next();
        sc.close();
        
        int cantChars = scan.length();

        System.out.println("la cantidad de caracteres son:" + cantChars);
    }    
}
