import java.util.Scanner;

public class SextoDosEjer 
{
    public static void main(String[] args) 
    {
        final double precioManzana = 2.35; //kg
        final double precioPera = 1.95; //kg
        final double precioProve = 0.6; //kg

        System.out.println("Kg de manzanas vendidas");
        Scanner sc = new Scanner(System.in);
        double kgManVendida = sc.nextDouble();
        System.out.println("Kg de peras vendidas");
        double kgPeraVendida = sc.nextDouble();

        //INGRESOS MyP
        double ingresoManz = kgManVendida * precioManzana;
        double ingresoPera = kgPeraVendida * precioPera;
        
        //GASTOS
        System.out.println("Factura de la luz del mes: ");
        double gastoLuz = sc.nextDouble();
        sc.close();
        double gastoProve = (kgManVendida + kgPeraVendida) * precioProve;

        //RESULTADOS
        double ingresos = ingresoManz + ingresoPera;
        double gastos = gastoLuz + gastoProve;
        double beneficio = ingresos - gastos;

        System.out.println("Total:\n\tIngresos: " + ingresos + "€\n\tGastos: " + gastos + "€\n\tBeneficio: " + beneficio + "€");
    }
}
