import java.util.Scanner;

public class onceEjer 
{
    public static void main(String[] args) 
    {
        String str = "lo que sea";

        System.out.println("Di un digito de 0 a 9.\n(si pones mas de uno solo se te escogera el primero)\n");
        Scanner sc = new Scanner(System.in);
        char digit = sc.next().charAt(0);
        sc.close();

        int dASCII = (int)digit; 
        if(dASCII >= 48 && dASCII <= 57)
        {
            int numDigit = Character.getNumericValue(digit);//antes lo tenia con el ascii menos 48.
            System.out.println(str.charAt(numDigit));

            char chrStr = str.charAt(numDigit);
            if(Character.isSpaceChar(chrStr))
                System.out.println("-ESPACIO-");
        }
        else
            System.out.println(digit + " no es un digito.");
                
        /*
        boolean esDigit = Character.isDigit(digit));
        int digitoLeido = Character.getNumericValue(digit);
        int logitudstr = str.length();
        booleaan estaDentro = logitudstr > digitoleido;
        char caracterLeido = (esDigito && estaDentro) ? str.charAt(digit) : 
        
        System.out.println();
            (........No copiado........)
        if (Character.isSpaceChar(digit))
        System.out.println("-ESPACIO-");
        */
    }    
}
