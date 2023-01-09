import java.util.Scanner;

public class septEjer
{
    public static void main(String[] args) 
    {
        System.out.println("Di un caracter");
        Scanner sc = new Scanner(System.in);
        char caracter = sc.nextLine().charAt(0);
        sc.close();

        System.out.println("Es digito?: " + Character.isDigit(caracter));
        System.out.println("Es espacio?: " + Character.isSpaceChar(caracter));
        System.out.println("Es mayuscula?: " + Character.isUpperCase(caracter));
    }    
}
