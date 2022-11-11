import java.util.Scanner;

public class Datos_personales 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce tu nombre");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("introduce tu edad");
        int age = sc.nextInt();

        System.out.println("introduce tu altura");
        float altura = sc.nextFloat();
        sc.close();
        
        int segVividos = age * 31561000;

        System.out.println("Tu nombre es " + name + "\nHas vivido " + segVividos + " segundos\nMides " + altura + "cm");
    }
}
