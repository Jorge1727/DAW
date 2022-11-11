import java.util.Scanner;

public class CalcularFactura
{
    public static void main(String[] args) 
    {
        final float iva = 21;
        
        System.out.println("introduce la base de la factura");
        Scanner sc = new Scanner(System.in);
        float baseFactura = sc.nextFloat();
        sc.close();
        
        float resultadoFactura = baseFactura + (baseFactura / 100) * iva; 
        System.out.println("La factura con IVA seria de: " + resultadoFactura);
    }
}
