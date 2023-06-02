import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import clases.Alumno;
import clases.Instituto;
import clases.Profesor;
import utiles.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===================== Instituto =========================");
        Instituto instituto = jsonUtils.leerProfesores();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/recursos/infoAlumnos.csv")))
        {
            ArrayList<Alumno> alumnos = instituto.todosLosAlumnos();

            bw.newLine();
            bw.write(alumnos.toString());
            
        } catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/recursos/AlumnosBeca.txt")))
        {
            String alumnosBeca = instituto.alumnosBeca();

            bw.write("**********Alumnos beca:\n");
            bw.newLine();
            bw.write(alumnosBeca);
            
        } catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
