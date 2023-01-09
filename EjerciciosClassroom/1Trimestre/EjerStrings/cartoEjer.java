import java.util.Scanner;

public class cartoEjer 
{
    /*Dado un texto, reemplazar el carácter indicado por el usuario por otro 
    caracter también indicado por el usuario.*/
    public static void main(String[] args) 
    {
        String phrase = "Listos para ir a la galaxia?";

        System.out.println("Que letra quieres cambiar de esta frase:\n" + phrase);
        
        Scanner sc = new Scanner(System.in);
        char chr = sc.nextLine().charAt(0);
        System.out.println("Por cual la quieres cambiar?");
        char chrChange = sc.nextLine().charAt(0);
        sc.close();

        String chrmodif = phrase.replace(chr, chrChange);
        System.out.println(chrmodif);

    }    
}
