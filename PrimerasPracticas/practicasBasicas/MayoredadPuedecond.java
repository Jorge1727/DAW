import java.util.Scanner;

public class MayoredadPuedecond 
{
    public static void main(String[] args) 
    {
        System.out.println("introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        
        boolean mayorEdad = (edad >= 18);
        System.out.println("mayor de edad? " + mayorEdad);
        
        System.out.println("Tienes carnet de conducir? si = 1, otro num para no");
        int tieneCarnet = sc.nextInt();
        sc.close();
        boolean booleanTieneCarnet = (tieneCarnet == 1);
        boolean puedeConducir = mayorEdad && booleanTieneCarnet;
        //-------otra forma de poner los dos booleans de arriva---------
        //boolean puedeConducir = (edad >= 18) && (tieneCarnet == 1);
        System.out.println("Puede conducir? " + puedeConducir);
    }
}
