import java.util.Scanner;

public class ej18 
{
    public static void main(String[] args) 
    {
        System.out.println("Di el numero decimal:");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        sc.close();

        int decimalDeSC = decimal;
        int aux = 0;
        int binario = 0;

        while(decimal > 0)
        {
            int potencia = 1;
            int multi= 1;

            while(potencia <= decimal)
            {
                potencia = UtilesParaNumeros.potencia(2, aux);
                aux++;
            }
            aux -= 2;
            int exponente = aux;

            while(aux > 0)
            {
                multi *= 10;
                aux--;
            }

            binario += multi;

            decimal -= UtilesParaNumeros.potencia(2, exponente);
        }
        System.out.println("El decimal "+ decimalDeSC + " a binario es: " + binario);
        
    }    
}
