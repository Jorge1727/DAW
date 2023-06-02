import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.Employee;
import modelo.People;
import modelo.Persona;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        //Leer Json que contiene 1 objeto y convertirlo en objeto 
        jsonUtils.LeerEmpleadoFromJsonFile("JsonJacksonExample/src/recursos/employee.txt");

        System.out.println("==============================================");



        //Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto> 
        List<Employee> listaEmpleados = jsonUtils.LeerListEmpleadoFromJsonFile("JsonJacksonExample/src/recursos/employeeArray.txt");
        System.out.println("====== ARRAY EMPLEADOS ========================");

        for (Employee employee : listaEmpleados) {
            System.out.println(employee);
        }

        System.out.println("==============================================");

        //Convertir objeto a Json
        jsonUtils.convertToJson();

        People people = jsonUtils.leerFicheroPersonas();

        for (Persona persona : people.getPeople()) 
        {
            System.out.println(persona);    
        }

        
        System.out.println("Cogemos las personas con 24 años.");
        ArrayList<Persona> personasCon24 = new ArrayList<>();
        
        for (Persona persona : people.getPeople()) 
        {
            if(persona.getAge().equals(24))
            {
                personasCon24.add(persona);
            }    
        }
        
        People persona2 = new People();

        persona2.setPeople(personasCon24);
        
        for (Persona persona : persona2.getPeople()) 
        {
            System.out.println(persona);    
        }

        jsonUtils.crearFicheroPersonas(persona2);

        jsonUtils.leerFicheroPersonas2();

// Lo comento porque ya lo he hecho
        // System.out.println("Ejer3\n======================hashmap===============");
        // HashMap<String, Persona> diccionarioPersonas = new HashMap<>();

        // diccionarioPersonas.put("12345678P", people.getPeople().get(0));
        // diccionarioPersonas.put("98765432W", people.getPeople().get(1));
        // diccionarioPersonas.put("55555555L", people.getPeople().get(2));

        // jsonUtils.crearFicheroDiccionario(diccionarioPersonas);

        //HashMap<String, Persona> diccionarioPersonas = jsonUtils.leerDiccionarioPersona();

        

    }
}
