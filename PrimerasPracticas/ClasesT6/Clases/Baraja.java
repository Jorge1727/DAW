package ClasesT6.Clases;

import java.util.Arrays;

import ClasesT6.Clases.Carta.Palo;

public class Baraja 
{
    //Atributos
    private Carta[] mazo;
    
    //Constructor
    public Baraja()
    {
        this.mazo = new Carta[0];

        for (Palo palo : Palo.values()) //PARA TRABAJAR MEJOR CON VALUES ES MEJOR EL FOREACH
        {
            for (int i = 1; i < 13; i++) 
            {
                Carta carta = new Carta(palo, i);
                push(carta);
            }    
            
        }
    }

    //Metodos
    public void barajar()
    {
        for (int i = 0; i < this.mazo.length; i++) 
        {
            int posicionNueva = (int)(Math.random() * this.mazo.length);
            Carta cartaAux = this.mazo[posicionNueva];
            this.mazo[posicionNueva] = this.mazo[i];
            this.mazo[i] = cartaAux;
        }
    }

    /**
     * Insertar una carta dentro de la baraja
     * @param c
     */
    public void push(Carta c)
    {
        Carta[] mazoNuevo = new Carta[this.mazo.length + 1];

        for (int i = 0; i < this.mazo.length; i++) 
        {
            mazoNuevo[i] = this.mazo[i];
        }

        mazoNuevo[mazoNuevo.length-1] = c;

        this.mazo = mazoNuevo;
    }

    /**
     * Quitar una carta de la baraja
     * @param c
     */
    public Carta pop()
    {
        Carta cartaExtraida = null;

        if(this.mazo.length > 0)
        {    

            Carta[] mazoNuevo = new Carta[this.mazo.length - 1];

            for (int i = 0; i < mazoNuevo.length; i++) 
            {
                mazoNuevo[i] = this.mazo[i];
            }

            cartaExtraida = this.mazo[this.mazo.length - 1];

            this.mazo = mazoNuevo;
        }
        else
        {
           System.out.println("No hay cartas suficientes"); 
        }
        
        return cartaExtraida;
    }
    
    @Override
    public String toString()
    {
        return Arrays.toString(this.mazo);
    }

}
