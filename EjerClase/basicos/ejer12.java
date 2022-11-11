import java.util.Scanner;

public class ejer12 
{
    public static void main(String[] args) 
    {
        System.out.println("-------NOTA DE UN CUESTIONARIO--------\n    -(Di S para si; di N para no / otra cosa sera tomada como no)");
        System.out.println("Ha acertado la 1 pragunta?");
        Scanner sc = new Scanner(System.in);
        String nota1 = sc.nextLine();
        System.out.println("Ha acertado la 2 pregunta");
        String nota2 = sc.nextLine();
        System.out.println("Ha acertado la 3 pregunta");
        String nota3 = sc.nextLine();
        System.out.println("Ha acertado la 4 pregunta");
        String nota4 = sc.nextLine();
        System.out.println("Ha acertado la 5 pregunta");
        String nota5 = sc.nextLine();
        sc.close();

        String si = "s";
        double nota = 0;

        int respuestasAcertadas = 0;
        int respuestasFalladas = 0;

        if (nota1.equals(si))
        {
            nota += 2;
            respuestasAcertadas++;
        }
        else
        {
            nota -= 0.5;
            respuestasFalladas++;
        }

        if (nota2.equals(si))
        {
            nota += 2;
            respuestasAcertadas++;
        }
        else
        {
            nota -= 0.5;
            respuestasFalladas++;
        }
        if (nota3.equals(si))
        {
            nota += 2;
            respuestasAcertadas++;
        }
        else
        {
            nota -= 0.5;
            respuestasFalladas++;
        }
        if (nota4.equals(si))
        {
            nota += 2;
            respuestasAcertadas++;
        }
        else
        {
            nota -= 0.5;
            respuestasFalladas++;
        }
        if (nota5.equals(si))
        {
            nota += 2;
            respuestasAcertadas++;
        }
        else
        {
            nota -= 0.5;
            respuestasFalladas++;
        }

        System.out.println("La nota seria: " + nota + " -Las preguntas acertadas: " + respuestasAcertadas + " -Las preguntas falladas: " + respuestasFalladas);
    }    
}
