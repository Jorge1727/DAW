package ClasesT6.Clases;

public class HoraExacta extends Hora
{
    //A
    int segundos;

    //C
    public HoraExacta(int hora, int minutos, int segundos) 
    {
        super(hora, minutos);
        this.segundos = segundos;
    }

    //M
    public boolean setSegundo(int sgs)
    {
        boolean resultado = false;

        if(sgs > 0 && sgs < 60)
        {
            setSegundos(sgs);
            resultado = true;
        }
        else
            System.out.println("No se pudo cambiar los segundos");

        return resultado;
    }

    public void inc()
    {
        setSegundos(getSegundos() + 1);
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 60)
        {
            this.segundos = segundos;
        }
        else 
        {
            this.segundos = 0;
            
            //this.minutos = this.minutos +1;
            setMinutos(getMinutos() + 1);
        }
    }

    @Override
    public String toString()
    {
        return getHoras() + ":" + getMinutos() + ":" + getSegundos();
    }
        
}
