import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import logCutre.LogDaw;
import logCutre.LogDaw.Tipo;

public class App {
    public static void main(String[] args) throws Exception 
    {
        FileReader fr = null;


        System.out.println("*****************\nLeo con buffer reader");

        BufferedReader bf = null;

        try 
        {
            fr = new FileReader("src/recursos/fichero1.txt");
            bf = new BufferedReader(fr);

            //ESTO ES EQUIVALENTE
            //bf = new BufferedReader(new FileReader("src/recursos/fichero1.txt"));
        
            String linea = bf.readLine();

            while(linea != null)
            {
                LogDaw.nuevaEntradaLog("Se ha escrito: " + linea, LogDaw.Tipo.INFORMACION);
                System.out.println(linea);
                linea = bf.readLine();
            }

        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(bf != null)
            {
                bf.close();
            }
        }


        System.out.println("******************\nLeo con Scanner");

        String numeros = "10 34 6 20";
        Scanner sc = new Scanner(numeros);

        int sumaTotal = 0;

        while(sc.hasNextInt())
        {
            try 
            {
                int numeroNuevo = sc.nextInt();
                sumaTotal += numeroNuevo;
                
            } catch (Exception e) 
            {
                // TODO: handle exception
            }
        }

        System.out.println("Suma total = " + sumaTotal);
        sc.close();

        //UTILIZANDO STRING

        System.out.println("Con string seria:");
        sumaTotal = 0;
        String[] trozos = numeros.split(" ");

        for (int i = 0; i < trozos.length; i++) 
        {
            try 
            {
    
                int numero = Integer.valueOf(trozos[i]);
                sumaTotal += numero;
                
            } catch (NumberFormatException numberFormatException) 
            {
                System.out.println(numberFormatException.getMessage());
            }
        }

        System.out.println("Suma total = " + sumaTotal);
        sc.close();
    }
}
