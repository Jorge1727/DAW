import java.util.Scanner;

public class ejer11 
{
    public static void main(String[] args) 
    {
        String str = "“Crearía un perfume que no sólo fuera humano, sino sobrehumano. Un aroma de ángel, tan indescriptiblemente bueno y pletórico de vigor que quien lo oliera quedaría hechizado y no tendría más remedio que amar a la persona que lo llevara, o sea, amarle a él, Grenouille, con todo su corazón”";
        
        System.out.println("---------Random char-------------");
        int length = str.length();
        int randomNumber = (int)(Math.random() * length);
        char randomChar = str.charAt(randomNumber);
        System.out.println((randomChar == ' ') ? "ESPACIO" : "El caracter random es: "+ randomChar);

        System.out.println("\n----------Replace-----------\nDi un caracter");
        Scanner sc = new Scanner(System.in);
        char chrToReplace = sc.nextLine().charAt(0);
        String strModif = str.replace('a', chrToReplace);
        System.out.println("El str sustituyendo la 'a' por el caracter seleccionado quedaria: " + strModif);

        System.out.println("\n----------Search----------\nDi una palabra");
        String word = sc.nextLine();
        word = word.toLowerCase();
        sc.close();
        int posWord = str.indexOf(word);
        System.out.println((posWord >= 0) ? "La palabra " + word + " SI esta en el str" : "La palabra " + word + " NO esta en el str.");
    }    
}
