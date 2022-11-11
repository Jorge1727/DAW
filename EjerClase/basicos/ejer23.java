import java.util.Scanner;

public class ejer23 
{
    public static void main(String[] args) 
    {
        final double IVA_GENERAL = 21;
        final double IVA_REDUCIDO = 10;
        final double IVA_SUPERREDUCIDO = 4;

        //variables
        double ivaElegido = 0;
        double precioConIVA = 0;
        double importeDeIVA = 0;
        double descuento = 0;
        double total = 0;

        System.out.println("--------PRECIO FINAL--------\nIntroduce base imponible:");
        Scanner sc = new Scanner(System.in);
        double imponible = sc.nextDouble();
        //LIMIAPMOS BUFFER
        sc.nextLine();

        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
        String tipoIVA = sc.nextLine().toLowerCase();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
        String codProm = sc.nextLine().toLowerCase();
        sc.close();

        switch(tipoIVA)
        {
            case "general":
                ivaElegido = IVA_GENERAL;
                break;
            case "reducido":
                ivaElegido = IVA_REDUCIDO;
                break;
            case "superreducido":
                ivaElegido = IVA_SUPERREDUCIDO;
                break;
        }

        importeDeIVA = imponible * (ivaElegido / 100.0);
        precioConIVA = imponible + importeDeIVA;

        switch(codProm)
        {
            case "mitad":
                descuento = precioConIVA / 2.0;
                break;
            case "meno5":
                descuento = 5.0;
                break;
            case "5porc":
                descuento = precioConIVA * 0.05;
                break;
        }

        total = precioConIVA - descuento;

        System.out.println("Base imponible:\t\t" + imponible + "\nIVA (" + ivaElegido + "%):\t\t" + importeDeIVA);
        System.out.println("Precio con IVA:\t\t" + precioConIVA + "\nCod. promo. (" + codProm + "):\t-" + descuento);
        System.out.println("TOTAL:\t\t\t" + total);
    }    
}
