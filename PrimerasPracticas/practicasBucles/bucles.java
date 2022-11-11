import java.util.Scanner;

public class bucles 
{
    public static void main(String[] args) 
    {
        System.out.println("-----while---------");
        int num = 5;

        while(num > 0)
        {
            //conjunto de instrucciones
            System.out.println("hola");

            //actualizacion de la condicion
            num--;
        }

        System.out.println("------for--------");
        //se inicia el contador, despues una condicion(while,mientras), actualizo contaddor)


        //escribe 10 veces hola
        int longitud = 20;

        for(int i = 0; i < longitud; i+=2)
        {
            System.out.println("holaaa -> " + i);
        }

        //media de 10 num

        System.out.println("-----MEDIA---");
        Scanner sc = new Scanner(System.in);
        
        int media = 0;
        int suma = 0;
        int contador = 10;

        for(int i = 0; i < contador; i++)
        {
            System.out.println("dime num");
            int numero = sc.nextInt();
            suma += numero;
        }
        sc.close();
        
        media = suma / (contador-1);

        System.out.println("media: " + media);

    }    
}
