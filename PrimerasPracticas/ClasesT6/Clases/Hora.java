package ClasesT6.Clases;

public class Hora 
{
    //Atributos
    private int horas;
    private int mtos;
    private int sgs;
    
    //Constructor
    public Hora(int hora)
    {
        if(hora > 23)
            this.horas = 0;
        
        else
            this.horas = hora;    

        this.mtos = 0;
        this.sgs = 0;
        
    }

    //Atributos

    public int getHora() {
        return horas;
    }

    public void setHora(int hora) {
        if(horas <= 23)
        {
            this.horas = hora;
        }
        else
        {
            this.horas = 0;
        }
        
    }

    public int getMto() {
        return mtos;
    }

    public void setMto(int mto) 
    {
        if(mtos < 60)
        {
            this.mtos = mto;
        }
        else
        {
            this.mtos = 0;
            //nocorrecto : this.horas = this.horas + 1;
            setHora(getHora() + 1);
        }
    }

    public int getSg() {
        return sgs;
    }

    public void setSg(int sg) 
    {
        if(sgs < 60)
        {
            this.sgs = sg;
        }
        else
        {
            this.sgs = 0;
            setMto(getMto() + 1);
            // NO --this.mtos = this.mtos + 1;
        }
    }

    @Override
    public String toString()
    {
        return getHora() //FALTAAAAAAAAAAAAA
    }
}
