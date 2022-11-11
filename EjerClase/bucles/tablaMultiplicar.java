import java.util.Scanner;

public class tablaMultiplicar 
{
    public static void main(String[] args) 
    {
        System.out.println("-------TABLA DE UN NUM-----------\nDi sobre que numero quieres la tabla");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i + " * " + num + " = " + (i * num));
        }

        System.out.println("------------X TABLAS------------");

        for(int tabla = 1; tabla <= 5; tabla++)
        {
            System.out.println("-----tabla del " + tabla + "-----");
            for(int i = 1; i <= 10; i++)
            {
                System.out.println(tabla + " * " + i + " = " + (i * tabla));
            }
        }
        System.out.println("hola otra vez");
    }    
}
