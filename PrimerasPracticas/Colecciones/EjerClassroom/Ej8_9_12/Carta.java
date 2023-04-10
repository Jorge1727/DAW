package Colecciones.EjerClassroom.Ej8_9_12;

public class Carta implements Comparable<Carta>
{
    public String[] valoresCarta = {"AS", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    public enum Palos {BASTOS, COPAS, ESPADAS, OROS}

    //Atributos de carta
    private String valor;
    private Palos palos;

    public Carta()
    {
        //HAce carta al azar
        this.valor = valoresCarta[(int)(Math.random() * valoresCarta.length)];

        Palos[] p = Palos.values();
        this.palos = p[(int)(Math.random() *p.length)];
    }

    @Override
    public String toString()
    {
        return this.valor + " " + this.palos;
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean resultado = false;

        Carta carta = (Carta)obj;

        if(this.palos.equals(carta.palos) && this.valor.equals(carta.valor))
        {
            resultado = true;
        }

        return resultado;
    }

    @Override
    public int compareTo(Carta o) 
    {
        Carta c2 = (Carta)(o);

        if(this.palos.compareTo(c2.palos) == 0)
        {
            return this.valor.compareTo(c2.valor);
        }
        else
        {
            return this.palos.compareTo(c2.palos);
        }
    }

    public String[] getValoresCarta() {
        return valoresCarta;
    }

    public void setValoresCarta(String[] valoresCarta) {
        this.valoresCarta = valoresCarta;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Palos getPalos() {
        return palos;
    }

    public void setPalos(Palos palos) {
        this.palos = palos;
    }

    
}
