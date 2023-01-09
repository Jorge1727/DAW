import java.util.Scanner;

public class ej3 
{
    public static void main(String[] args) 
    {
        int operacion = 0;
        String operacionStr = "";
        String comoEsResultado = "";

        int numAleatorio1 = (int)(Math.ceil(Math.random() * 99));
        int numAleatorio2 = (int)(Math.ceil(Math.random() * 99));
        int numAleatorioOperacion = (int)(Math.random() * 3);
        
        
        switch(numAleatorioOperacion)
        {
            case 0:
                operacion = numAleatorio1 + numAleatorio2;
                operacionStr = "suma";
                break;
            case 1:
                operacion = numAleatorio1 - numAleatorio2;
                operacionStr = "resta";
                break;
            case 2:
                operacion = numAleatorio1 * numAleatorio2;
                operacionStr = "multiplicacion";
                break;
            default:
                System.out.println("error");
                break;
        }

        System.out.println("El primer num aleatorio es " + numAleatorio1 + " y el segundo " + numAleatorio2 + ", haz " + operacionStr);

        System.out.println("Di un resultado");
        Scanner sc = new Scanner(System.in);
        int resultadoUser = sc.nextInt();
        sc.close();

        if(resultadoUser == operacion)
            comoEsResultado = "correcto";
        else
            comoEsResultado = "incorrecto";

        System.out.println("El resultado es " + comoEsResultado);
    }    
}
