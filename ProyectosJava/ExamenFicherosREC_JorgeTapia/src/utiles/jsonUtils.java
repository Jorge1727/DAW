package utiles;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import clases.Instituto;
import clases.Profesor;

public class jsonUtils 
{
    public static Instituto leerProfesores()
    {
        String ruta ="src/recursos/instituto.json";
        
		File ficheroInstituto = new File(ruta);
		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		// convert json string to object
		Instituto profesores = null;
		try 
        {
			profesores = objectMapper.readValue(ficheroInstituto, Instituto.class);
            
		} catch (Exception e) 
        {
			e.printStackTrace();
		}

		return profesores;
    }
}
