package ClasesT6.UsoClases;

import ClasesT6.Clases.Baraja;
import ClasesT6.Clases.Carta;

public class JuegoDeCartas 
{
    public static void main(String[] args) 
    {
        Baraja baraja = new Baraja();    
    
        baraja.barajar();

        Carta carta1 = baraja.pop();
        System.out.println(carta1);

        Carta carta2;
        boolean fin = false;

        int cont = 1;

        do
        {
            carta2 = baraja.pop();
            cont++;
            System.out.println(carta2);

            if(carta2.esMenor(carta1))
            {
                fin = true;
                System.out.println("Es mas peque la nueva carta FIN");
                System.out.println("Cartas sacadas " + cont);
            }
            else
            {
                carta1 = carta2;
            }

        }while(!fin);
    }    
}
