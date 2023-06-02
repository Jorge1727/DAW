package utiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import clases.Cliente;
import clases.Ferreteria;
import clases.Producto;
import clases.Venta;

public class Utils 
{
    public static ArrayList<Cliente> leerClientes() 
    {
        String ruta ="src/recursos/Clientes.json";

		File ficheroCiclista = new File(ruta);
		
        ObjectMapper objectMapper = new ObjectMapper();

        ArrayList<Cliente> clientes = null;
		try 
        {
			clientes = objectMapper.readValue(ficheroCiclista, new TypeReference<ArrayList<Cliente>>(){});

		} catch (Exception e) 
        {
			e.printStackTrace();
		}

		return clientes;
    }

    public static ArrayList<Producto> leerProductos()
    {
        ArrayList<Producto> resultado = new ArrayList<>();

        String ruta="src/recursos/productos.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(ruta))) 
        {
            String linea = br.readLine();
            linea = br.readLine();

            while (linea != null)
            {
                String[] atributos = linea.split(";");

                Integer cod = Integer.parseInt(atributos[0]);
                String nombre = atributos[1];
                String descrpcion = atributos[2];
                Double precio = Double.parseDouble(atributos[3]);
                Integer stock = Integer.parseInt(atributos[4]);


                resultado.add(new Producto(cod, nombre, descrpcion, precio, stock));
                linea = br.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
     
        return resultado;
    }

    public static ArrayList<Venta> leerVentas() 
    {
        String ruta ="src/recursos/Ventas.json";

		File ficheroCiclista = new File(ruta);
		
        ObjectMapper objectMapper = new ObjectMapper();
		
		ArrayList<Venta> ventas = null;
		try 
        {
			ventas = objectMapper.readValue(ficheroCiclista, new TypeReference<ArrayList<Venta>>(){});

		} catch (Exception e) 
        {
			e.printStackTrace();
		}

		return ventas;
    }

    public static ArrayList<String> facturacionClientes(Ferreteria ferreteria) 
    {
        ArrayList<String> reultado = new ArrayList<>();

        for (int i = 0; i < ferreteria.getClientes().size(); i++) 
        {
            int codCliente = ferreteria.getClientes().get(i).getCodigo();
            
            for (int j = 0; j < ferreteria.getVentas().size(); j++) 
            {
                if(ferreteria.getVentas().get(j).getCodigoCliente() == codCliente)
                {

                    reultado.add("Cliente: " + ferreteria.getClientes().get(i).getNombre() + " Cod Producto:"+ ferreteria.getVentas().get(j).getLineas());
                }
                    
            }
        }

        return reultado;
    }

    
    
}
