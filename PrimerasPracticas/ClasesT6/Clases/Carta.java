package ClasesT6.Clases;

public class Carta 
{
    public enum Palo {ORO, BASTOS, ESPADA, COPAS};

    //Atributos 
    private Palo palo;
    private int numero;

    //Constructor
    public Carta(Palo palo, int numero)
    {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;   
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //objeto que no es el mismo se usa GET sino THISSSS
    public boolean esMenor(Carta carta)
    {
        boolean resultado = false;

        if(this.numero < carta.getNumero())
        {
            resultado = true;
        }

        return resultado;
    }

    @Override
    public String toString()
    {
        return this.numero + " de " + this.palo;
    }

}
