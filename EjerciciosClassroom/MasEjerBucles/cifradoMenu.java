import java.util.Scanner;

public class cifradoMenu 
{
    public static void main(String[] args) 
    {
        boolean salir = false;
        int select = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("------ PROGRAMA DE CIFRADO-------");

        while(salir == false)
        {
            String frase = "";
            int cifra = 0;
            String fraseFinal = "";
            int inicioPalabra = 0;
            char chr = 0;
            int fraseLenght = 0;
            char signo = 0;

            do
            {
            System.out.println("\t- 1: Cifrar.\n\t- 2: Descifrar.\n\t- 3: Salir.");
            select = sc.nextInt();
            sc.nextLine();

            if(select <= 0 || select >= 4)
                System.out.println("Error en la selección");
            } while(select <= 0 || select >= 4);
            
            switch(select)
            {
                case 1:
                    signo = '+';
                    break;

                case 2:
                    signo = '-';
                    break;
                    
                case 3:
                    salir = true;
            }

            if(select != 3)
            {
                System.out.print("Di la frase: ");
                frase = sc.nextLine();
                System.out.print("Di el factor: ");
                cifra = sc.nextInt();

                fraseLenght = frase.length();
                while(inicioPalabra < fraseLenght)
                {
                    if(signo == '+')
                    {
                        chr = frase.charAt(inicioPalabra);
                        chr += cifra;
                        fraseFinal += chr;
                    }
                    else
                    {
                        chr = frase.charAt(inicioPalabra);
                        chr -= cifra;
                        fraseFinal += chr;
                    }
                    inicioPalabra++;
                    
                }

                System.out.println("Resultado: " + fraseFinal + "\n////////////////////////////////");
            }
            sc.close();
        }
    }    
}
