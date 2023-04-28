import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Alumno.Alumno;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        BufferedReader bf = null;

        try 
        {
            // fr = new FileReader("src/recursos/fichero1.txt");
            // bf = new BufferedReader(fr);

            bf = new BufferedReader(new FileReader("src/recursos/TablaDeAlumnos.txt"));
        
            String linea = bf.readLine();
            
            while(linea != null)
            {
                linea = bf.readLine();

                String[] trozos = linea.split("\t");


                String sexo = "";
                int edad = 0;
                double estatura = 0;
                int cal1 = 0;
                int cal2 = 0;
                String calificacion = "";

                for (int i = 0; i < trozos.length; i++) 
                {
                    try 
                    {
                        if(i == 0)
                            sexo = String.valueOf(trozos[i]);

                        if(i == 1)
                            edad = Integer.valueOf(trozos[i].trim());

                        if(i == 2)
                            estatura = Double.valueOf(trozos[i].replace(',', '.'));    

                        if(i == 3)
                            cal1 = Integer.valueOf(trozos[i].trim());    

                        if(i == 4)
                            cal2 = Integer.valueOf(trozos[i].trim());    

                        if(i == 5)
                            calificacion = String.valueOf(trozos[i]);                
                        
                    } catch (NumberFormatException numberFormatException) 
                    {
                        System.out.println(numberFormatException.getMessage());
                    }
                }

                Alumno alumno = new Alumno(sexo, edad, estatura, cal1, cal2, calificacion);
                alumnos.add(alumno);
            }
            


        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(bf != null)
            {
                System.out.println(alumnos);

                ordenaPorEdad(alumnos);
                mediaEdades(alumnos);

                bf.close();
            }
        }


        
    }

    static void ordenaPorEdad(ArrayList<Alumno> alumnos)
    {
        Collections.sort(alumnos);

        System.out.println(alumnos);
    }

    static void mediaEdades(ArrayList<Alumno> alumnos)
    {
        int totalEdades = 0;

        for (int i = 0; i < alumnos.size(); i++) 
        {
            int edad = alumnos.get(i).getEdad();    
            totalEdades += edad;
        }

        int resultado = totalEdades / alumnos.size();

        System.out.println("La media de edad es: " + resultado + " años");
    }

}
