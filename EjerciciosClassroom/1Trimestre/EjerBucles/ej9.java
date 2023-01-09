import java.util.Scanner;

public class ej9 
{
    public static void main(String[] args) 
    {
        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        Scanner sc = new Scanner(System.in);

        Long numero = sc.nextLong();
        sc.close();
        int numeroDeDigitos = 1;
        
        while (numero > 10) 
        {
            numeroDeDigitos++;
            numero /= 10;
        }
        
        System.out.println(numero + " tiene " + numeroDeDigitos + " dígito/s.");
    }    
}
