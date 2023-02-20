import java.util.Scanner;

public class ej10 
{
    public static void main(String[] args) 
    {
        double numeros = 0;
        double numeroIntroducido = 0;
        double suma = 0;

        System.out.println("-----MEDIA DE NUMEROS------\nPara parar, introduce numero negativo. Di los numeros: ");
        Scanner sc = new Scanner(System.in);

        while (numeroIntroducido >= 0) 
        {
            numeroIntroducido = sc.nextDouble();
            numeros++;
            suma += numeroIntroducido;
        }
        sc.close();

        double media = ((suma - numeroIntroducido) / (numeros - 1));
        
        System.out.println("La media de los números positivos introducidos es: " + media);
    }    
}
