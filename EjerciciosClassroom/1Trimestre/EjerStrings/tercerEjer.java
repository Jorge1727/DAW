import java.util.Scanner;

public class tercerEjer 
{
    /*Partir un texto introducido por el usuario por la posición que tambien introduzca el usuario.
    Mostrar las 2 partes de la cadena: “Parte izquierda xxxxx y parte derecha xxxxx”*/
    public static void main(String[] args) 
    {
        System.out.println("Introduce un texto");
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        System.out.println("Di desde que posicion quieres partir el txt (menor al txt)");
        int pos = sc.nextInt();
        sc.close();

        String cadenaPart1 = txt.substring(0, pos);
        String cadenaPart2 = txt.substring(pos);

        System.out.println("La primera parte es: " + cadenaPart1 + "\nY la seguna es: " + cadenaPart2);
    }    
}
