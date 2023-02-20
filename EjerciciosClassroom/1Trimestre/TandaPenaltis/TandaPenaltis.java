import java.util.Scanner;

public class TandaPenaltis 
{
    public static void main(String[] args) 
    {
        System.out.println("--------------- TANDA DE PENALTIS --------------\n¿Cuál es tu nombre?: ");
        Scanner sc = new Scanner(System.in);
        String player1 = sc.nextLine();
        

        boolean diferenciaGoles = false;
        int golesPlayer = 0;
        int golesPC = 0;
        int ronda = 1;//Contador para entrar a hacer la diferencia de goles despues de la primera ronda obligaotria de 10 tiros.
        
        System.out.println("\n----- EMPIEZA LA TANDA DE PENALTIS ------");

        while(diferenciaGoles == false)
        {
            int turno = 1;//En cada turno Jugador 1 tirará y despues intentará parar.
            String decision = "";
            String markP1 = ": ";
            String markPC = "PC: ";

            System.out.println(player1 + ": -----" + "\n" + "PC: -----");

            while(turno <= 5)
            {
                System.out.println("/////////////////////////////////////////////\n" + player1 + " tira (I(izquierda), D(derecha), C(centro)");
                decision = sc.nextLine().toLowerCase();
                //Pondre en mi código que I = 1, D = 2 y C = 3

                while(!decision.equals("i") && !decision.equals("d") && !decision.equals("c"))//control de errores en la elección.
                {
                    if(!decision.equals("i") || !decision.equals("d") || !decision.equals("c"))
                    {
                        System.out.println("Error, seleccione uno de los 3\n(I(izquierda), D(derecha), C(centro)");
                        decision = sc.nextLine().toLowerCase();
                    }
                }

                int falla = (int)(Math.ceil( Math.random() * 2));//2 de 10 en probabilidad de tirar fuera de la portería.
                int noFalla = (int)(Math.ceil(Math.random() * 10));

                if(noFalla <= falla)
                {
                    System.out.println("- " + player1 + " ha tirado fuera!!");
                    markP1 += "O";
                    
                }
                else
                {
                    int para = (int)(Math.ceil(Math.random() * 3));//PC intenta parar.
                    int marca = 0;
                    switch(decision)
                    {
                        case "i":
                            marca = 1;
                            break;

                        case "d":
                            marca = 2;
                            break;

                        case "c":
                            marca = 3;
                            break;    
                    }
                    
                    if(marca == para)
                    {
                        System.out.println("- " + player1 + " ha fallado!! el portero la ha parado.");
                        markP1 += "O";
                    }
                    else
                    {
                        System.out.println("- " + player1 + " ha marcado");
                        markP1 += "X";
                        golesPlayer++;
                    }
                }

            /////////////////////ESTO ES COMO VA EL MARCADOR ACTUALMENTE///////////////
                System.out.print(player1 + markP1);
                int printMark = 1;
                while(printMark <= (5 - turno))
                {
                    System.out.print("-");
                    printMark++;
                }
                System.out.println();

                System.out.print(markPC);
                printMark = 0;
                while(printMark <= (5 - turno))
                {
                    System.out.print("-");
                    printMark++;
                }
                System.out.println();
            /////////////////////////////////////////////////////////////////////////////

                System.out.println("////////////////////////////////////////\n" + player1 + " intenta parar (I(izquierda), D(derecha), C(centro)");
                decision = sc.nextLine().toLowerCase();

                while(!decision.equals("i") && !decision.equals("d") && !decision.equals("c"))//Control de Errores.
                {
                    if(!decision.equals("i") || !decision.equals("d") || !decision.equals("c"))
                    {
                        System.out.println("Error, seleccione uno de los 3\n(I(izquierda), D(derecha), C(centro)");
                        decision = sc.nextLine().toLowerCase();
                    }
                }

                falla = (int)(Math.ceil( Math.random() * 2));
                noFalla = (int)(Math.ceil(Math.random() * 10));

                if(noFalla <= falla)
                {
                    System.out.println("PC ha tirado fuera!!");
                    markPC += "O";
                    
                }
                else
                {
                    int marca = (int)(Math.ceil(Math.random() * 3));//PC intenta marcar.
                    int para = 0;

                    switch(decision)
                    {
                        case "i":
                            para = 1;
                            break;

                        case "d":
                            para = 2;
                            break;

                        case "c":
                            para = 3;
                            break;    
                    }
                    
                    if(marca == para)
                    {
                        System.out.println("PC ha fallado!! el portero la ha parado.");
                        markPC += "O";
                    }
                    else
                    {
                        System.out.println("PC ha marcado");
                        markPC += "X";
                        golesPC++;
                    }

                }
            /////////////////////ESTO ES COMO VA EL MARCADOR ACTUALMENTE///////////////
                System.out.print(player1 + markP1);
                printMark = 1;
                while(printMark <= (5 - turno))
                {
                    System.out.print("-");
                    printMark++;
                }
                System.out.println();

                System.out.print(markPC);
                printMark = 1;
                while(printMark <= (5 - turno))
                {
                    System.out.print("-");
                    printMark++;
                }
                System.out.println();
            /////////////////////////////////////////////////////////////////////////////

                if(turno == 5 || ronda == 2)//Entrada para comparar goles despues de los tiros obligatorios. Si es la sig ronda, siempre entrará.
                {
                    if(golesPlayer > golesPC)
                    {
                        System.out.println("\n- " + player1 + " gana la tanda de penaltis!!");
                        diferenciaGoles = true;//Salida del programa

                        if(ronda == 2)//Tras una primera ronda en empate, puesto que actualizamos algunos valores.
                            turno = 6;//Para salir del bucle
                    }
                    else
                    {
                        if(golesPC > golesPlayer)
                        {
                            System.out.println("\n- PC gana la tanda de penalties!!");
                            diferenciaGoles = true;

                            if(ronda == 2)//Tras una primera ronda en empate, puesto que actualizamos algunos valores.
                                turno = 6;
                        }
                        else
                        {
                            if(ronda == 1)
                            {
                                System.out.println("-- EMPATE, siguiente ronda --");//Tras la primera ronda, actualizamos valores
                                turno = 0;
                                markP1 = ": ";
                                markPC = "PC: ";
                                ronda++;
                            }
                            else
                                System.out.println("Se sigue!");
                        }        
                    }
                }
                turno++;
            
            }
        }
        sc.close();

    }   
}
