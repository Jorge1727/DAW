import java.util.Scanner;

public class FrasePalindrama 
{
    public static void main(String[] args) 
    {
        boolean salir = false;
        String esPalindroma = "";

        System.out.println("Escribe la frase (escribe SALIR para salir)");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        
        while (salir == false)
        {
            frase = frase.replace(" ", "");
            int inicioPalabra = 0;
            int finPalabra = frase.length() - 1;

            while(inicioPalabra <= finPalabra)
            {
                char chrInicio = frase.charAt(inicioPalabra);
                char chrFin = frase.charAt(finPalabra);

                if(chrInicio != chrFin)
                {
                    esPalindroma = "NO";
                }
                inicioPalabra++;
                finPalabra--;

            }

            if(esPalindroma.equals(""))
                esPalindroma = "SI";

            System.out.println("La frase " + esPalindroma + " es palindroma");

            System.out.println("\nEscribe: ");
            frase = sc.nextLine();

            if(frase.equals("salir"))
                salir = true;
        }
        sc.close();
    }    
}
