import java.util.Scanner;

public class cuartoEjer 
{
    public static void main(String[] args) 
    {
        final int EUROS_HORA = 12;
        final int EUROS_HORA_EXTRA = 16;

        System.out.println("Cuantas horas has trabajado");
        Scanner sc = new Scanner(System.in);
        int hrsTrabajadas = sc.nextInt();
        sc.close();

        int salarioNormal = EUROS_HORA * hrsTrabajadas;

        if (hrsTrabajadas <= 40 && hrsTrabajadas >= 0)
            System.out.println("El sueldo que te corresponde es de " + salarioNormal);
        else
        {
            int salarioConExtra = (40 * EUROS_HORA) + (hrsTrabajadas - 40) * EUROS_HORA_EXTRA;
            System.out.println("El sueldo que te corresponde es de " + salarioConExtra);
        }
    }    
}
