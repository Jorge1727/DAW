import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ej2 
{
    public static void main(String[] args) 
    {
        int year = (int)((Math.random() * 100) + 2000); //solo quise hacerlo hasta el 2100 y a partir del 2000
        int month = (int)(Math.ceil(Math.random() * 11));
        int day = (int)(Math.ceil(Math.random() * 30));

        DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("'Es el dia 'dd' de 'MMMM'('EEEE') de 'YYYY");

        if ((day >= 29) && (month == 2))//Para el problema que nos da el mes febrero si es mayor a 28 dias
            month += 1;

        LocalDate fechaAleatoria = LocalDate.of(year, month, day);
        
        System.out.println(fechaAleatoria.format(miFormato.withLocale(new Locale("es", "ES"))));
    }    
}
