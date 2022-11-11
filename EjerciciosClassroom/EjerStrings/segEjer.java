import java.util.Scanner;

public class segEjer 
{
    /*Leer de teclado un texto y un número y buscar que letra está en dicha posición. 
    Controlar que la posición no sobrepase la longitud del texto introducido*/
    public static void main(String[] args) 
    {
        System.out.println("Escribe algo");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println("Di numero para ir a la posicion");
        int posicion = sc.nextInt();
        sc.close();

        System.out.println("La letra que se encuentra en la posicion " + posicion 
                                + " es la " + str.charAt(posicion));

    }    
}
