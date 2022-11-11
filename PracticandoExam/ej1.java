import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class ej1 
{
    public static void main(String[] args) 
    {
        System.out.println("En que fecha es el examen?\nDi el año");
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();
        System.out.println("di el mes");
        int month = sc.nextInt();
        System.out.println("di el dia");
        int day = sc.nextInt();
        System.out.println("di la hr");
        int hr = sc.nextInt();
        System.out.println("di los mtos");
        int mts = sc.nextInt();
        sc.close();

        DateTimeFormatter miFormat = DateTimeFormatter.ofPattern("'El examen será el 'EEEE', 'dd' de 'MMMM' del 'YYYY");
        LocalDateTime examDay = LocalDateTime.of(anio, month, day, hr, mts);

        int hrsToExam = (int)ChronoUnit.HOURS.between(LocalDateTime.now(), examDay);

        System.out.println(examDay.format(miFormat.withLocale(new Locale("es", "ES"))));
        System.out.println("Para el examen quedan " + hrsToExam + " horas.");
    }    
}
