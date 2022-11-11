import java.util.Scanner;

public class ej1 
{
    public static void main(String[] args) 
    {
        String str = "“Crearía un perfume que no sólo fuera humano, sino sobrehumano. Un aroma de ángel, tan indescriptiblemente bueno y pletórico de vigor que quien lo oliera quedaría hechizado y no tendría más remedio que amar a la persona que lo llevara, o sea, amarle a él, Grenouille, con todo su corazón”";
        
        int lengthStr = str.length();
        int rndmNum = (int)(Math.random() * lengthStr);
        char chrRndm = str.charAt(rndmNum);

        System.out.println((chrRndm == ' ') ? "ESPACIO" : "El char aleatorio es " + chrRndm);

        System.out.println("\nDi un caracter");
        Scanner sc = new Scanner(System.in);
        char chrsc = sc.nextLine().charAt(0);
        
        
        String strModifChr = str.replace('a', chrsc);
        System.out.println("La sustitucion de la a por elcaracter elegido quedaria asi: " + strModifChr);

        System.out.println("\nDi una palabra");
        String palabraSC = sc.next();
        palabraSC = palabraSC.toLowerCase();
        str = str.toLowerCase();
        sc.close();

        int posPalabraSC = str.indexOf(palabraSC);
        
        System.out.println(((posPalabraSC >= 0) ? palabraSC + " Si esta" : palabraSC + " No esta"));
    }    
}
