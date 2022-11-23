import java.util.Scanner;

public class cifrado 
{
    public static void main(String[] args) 
    {
        System.out.print("Di la frase que quieres cifrar: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        System.out.print("Ahora el numero de cifrado: ");
        int cifra = sc.nextInt();

        String fraseFinal = "";
        int fraseLenght = frase.length();
        int inicioPalabra = 0;
        char chr = 0;

        while(inicioPalabra < fraseLenght)
        {
            chr = frase.charAt(inicioPalabra);
            chr += cifra;
            fraseFinal += chr;
            
            inicioPalabra++;
        }
        sc.close();

        System.out.println("\n" + cifra + fraseFinal);
    }    
}
