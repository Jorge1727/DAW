import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SumaNumeros 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = null;
        BufferedReader bf = null;

        try 
        {
            fr = new FileReader("src/recursos/numeros.txt");
            bf = new BufferedReader(fr);

            //ESTO ES EQUIVALENTE
            //bf = new BufferedReader(new FileReader("src/recursos/fichero1.txt"));
        
            String linea = bf.readLine();

            while(linea != null)
            {

                if(!linea.isEmpty())
                {
                    System.out.println(linea);
                    
                    Scanner sc = new Scanner(linea);
                    
                    int sumaTotal = 0;
                    
                    while(sc.hasNextInt())
                    {
                        try 
                        {
                            int numeroNuevo = sc.nextInt();
                            sumaTotal += numeroNuevo;
                            
                        } catch (NumberFormatException numberFormatException) 
                        {
                            System.out.println(numberFormatException.getMessage());
                        }
                    }
    
                    System.out.println("Suma total = " + sumaTotal);
                    sc.close();
    
                    linea = bf.readLine();
                }
                else 
                {
                    System.out.println("La linea esta VACIA");    
                    linea = bf.readLine();
                }

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
    }    
}
