import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class ManejodedeFechas {

    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaHoraActual = LocalDateTime.now();    
        Instant instante = Instant.now();

        System.out.println("Fecha ahora: " + fechaActual);
        System.out.println("Hora ahora: " + horaActual);
        System.out.println("Fecha/hora ahora: " + fechaHoraActual);
        System.out.println("Instante: " + instante);

        System.out.println("--------------------------------------------------------------");

    //Crear Fecha - off
        LocalDate fechaCumple = LocalDate.of(2004, 03, 11);
        LocalTime horaExamen = LocalTime.of(12, 45);
        LocalDateTime concierto = LocalDateTime.of(2022, 12, 15, 20, 30);

        System.out.println("Fecha cumple: " + fechaCumple);
        System.out.println("Hora examen: " + horaExamen);
        System.out.println("Concierto: " + concierto);

        System.out.println("--------------------------------------------------------------");

    //Coger partes de una fecha
        System.out.println("Dia concierto: " + concierto.getDayOfMonth());
        System.out.println("Hora concierto: " + concierto.getHour());

        System.out.println("--------------------------------------------------------------");

    //Añadir/quitar tiempo - plus/minus
        System.out.println("En dos semanas: " + fechaActual.plusWeeks(2));
        System.out.println( "Hora actual: " + fechaHoraActual);
        System.out.println("Hacer 12 horas: " + fechaHoraActual.plusHours(12));

        System.out.println("--------------------------------------------------------------");

    //Ajustes temporales
        System.out.println("Primer dia del mes: " + fechaActual.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println("--------------------------------------------------------------");

    //Dar formato a una fecha
        DateTimeFormatter formatoMio = DateTimeFormatter.ofPattern("dd/MM/yyyy 'dia' EEEE");
        System.out.println("Fecha con formato: " + fechaActual.format(formatoMio));
        System.out.println("Fecha con formato Inglés: " + fechaActual.format(formatoMio.withLocale(new Locale("en", "UK"))));

        System.out.println("--------------------------------------------------------------");

    //Diferncia entre fechas Period/ChronoUnit
        System.out.println("Tengo la edad de: " + ChronoUnit.YEARS.between(fechaCumple, LocalDate.now()));

        int diasVividos = (int) ChronoUnit.DAYS.between(fechaCumple, fechaActual);
        System.out.println("Días vividos: " + diasVividos);

        LocalDate finAno = LocalDate.of(2022, 12, 31);
        Period hastaFinAno = fechaActual.until(finAno);
        System.out.println("Hasta fin de año queda: " + hastaFinAno);
        System.out.println("Quedan " + hastaFinAno.getMonths() + " meses y " + hastaFinAno.getDays() + " días");

        System.out.println("--------------------------------------------------------------");

    //
    }
}
