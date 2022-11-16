import java.util.Scanner;

public class AnalizadorTextos 
{
    public static void main(String[] args) 
    {
        //Variables
        boolean cerrarProg = false;
        String frase = "";
        int espaciosCreados = 0;
        String chrBuscar = "";
        String fraseCompleta = "";
        int posicionChr = 0;
        String posicionStr = "";
        int totalPalabras = 0;
        int totalLetras = 0;
        int chrAparece = 0;

        Scanner sc = new Scanner(System.in);

        while(cerrarProg == false)
        {   
            System.out.println("\n/////////////////////////////////////////////////////////////////////////\n* Opción a - Añadir a la frase." + 
            "\n* Opción b - Indicar la ultima frase introducida.\n* Opción c - Indicar el número de palabras que tiene la frase." +
            "\n* Opción d - Indicar cuantas veces a aparece un carácter en la frase.\n* Opción e - Limpiar frase.\n* Opción s - Salir." +
            "\n/////////////////////////////////////////////////////////////////////////////");
            String letra = sc.nextLine();
            switch(letra)
            {
                case "a":
                    System.out.println("Introduce la frase: ");
                    frase = sc.nextLine();
                    fraseCompleta += frase + " ";
                    espaciosCreados++;

                    break;

                case "b":
                    if(fraseCompleta.equals(""))//En todos los casos primero controlo errores.
                        System.out.println("No hay registro de frases anteriores.");
                    else
                        System.out.println(fraseCompleta);
                    break;

                case "c":
                    if(fraseCompleta.equals(""))
                        System.out.println("No hay registro de frases anteriores. 0 numero de letras y palabras.");
                    else
                    {
                        totalLetras = (fraseCompleta.length()) - espaciosCreados;
                        //A parte de las palabras e querido añadir el total de letras. *espacioscreados es por los espacios que se crea al sumar en el str de fraseCompleta, hay que restarlos
                        String[] palabras = fraseCompleta.split(" ");
                        totalPalabras = palabras.length;

                        System.out.println("La frase tiene actualmente: " + totalLetras + " letras y " + totalPalabras + " palabras.");
                    }
                    break;

                case "d":
                    if(fraseCompleta.equals(""))
                        System.out.println("No hay registro de frases anteriores.");
                    else 
                    {
                        System.out.println("Que caracter quieres buscar?");
                        chrBuscar = sc.nextLine().toLowerCase();

                        posicionChr = fraseCompleta.indexOf(chrBuscar);//Obtengo la primera poscicion

                        if(posicionChr == -1)
                            System.out.println("La letra " + chrBuscar + " no esta en la frase.");
                        else
                        {
                            posicionStr += (posicionChr + 1) + " ";//+1 porque empieza por 0
                            chrAparece++;

                            while(posicionChr != -1)
                            {
                                posicionChr = fraseCompleta.indexOf(chrBuscar, posicionChr + 1);

                                if(posicionChr != -1)
                                {
                                    posicionStr += (posicionChr + 1) + " ";
                                    chrAparece++;
                                }
                            }
                            System.out.println("La letra " + chrBuscar + " aparece " + chrAparece + " veces, y en las posiciones: " + posicionStr + " de la frase.");
                        }
                    }
                    break;

                case "e":
                    fraseCompleta = "";
                    break;

                case "s":
                    cerrarProg = true;
                    break;

                default:
                    System.out.println("Introduce una letra correcta.");//Control del programa
            }
        }
        sc.close();
    }   
}
