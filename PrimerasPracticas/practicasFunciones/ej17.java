import java.util.Scanner;

public class ej17 
{
    public static void main(String[] args) 
    {
        System.out.println("Di el numero binario:");
        Scanner sc = new Scanner(System.in);
        int binario = sc.nextInt();

        // while(binario != 1 || binario != 0)
        // {
        //     System.out.println("Error, los numeros binarios solo tienen los digitos 1 y 0.\nDi el numero binario:");
        //     binario = sc.nextInt();
        // }

        sc.close();
        
        int digitos = UtilesParaNumeros.digitos(binario) - 1;
        int binarioVolteado = UtilesParaNumeros.voltea(binario);
        int decimal = 0;

        while(digitos >= 0)
        {
            int queNum = UtilesParaNumeros.digitoN(digitos, binarioVolteado);

            if(queNum == 1)
            {
                decimal += UtilesParaNumeros.potencia(2, digitos);
            }
            digitos--;

        }

        System.out.println("El binario "+ binario + " a decimal es: " + decimal);
    }    
}
