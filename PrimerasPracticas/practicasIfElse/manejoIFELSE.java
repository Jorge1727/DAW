public class manejoIFELSE 
{
    public static void main(String[] args) 
    {
        double num = 22;

        if ((num >= -1) && (num <= 1) && (num != 0))
            System.out.println(num + " es casi 0");
        else if ((num >= -10) && (num <= 10))
            System.out.println(num + " no es casi 0");
        else 
            System.out.println("No esta en el rango");
    }    
}
