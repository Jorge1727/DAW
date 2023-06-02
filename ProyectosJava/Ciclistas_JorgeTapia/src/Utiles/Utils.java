package Utiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import clases.Ciclista;
import clases.Equipo;

public class Utils 
{
    public static ArrayList<Ciclista> leerCiclistas()
    {
        String ruta ="src/recursos/Ciclistas.json";

		File ficheroCiclista = new File(ruta);
		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		// convert json string to object
		ArrayList<Ciclista> ciclistas = null;
		try 
        {
			ciclistas = objectMapper.readValue(ficheroCiclista, new TypeReference<ArrayList<Ciclista>>(){});

		} catch (Exception e) 
        {
			e.printStackTrace();
		}

		return ciclistas;
    }

    public static ArrayList<Equipo> leerEquipos()
    {
        ArrayList<Equipo> resultado = new ArrayList<>();

        String ruta="src/recursos/Equipos.csv";

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

    public static HashMap<Integer, Integer> leetEtapas(String numEtapa)
    {
        String ruta ="src/recursos/Etapa" + numEtapa + ".json";

		File ficheroEtapa = new File(ruta);

        ObjectMapper objectMapper = new ObjectMapper();

        HashMap<Integer, Integer> etapas = null;

        try 
        {
            etapas = objectMapper.readValue(ficheroEtapa, new TypeReference<HashMap<Integer, Integer>>() {});
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return etapas;
    }

}
