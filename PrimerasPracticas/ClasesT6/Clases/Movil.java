package ClasesT6.Clases;

public class Movil extends Terminal
{
    //Atributos
    public enum Tarifa{RATA, MONO, BISONTE}

    protected Tarifa tipoTarifa;
    protected double tiempoTarificado;

    //Constructor
    public Movil(String numero, String tarifa) 
    {
        super(numero);
        this.tipoTarifa = Tarifa.valueOf(tarifa.toUpperCase());
        this.tiempoTarificado = 0;
    }


    //DecimalFormat formateador = new DecimalFormat("####.##");

    //Metodos
    @Override
    public void llama(Terminal tDestino, int duracion)
    {
        //this.tiempo += duracion;
        this.setTiempo(this.getTiempo() + duracion);
        tDestino.setTiempo(tDestino.getTiempo() + duracion);

        int tiempo = getTiempo();
        int minutos = 0;
        while(tiempo > 60)
        {
            minutos++;
            tiempo -= 60;
        }

        switch(tipoTarifa)
        {
            case RATA:
                setTiempoTarificado( (minutos * 6) + (0.1 * tiempo));
                break;

            case MONO:
                setTiempoTarificado((minutos * 12) + (0.2 * tiempo));
                break;

            case BISONTE:
                setTiempoTarificado((minutos * 30) + (0.5 * tiempo));
                break;
        }
        
    }

    @Override
    public String toString()
    {
        String resultado = "Num " + this.numero + " - " + this.tiempo + "s de conversacion - tarificado " + this.tiempoTarificado;

        return resultado;
    }

    public void setTiempoTarificado(double tiempoTarificado) {
        this.tiempoTarificado = tiempoTarificado;
    }

    
}
