package animales;

public class ExceptionApareamientoImposible extends Exception
{
    public ExceptionApareamientoImposible(String gato1, String gato2) 
    {
        super("El gato " + gato1 + " no se puede aparear con el gato " + gato2);
    }

    @Override
    public String toString() {
        return getMessage();
    }    
}
