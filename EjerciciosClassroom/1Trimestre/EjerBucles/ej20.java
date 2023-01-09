import java.util.Scanner;

public class ej20 
{
    public static void main(String[] args) 
    {
        System.out.print("-----PIRAMIDE HUECA------\nIntroduce la altura: ");
        Scanner sc = new Scanner(System.in);
        int alturaIntroducida = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el caracter: ");
        String caracter = sc.nextLine();
        sc.close();
        
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;
        int ultFila = (alturaIntroducida * 2) - 1;
        
        while (planta < alturaIntroducida) 
        {
            //espacios
            for (int i = 1; i <= espacios; i++) 
                System.out.print(" ");

            //pinta la linea con el caracter
            for (int i = 1; i <= longitudDeLinea; i++)
            {
                if((i >= 2) && (i <= (longitudDeLinea - 1)))
                    System.out.print(" ");
                else
                    System.out.print(caracter);
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }

        if(planta == alturaIntroducida)
        {
            for(int i = 1; i <= ultFila; i++)
                System.out.print(caracter);
        }
        System.out.println();
    }    
}
