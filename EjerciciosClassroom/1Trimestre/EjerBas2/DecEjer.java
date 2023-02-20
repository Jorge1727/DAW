import java.util.Scanner;

public class DecEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Cuantas hrs has trabajado?");
        Scanner sc = new Scanner(System.in);
        int hrsTrabajadas = sc.nextInt();
        sc.close();

        int salarioSemanal = hrsTrabajadas * 12;

        System.out.println("Tu salario esta semana es de: " + salarioSemanal);
    }
}
