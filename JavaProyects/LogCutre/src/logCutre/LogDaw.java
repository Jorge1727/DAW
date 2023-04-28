package logCutre;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogDaw 
{
    private static String nombreFichero = "Log.txt";

    public enum Tipo {ERROR, INFORMACION};

    public static void nuevaEntradaLog(String mensaje, Tipo tipo)
    {
        //Aki ya no hace falta el finally
        //true para que no sobrescriba ni borrre los anteriores registros
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/" + nombreFichero, true))) 
        {
            String horaMensaje = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));
            
            String mensajeTotal = horaMensaje + " - " + tipo + " : " + mensaje;

            bufferedWriter.write(mensajeTotal);
            bufferedWriter.newLine();
            

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }
}
