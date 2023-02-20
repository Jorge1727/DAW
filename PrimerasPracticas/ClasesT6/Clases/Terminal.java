package ClasesT6.Clases;

public class Terminal 
{
    //Atributos
    private String numero;
    private int tiempo;

    //Connstructor
    public Terminal(String numero)
    {
        this.numero = numero;
        this.tiempo = 0;
    }

    //Metodos
    @Override
    public String toString()
    {
        String resultado = "Num " + this.numero + " - " + this.tiempo + "s de conversacion";

        return resultado;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void llama(Terminal tDestino, int duracion)
    {
        //this.tiempo += duracion;
        this.setTiempo(this.getTiempo() + duracion);
        tDestino.setTiempo(tDestino.getTiempo() + duracion);
    }
}
