import java.util.Scanner;

public class sextoEjer 
{
    public static void main(String[] args) 
    {
        /*
        String juan1 = "Juan";
        String pedro2 = "Pedro";
        String luis3 = "Luis";
        String mario4 = "Mario";

        String phrase = "“En la casa de " + juan1 + " estaban " + pedro2 + ", "+ luis3 +  "y " + mario4 +", todos jugando al Formite”";
        System.out.println(phrase + "\nQuien estaba en casa de Juan?");
        Scanner sc = new Scanner(System.in);
        String nameSearch = sc.next();
        sc.close();

        if(phrase.compareToIgnoreCase(nameSearch) == 0)
        {
            System.out.println("Si esta");
        }
            System.out.println("No esta");
        */

        String phrase = "“En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”";
        System.out.println(phrase + "\nQuien estaba en casa de Juan?");
        Scanner sc = new Scanner(System.in);
        String nameSearch = sc.next();
        sc.close();

        String phraseMin = phrase.toLowerCase();
        String nameSrchMin = nameSearch.toLowerCase();

        boolean estaba = (phraseMin.indexOf(nameSrchMin) >= 0);
        System.out.println((estaba) ? nameSearch + ", Si estaba" : nameSearch + ", No estaba");
    }    
}
