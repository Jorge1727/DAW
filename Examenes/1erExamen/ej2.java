import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ej2 
{
    public static void main(String[] args) 
    {
        System.out.println("-----------FECHA ALEATORIA--------------");

        int year = (int)((Math.random() * 30) + 2000);
        int month = (int)(Math.ceil(Math.random() * 11));//porque si pongo 12 podria salir el 13, lo mismo para los dias, podria salir 32
        int day = (int)(Math.ceil(Math.random() * 30));

        DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("'Es el dia 'dd' de 'MMMM'('EEEE') de 'YYYY");

        if ((day >= 29) && (month == 2))//Para el problema que nos da el mes febrero si es mayor a 28 dias
            month += 1;

        LocalDate randomDate = LocalDate.of(year, month, day);

        LocalDate finAnio = LocalDate.of(year, 12, 31);
        int daysToFinAnio = (int)(ChronoUnit.DAYS.between(randomDate, finAnio));

        System.out.println(randomDate.format(miFormato.withLocale(new Locale("es", "ES"))));//Yo pongo witch local "es" porque tengo el vs en ingles :)
        System.out.println("Faltan " + daysToFinAnio + " para fin de año." );
    }
}
