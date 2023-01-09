import java.util.Scanner;

public class OnceEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce la nota del primer examen");
        Scanner sc = new Scanner(System.in);
        double primNota = sc.nextDouble();
        System.out.println("Que nota quieres sacar en el trimestre?");
        double notaMedia = sc.nextDouble();
        sc.close();

        double segNota = (notaMedia - (primNota * 0.4)) / 0.6;

        System.out.println("La nota que debes sacar en el segundo examen es: " + segNota);
    }    
}
