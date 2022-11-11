import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ejer22 
{
    public static void main(String[] args) 
    {
        System.out.println("-----FECHA ALEATORIA-----");
        int year = (int)((Math.random() * 999) + 2000);//Solo quiero años desde el 2000 al 2999
        int month = (int)(Math.ceil(Math.random() * 11));
        int day = (int)(Math.ceil(Math.random() * 30));

        if((day >= 29) && (month == 2))
            month++;
        
        DateTimeFormatter miFormat = DateTimeFormatter.ofPattern("'\"Es el dia 'dd' de 'MMMM' ('EEEE') de 'YYYY\"");
        LocalDate randomDate = LocalDate.of(year, month, day);
        System.out.println(randomDate.format(miFormat.withLocale(new Locale("es", "ES"))));

        LocalDate finAnio = LocalDate.of(year, 12, 31);
        int diasParaFinAnio = (int)(ChronoUnit.DAYS.between(randomDate, finAnio));
        System.out.println("Para el 31/12 del " + year + ", faltan " + diasParaFinAnio + " dias");
    }    
}
