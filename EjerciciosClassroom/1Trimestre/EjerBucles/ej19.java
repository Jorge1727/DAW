import java.util.Scanner;

public class ej19 
{
    public static void main(String[] args) 
    {
        System.out.print("-----PIRAMIDE------\nIntroduce la altura: ");
        Scanner sc = new Scanner(System.in);
        int alturaIntroducida = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el caracter: ");
        String caracter = sc.nextLine();
        sc.close();
        
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;
        
        while (planta <= alturaIntroducida) 
        {
            //espacios
            for (int i = 1; i <= espacios; i++)
                System.out.print(" ");

            //pinta la linea con el caracter
            for (int i = 1; i <= longitudDeLinea; i++) 
                System.out.print(caracter);

            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }    
}
