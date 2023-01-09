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
                char cifrachr = (char)cifra;

                fraseLenght = frase.length();
                while(inicioPalabra < fraseLenght)
                {
                    if(signo == '+')
                    {
                        chr = frase.charAt(inicioPalabra);

                        if(chr == 32)
                            chr = (char)(cifrachr + 48);
                        else
                        {
                            chr += cifra;  
                            
                            if(chr > 90 && chr < 97)
                                chr = (char)(64 + cifra);
                            else
                            {
                                if(chr > 122)
                                    chr = (char)(96 + cifra);
                            }        
                        }
                        fraseFinal += chr;
                    }
                    else
                    {
                        chr = frase.charAt(inicioPalabra);

                        if(chr >= '0' && chr <= '9')
                            chr = 32;
                        else
                        {
                            chr -= cifra;
                            
                            if(chr < 65)
                                chr = (char)(91 - cifra);
                            else
                            {
                                if(chr < 97 && chr >  90)
                                    chr = (char)(123 - cifra);
                            }        
                        }
                        fraseFinal += chr;
                    }
                    inicioPalabra++;
                    
                }

                if(signo == '+')
                    System.out.println("Resultado de cifrado: " + cifra + fraseFinal + "\n////////////////////////////////");
                else   
                System.out.println("Resultado de decifrado: " + fraseFinal + "\n////////////////////////////////");
            }
        }
        sc.close();
    }    
}
