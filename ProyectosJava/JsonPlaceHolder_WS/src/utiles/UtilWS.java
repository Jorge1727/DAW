package utiles;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.lang.model.element.ModuleElement.UsesDirective;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Usuario;

public class UtilWS 
{
    //Conectarnos a una url y traer la informacion
    
    public static List<Usuario> leeUsuariosFromWS()
    {
        List<Usuario> listaUsuarios = new ArrayList<>();

        //trycatch que lee de un servcicio web
        try 
        {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
        
            URLConnection connection = url.openConnection();

            //connection.addRequestProperty(null, null);
            //para las propiedades de la requesta pero no la necesitamos

            InputStream stream = new BufferedInputStream(connection.getInputStream());//esto da flujo de datos, esto lo leia caracter a caracter, asi que lo envolvemos en buffer

            ObjectMapper mapper = new ObjectMapper();

            listaUsuarios = mapper.readValue(stream, new TypeReference<List<Usuario>>() {});
        
        } catch (Exception e) {
            // TODO: handle exception
        }

        return listaUsuarios;
    }



    public static Usuario leeUsuarioFromWS(int codigo)
    {
        Usuario usuario = null;

        //trycatch que lee de un servcicio web
        try 
        {
            URL url = new URL("https://jsonplaceholder.typicode.com/users/" + codigo);
        
            URLConnection connection = url.openConnection();

            //connection.addRequestProperty(null, null);
            //para las propiedades de la requesta pero no la necesitamos

            InputStream stream = new BufferedInputStream(connection.getInputStream());//esto da flujo de datos, esto lo leia caracter a caracter, asi que lo envolvemos en buffer

            ObjectMapper mapper = new ObjectMapper();

            usuario = mapper.readValue(stream, Usuario.class);
        
        } catch (Exception e) {
            // TODO: handle exception
        }

        return usuario;
    }
}
