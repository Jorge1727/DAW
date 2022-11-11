import java.util.Scanner;

public class nota 
{
    public static void main(String[] args) 
    {
        System.out.println("di tu nota");//
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();
        sc.close();

        String notaStr = "";

        if (nota == 10)
            notaStr = "Matricula";
        else if ((nota >= 9) && (nota < 10))
            notaStr = "Sobresaliente";
        else if ((nota >= 7) && (nota < 9))
            notaStr = "Notable";
        else if ((nota >= 5) && (nota < 7))
            notaStr = "Aprobado";
        else if ((nota >= 0) && (nota < 5))
            notaStr = "Suspenso";
        else
        {
            notaStr = "Nota no valida";
        }
        System.out.println(notaStr);
    }    
}
