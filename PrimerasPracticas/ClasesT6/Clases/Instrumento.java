package ClasesT6.Clases;

public abstract class Instrumento 
{
    public enum Notas{ DO, RE, MI, FA, SOL, LA, SI};

    //Atributos
    protected Notas[] melodia;

    //NO TIENE CONSTRUCTOR PORQUE ES UNA CLASE ABSTRACTA
    //PERO LO HACEMOS PA PROBAR
    public Instrumento()
    {
        this.melodia = new Notas[0];
    }

    //Metodos
    public Notas[] add(Notas nota)
    {
        Notas[] nuevaMelodia = new Notas[this.melodia.length + 1];

        for (int i = 0; i < this.melodia.length; i++) 
        {
            nuevaMelodia[i] = this.melodia[i];
        }

        // nuevaMelodia = Arrays.copyOf(melodia, melodia.length+1);
        
        nuevaMelodia[nuevaMelodia.length - 1] = nota;
        
        this.melodia = nuevaMelodia;

        return this.melodia;
    }

    public abstract void interpretar();

    
}
