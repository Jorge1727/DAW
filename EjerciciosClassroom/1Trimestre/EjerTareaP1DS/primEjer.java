import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class primEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Que fecha es el examen?\nDi el dia");
        Scanner sc = new Scanner(System.in);
        int diaEx = sc.nextInt();
        System.out.println("Di el mes");
        int mesEx = sc.nextInt();
        System.out.println("Di el año");
        int anioEx = sc.nextInt();
        System.out.println("Di la hora");
        int hrEx = sc.nextInt();
        System.out.println("Di los minutos");
        int mtsEx = sc.nextInt();
        sc.close();

        DateTimeFormatter miFormato =  DateTimeFormatter.ofPattern("EEEE', 'dd' de 'MMMM' del 'YYYY");
        LocalDateTime fechaEx = LocalDateTime.of(anioEx, mesEx, diaEx, hrEx, mtsEx);
        System.out.println(fechaEx.format(miFormato.withLocale(new Locale("es", "ES"))));
        System.out.println("Quedan: " + ChronoUnit.HOURS.between(LocalDateTime.now(), fechaEx) + " horas");
    }
}
