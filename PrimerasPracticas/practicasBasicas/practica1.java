import java.util.Scanner;

public class practica1 
{
    public static void main(String[] args)
    {
        String saludo = "Hola";
        byte num = 127;
        Scanner lector = new Scanner(System.in);
        
        System.out.println(num);

        num++;
        
        System.out.println("Al sumar uno mas al byte REINICIA AL -128");
        System.out.println(num);

        System.out.println(saludo + ", introduce tu nombre y pulsa enter");
        String nomUser = lector.nextLine();
        System.out.println("Hola, " + nomUser + ", ahora introduce tu edad");
        int ageUser = lector.nextInt();
        System.out.println(ageUser + " años");

        System.out.println("Ahora introduce tu nota media");
        float notaUser = lector.nextFloat();
        System.out.println("tu nota es de " + notaUser);
        lector.close();
    }
}
