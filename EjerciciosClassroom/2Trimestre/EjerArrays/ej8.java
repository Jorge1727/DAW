package EjerArrays;

import java.util.Scanner;

public class ej8 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        double[] temperaturas = new double[12];

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        //pregunta temperatura
        rellenaTemperatura(temperaturas, meses);

        //pinta temperatura
        pintaMeses(meses, temperaturas);
    }    
    
    static void rellenaTemperatura(double[] temperaturas, String[] meses)
    {
        for(int i = 0; i < temperaturas.length; i++)
        {
            double temp = pedirTemperaturas(meses[i]);
            temperaturas[i] = temp;
        }
    }

    static double pedirTemperaturas(String mes)
    {
        System.out.println("Dime la temp media del mes " + mes);

        double temp = sc.nextDouble();

        return temp;
    }

    static void pintaMeses(String[] meses, double[] temperatura)
    {
        for(int i = 0; i < meses.length; i++)
        {
            System.out.print(meses[i] + " (" + temperatura[i] + ")\t\t");

            double temp = temperatura[i];

            for(int j = 0; j < temp; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
