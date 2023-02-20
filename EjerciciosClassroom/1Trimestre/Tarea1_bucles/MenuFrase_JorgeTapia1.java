import java.util.Scanner;

public class MenuFrase_JorgeTapia1 
{
    public static void main(String[] args) 
    {
        //Variables
        boolean cerrarProg = false;
        String frase = "";
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
            "\n* Opción d - Indicar cuantas veces aparece un carácter en la frase.\n* Opción e - Limpiar frase.\n* Opción s - Salir." +
            "\n/////////////////////////////////////////////////////////////////////////////");
            String letra = sc.nextLine().toLowerCase();

            switch(letra)
            {
                case "a":
                    System.out.println("Introduzca la frase: ");
                    frase = sc.nextLine();

                    if(frase.length() == 0)
                        System.out.println("No ha introducido ninguna frase");
                    else 
                        fraseCompleta += frase + " ";//o para restarlo los espacios usar trim, yo simplemente reste 1 despues. 

                    break;

                case "b":
                    if(fraseCompleta.equals(""))//He controlado todos los errores posibles en cualquier apartado.
                        System.out.println("No hay registro de frases anteriores.");
                    else
                        System.out.println("La frase actualmente sería: " + fraseCompleta);

                    break;

                case "c":
                    if(fraseCompleta.equals(""))
                        System.out.println("No hay registro de frases anteriores. 0 numero de letras y palabras.");
                    else
                    {
                        totalLetras = (fraseCompleta.length() - 1);
                        //A parte de las palabras e querido añadir el total de letras. -1 por el espacio creado en el str de fraseCompleta
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
                        String chrBuscar = "";

                        while(chrBuscar.length() != 1)
                        {
                            System.out.println("¿Que caracter desea buscar?");
                            chrBuscar = sc.nextLine();
                            
                            if(chrBuscar.length() == 1)
                            {
                                String fraseCompletaTLC = fraseCompleta.toLowerCase();//Convierto todo a lowerCase sin afectar a la original.

                                posicionChr = fraseCompletaTLC.indexOf(chrBuscar);//Obtengo la primera poscicion.

                                if(posicionChr == -1)
                                    System.out.println("La letra " + chrBuscar + " no está en la frase.");
                                else
                                {
                                    posicionStr += (posicionChr + 1) + " ";//+1 porque empieza por 0.
                                    chrAparece++;

                                    while(posicionChr != -1)
                                    {
                                        posicionChr = fraseCompletaTLC.indexOf(chrBuscar, posicionChr + 1);

                                        if(posicionChr != -1)
                                        {
                                            posicionStr += (posicionChr + 1) + " ";
                                            chrAparece++;
                                        }
                                    }
                                    System.out.println("La letra " + chrBuscar + " aparece " + chrAparece + " veces, y en las posiciones: " + posicionStr + " de la frase.");
                                }

                                chrAparece = 0;
                                posicionStr = "";
                            }
                            else
                                System.out.println("Error, introduzca bien los datos");
                        }
                    }

                    break;

                case "e":
                    if(fraseCompleta.equals(""))
                        System.out.println("No tenía ninguna frase guardada.");
                    else 
                    {
                        fraseCompleta = "";
                        System.out.println("Ha eliminado las frases anteriores.");
                    }
                    break;

                case "s":
                    cerrarProg = true;
                    System.out.println("Se procederá a cerrar el programa.");
                    break;

                default:
                    System.out.println("Introduce una letra correcta.");//Control del programa         
            }

            System.out.println("\nPulse enter para continuar");
            letra = sc.nextLine();
        }
        sc.close();
    }   
}
