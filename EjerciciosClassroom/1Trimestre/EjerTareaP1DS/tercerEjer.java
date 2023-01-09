import java.util.Scanner;

public class tercerEjer 
{
    public static void main(String[] args) 
    {
        String str = "Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo. (Cien años de soledad. G. García Márquez).";
        
        //Libro
        int posicionParentesis = str.indexOf('(');
        int finalLibro = str.indexOf(')');
        String libro = str.substring(posicionParentesis + 1, finalLibro);
        System.out.println("Libro: " + libro);

        //Random char
        int longitud = str.length();
        int numRandomChr = (int)(Math.random() * longitud);
        char chrRandom = str.charAt(numRandomChr);
        System.out.println("El caracter en la posicion " + numRandomChr + " es: " + chrRandom);

        //Random palabra
        String[] troceo = str.split(" ");
        int cantTrozos = troceo.length;
        int numRandomPal = (int)(Math.random() * cantTrozos);
        String palabraRandom = troceo[numRandomPal];
        System.out.println("La palabra en la posicion " + numRandomPal + " es: " + palabraRandom);

        //Nombre Coronel
        System.out.println("Como se llama el coronel?");
        Scanner sc = new Scanner(System.in);
        String nameSC = sc.next();
        sc.close();
        int inicioPosCoronel = str.indexOf("Aureliano");
        int finPosicionCoronel = str.indexOf("había");
        String nameCoronel = str.substring(inicioPosCoronel, finPosicionCoronel);
        String coronelToLowerCase = nameCoronel.toLowerCase();
        String nameSCToLowercase = nameSC.toLowerCase();
        int esName = coronelToLowerCase.indexOf(nameSCToLowercase);
        System.out.println((esName >= 0) ? nameSCToLowercase + " Si es su nombre." : nameSCToLowercase + " No es su nombre.");
    }    
}
