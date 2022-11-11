import java.util.Scanner;

public class Calculadora 
{
    public static void main(String[] args)
    {
        
        System.out.println("Introduzca el primer numero");//Entonces voy a abrir un scanner
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Introduzca el segundo numero");
        float n2 = sc.nextFloat();
        sc.close();
        //Aqui cierro el scanner para que no haya leaks

        float resultadoSuma = n1 + n2; //o tambien puedo hacerlo directamente en el print

        System.out.println("La suma es: " + resultadoSuma);

        System.out.println("La resta es: " + (n1 - n2));

        System.out.println("La multiplicacion es: " + (n1 * n2));

        System.out.println("La division es: " + (n1 / n2));

        System.out.println("El modulo es: " + (n1 % n2));

        String cadenaResultado = "El resultado es: " +  resultadoSuma + '$';
        System.out.println(cadenaResultado);
    }
}
