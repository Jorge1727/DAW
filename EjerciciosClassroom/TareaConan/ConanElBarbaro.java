import java.util.Scanner;

public class ConanElBarbaro 
{
    public static void main(String[] args) 
    {
        boolean cerrarJuego = false;
        int ataqueElegido = 0;
        int partidasGanadas = 0;
        int partidasPerdidas = 0;
        String siguienteZombie = "";
        Scanner sc = new Scanner(System.in);

        while(cerrarJuego == false)
        {
            int zombies = (int)((Math.random() * 6) + 5); //de 5 a 10
            int vidaConan = 4;
            int ataqueConan = 0;
            int defensaConan = 0;
            int ataqueZombie = 0;
            int defensaZombie = 0;
            int zombiesFinal = 0;
            int fatality = 100; //Los fatalitys tendran un rango desde su max menos 5;

            do
            {
                System.out.println("Elige el tipo de arma que vas a utilizar...\n1 - Espada a 2 manos\n2 - Hacha\n3 - Espada corta con escudo");
                ataqueElegido = sc.nextInt();

                if(ataqueElegido >= 4 || ataqueElegido <= 0)
                    System.out.println("Opción incorrecta, di una opción válida.\n");

            } while (ataqueElegido >= 4 || ataqueElegido <= 0);

            sc.nextLine();//Tema de leer string despues de un int al pasar al siguiente zombie

            while(zombies >= 1)
            {
                switch(ataqueElegido)
                {
                    case 1://A: 60 y D:40
                        ataqueConan = (int)(Math.random() * 61);

                        if(ataqueConan >= 55)
                            ataqueConan = fatality;

                        defensaConan = (int)(Math.random() * 41);
                        break;

                    case 2://A: 70 y D: 30
                        ataqueConan = (int)(Math.random() * 71);

                        if(ataqueConan >= 65)
                            ataqueConan = fatality;

                        defensaConan = (int)(Math.random() * 31);
                        break;

                    case 3://A: 30 y D: 70
                        ataqueConan = (int)(Math.random() * 31);

                        if(ataqueConan >= 25)
                            ataqueConan = fatality;
                        
                        defensaConan = (int)(Math.random() * 71);
                        break;
                }

                if(zombies == 1)
                {
                    System.out.println("--- combate con ZOMBIE JEFE ---");
                    ataqueZombie = (int)(Math.random() * 56);//+5 ataque y +5 de vida
                    defensaZombie = (int)(Math.random() * 76);
                }
                else
                {
                    ataqueZombie = (int)(Math.random() * 51);//A: 50 y D: 70
                    defensaZombie = (int)(Math.random() * 71);
                }

                if(ataqueConan > 5)
                {
                    if(ataqueConan == fatality)
                    {
                        System.out.println("\t-Conan ha hecho un FATALITY\nEl zombie " + zombies + " ha muerto\n/////////////////////////\nSiguiente zombie: pulse enter");
                        zombies--;

                        siguienteZombie = sc.nextLine();
                    }
                    else
                    {
                        System.out.println("Conan ataca - " + ataqueConan);
                        System.out.println("Zombie " + zombies + " defiende - " + defensaZombie);

                        if(ataqueConan < defensaZombie)
                        {
                            System.out.println("Zombie " + zombies + " ataca - " + ataqueZombie);
                            System.out.println("Conan defiende - " + defensaConan);

                            if(ataqueZombie > defensaConan)
                            {
                                vidaConan--;
                                System.out.println("Conan pierde 1 vida, le quedan " + vidaConan);
                            }
                        }
                        else
                        {
                            if(zombies != 1)
                            {
                                System.out.println("El zombie " + zombies + " ha muerto\n/////////////////////////\nSiguiente zombie: pulse enter");
                                zombies--;

                                siguienteZombie = sc.nextLine();
                            }
                            else
                            {
                                System.out.println("El ZOMBIE JEFE ha muerto!!");
                                zombies--;
                            }
                        }

                        if(vidaConan == 0 || zombies == 0)
                        {
                            if(vidaConan == 0)
                            {
                                zombiesFinal = zombies;
                                zombies = 0;
                                partidasPerdidas++;
                                System.out.println("\n*************** GAME OVER *********************\n(Te falto matar a " + zombiesFinal +" zombies)");
                            }
                            else
                            {
                                partidasGanadas++;
                                System.out.println("\n\t\tENHORABUENA\t\t\n************* TESORO CONSEGUIDO *************");
                            }
                        }
                    }
                }
                else
                {
                    vidaConan--;
                    System.out.println("\t-PIFIA, Conan se autolesiona\nConan pierde 1 vida, le quedan " + vidaConan);

                    if(vidaConan == 0)
                    {
                        zombiesFinal = zombies;
                        zombies = 0;
                        partidasPerdidas++;
                        System.out.println("\n*************** GAME OVER *********************\n(Te falto matar a " + zombiesFinal +" zombies)");
                    }
                }
            }

            System.out.println("\n¿Quies jugar otra vez? (1 para si, otro numero para salir)");
            ataqueElegido = sc.nextInt();

            if(ataqueElegido != 1)
                cerrarJuego = true;
        }
        sc.close();

        System.out.println("--------- Historial de partidas----------\n-Partidas ganadas: " + partidasGanadas + "\n-Partidas perdidas: " + partidasPerdidas + "\n");

        /*
        Los extras que he añadido han sido:
            - Fatality.
            - Zombie jefe.
            - Historial de partidas ganadas y/o perdidas.
            - Mostrar el combate con cada zombie y pulsar enter para continuar.
         */
    }    
}
