package clases;

public class Corredor extends Ciclista implements Comparable<Corredor>
{
    //A
    private int dorsal;
    private int tiempo;

    //C
    public Corredor(Ciclista c, int dorsal) 
    {
        super(c.getNombre(), c.getCodigoEquipo(), c.getPeso(), c.getPais());
        this.dorsal = dorsal;
        this.tiempo = 0;
    }

    

    //M
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int compareTo(Corredor o) 
    {
        int resultado = this.tiempo - o.getTiempo();

        if(resultado == 0)
        {
            return this.dorsal-o.getDorsal();
        }
        else
        {
            return resultado;
        }

    }

    @Override
    public String toString() {
        return "\nCorredor [dorsal=" + this.dorsal + " nombre: "+ this.getNombre() +", tiempo=" + this.tiempo + "]";
    }

    

    
    
    
}
