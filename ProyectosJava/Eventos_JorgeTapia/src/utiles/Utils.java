package utiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import clases.Evento;

public class Utils 
{
    public static ArrayList<Evento> leerAgendaJson()
    {
        String ruta ="src/recursos/206974-0-agenda-eventos-culturales-100.json";

		File ficheroAgenda = new File(ruta);
		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		// convert json string to object
		ArrayList<Evento> agenda = null;
		try 
        {
			agenda = objectMapper.readValue(ficheroAgenda, new TypeReference<ArrayList<Evento>>(){});

		} catch (Exception e) 
        {
			e.printStackTrace();
		}

		return agenda;
    }

    public static ArrayList<Evento> leerAgendaCsv()
    {
        ArrayList<Evento> resultado = new ArrayList<>();

        String ruta="src/recursos/206974-0-agenda-eventos-culturales-100.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(ruta))) 
        {
            String linea = br.readLine();
            linea = br.readLine();

            while (linea != null)
            {
                String[] atributos = linea.split(",");

                String cod = atributos[0];
                String nombre = atributos[1];
                String nacionalidad = atributos[2];
                Integer presupuesto = Integer.parseInt(atributos[3]);

                resultado.add(new Equipo(cod, nombre, nacionalidad, presupuesto));
                linea = br.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
     
        return resultado;
    }

    
}
