public class ej15 
{
    public static void main(String[] args) 
    {
        int primo = 0;

        while(primo < 997)
        {
            primo = UtilesParaNumeros.siguientePrimo(primo);
            System.out.println(primo);
        }
    }    
}
