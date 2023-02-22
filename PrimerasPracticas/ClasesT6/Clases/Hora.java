package ClasesT6.Clases;

public class Hora 
{
    //Atributos
    private int horas;
    private int minutos;

    //Constructor
    public Hora(int hora, int minutos)
    {
        if (hora < 0 && hora >23)
        {
            this.horas = 0;    
        }
        else
        {
            this.horas = hora;
        }
        this.minutos = minutos;
    }

    //Metodos

    
    public void inc()
    {
        setMinutos(getMinutos() + 1);
    }

    /**
     * Devuelve boolean true si se pudo cambiar la hr y false si no.
     * @param hora
     * @return
     */
    public boolean setHora(int hora)
    {
        boolean resultado = false;

        if(hora > 0 && hora < 24)
        {
            setHoras(hora);
            resultado = true;
        }
        else
            System.out.println("No se pudo cambiar la hora");

        return resultado;
            
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas <= 23)
        {
            this.horas = horas;
        }
        else
        {
            setHoras(0);
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 60)
        {
            this.minutos = minutos;
        }
        else 
        {
            this.minutos = 0;
            //this.horas =  this.horas +1; No es correcto asi
            setHoras(getHoras()+1);
        }
    }

    

    @Override
    public String toString()
    {
        return getHoras() + ":" + getMinutos();
    }
}
