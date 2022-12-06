import java.util.Scanner;

public class Ejercicio3_JorgeTapia 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean cerrarProg = false;
        String frase = "";
        String fraseCompleta = "";
        int totalPalabras = 0;
        int aparece = 0;
        String fraseInvertida = "";
        

        while(cerrarProg == false)
        {
            System.out.println("\nA - Introducir una cadena de caracteres");
            System.out.println("B - Mostrar la cadena actual");
            System.out.println("C - ¿Que cadena quieres buscar?");
            System.out.println("D - Recorrer cada una de la palabras de la cadena principal en orden inverso y devolver por cada palabra: Su posición + la palabra + longitud la palabra.");
            System.out.println("E - Invertir las palabras de la cadena principal utilizando un bucle.");
            System.out.println("F - Salir");

            String eleccion = sc.nextLine().toLowerCase();

            //CONTROL DE ERRORES
            while(!eleccion.equals("a") && !eleccion.equals("b") && !eleccion.equals("c") && !eleccion.equals("d") && !eleccion.equals("e") && !eleccion.equals("f"))
            {
                System.out.println("Opcion incorrecta, elije de la A a la F");
                eleccion = sc.nextLine().toLowerCase();
            }

            switch(eleccion)
            {
                case "a":
                    System.out.println("Di la frase:");
                    frase = sc.nextLine();

                    if(frase.length() == 0)//He controlado todos los errores posibles en los apartados.
                        System.out.println("No ha introducido ninguna frase");
                    else 
                        fraseCompleta = frase;
                    break;

                case "b":
                    if(fraseCompleta.equals(""))
                        System.out.println("No hay registro de frases anteriores.");
                    else
                        System.out.println("La frase actualmente sería: " + fraseCompleta);

                    break;

                case "c":
                    if(fraseCompleta.equals(""))
                        System.out.println("No hay registro de frases anteriores. 0 numero de palabras.");
                    else
                    {
                        String fraseCompletaTLC = fraseCompleta.toLowerCase();//para no afectar a la original
                        aparece = 0;//Reseteo de valores

                        System.out.println("¿Que cadena quieres buscar?");
                        frase = sc.nextLine().toLowerCase();
                        int lengthFrase = frase.length();

                        String[] palabras = fraseCompletaTLC.split(frase);
                        totalPalabras = palabras.length - 1;//-1 porque la ultima no cuenta

                        System.out.println("La cadena "+ frase + " aparece "+ totalPalabras + " veces");
                        for(int i = 0; i < totalPalabras; i++)
                        {
                            aparece += palabras[i].length();
                            System.out.println("Aparece en la posicion " + aparece);
                            aparece += lengthFrase;//para controlar la diferencia de la longitud de la frase a buscar
                        }
                    }
                    break;
                
                case "d":
                    if(fraseCompleta.equals(""))
                        System.out.println("No hay registro de frases anteriores.");
                    else 
                    {
                        String[] palabras = fraseCompleta.split(" ");
                        totalPalabras = palabras.length - 1;
                        
                        for(int i = totalPalabras; i >= 0; i--)
                        {
                            System.out.println(i + "- " + palabras[i] + "(" + palabras[i].length() + " letras)");
                        }
                    }
                    break;
                
                case "e":
                    if(fraseCompleta.equals(""))
                        System.out.println("No hay registro de frases anteriores.");
                    else 
                    {
                        String[] palabras = fraseCompleta.split(" ");
                        totalPalabras = palabras.length - 1;

                        for(int i = totalPalabras; i >= 0; i--)
                        {
                            fraseInvertida += palabras[i] + " ";
                        }

                        System.out.println("La frase invertida es: " + fraseInvertida);
                    }
                    break;

                case "f":
                    cerrarProg = true;
            }
        }
        sc.close();
    }    
}
