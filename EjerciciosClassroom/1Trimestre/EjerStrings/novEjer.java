import java.util.Scanner;

public class novEjer 
{
    public static void main(String[] args) 
    {
        String phrase = "“En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”";
        System.out.println("quien mas estaba en la casa de juan?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        sc.close();

        int posicion = phrase.indexOf("y");

        StringBuffer sBuffer = new StringBuffer(phrase);
        sBuffer.insert(posicion-1, ", " + nombre);
        System.out.println(sBuffer);
        //o tambien pudimos haberlo echo, con split....
    }    
}
