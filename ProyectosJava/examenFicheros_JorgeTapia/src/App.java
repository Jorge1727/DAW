import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import clases.Cliente;
import clases.Ferreteria;
import recursos.ComparadorNombres;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Ferreteria ferreteria = new Ferreteria();
        
        System.out.println("Se han añadido los resultados en la ruta: src/recursos/__.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/recursos/FacturacionClientes.txt")))
        {
            bw.write("\n******* Todos los clientes:\n");
            bw.newLine();


            for (int i = 0; i < ferreteria.getClientes().size(); i++) 
            {
                ComparadorNombres comparadorNombres = new ComparadorNombres();
                Collections.sort(ferreteria.getClientes(), comparadorNombres);

                Cliente clienteActual = ferreteria.getClientes().get(i);
                
                ArrayList<Cliente> listaSinEseCliente = new ArrayList<>(ferreteria.getClientes());
                int posicionEncontrada = Collections.binarySearch(ferreteria.getClientes(), new Cliente(clienteActual.getNombre()), comparadorNombres);

                listaSinEseCliente.remove(ferreteria.getClientes().get(posicionEncontrada));
                boolean repite = false;

                for (int j = 0; j < listaSinEseCliente.size(); j++) 
                {
                    if(clienteActual.getNombre().equals(listaSinEseCliente.get(j).getNombre()))
                    {
                        repite = true;
                    }
                }

                if(repite == true)
                {
                    bw.write("Error, cliente repetido");
                }
                else 
                {
                    bw.write(clienteActual.toString());
                }

            }


            ArrayList<String> facturacionClientes = utiles.Utils.facturacionClientes(ferreteria);

            bw.newLine();
            bw.write("\n******* facturacion clientes:\n");
            bw.newLine();
            bw.write(facturacionClientes.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/recursos/ProductosVendidos.txt")))
        {
            bw.newLine();
            bw.write("\n******* Listado de Productos:\n");
            bw.newLine();
            bw.write(ferreteria.getProductos().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
