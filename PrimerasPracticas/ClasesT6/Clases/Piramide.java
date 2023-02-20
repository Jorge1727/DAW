package ClasesT6.Clases;

public class Piramide {

    //ATr
    private int altura;
    private static int numeroDePiramidesCreadas;

    //Constuctor
    public Piramide(int altura)
    {
        this.altura = altura;

        numeroDePiramidesCreadas++;
    }


    public static int getPiramidesCreadas() {
        return numeroDePiramidesCreadas;
    }

    @Override
    public String toString()
    {
        String resultado="";

        for (int i = 0; i < altura; i++) 
        {
            //pinto los espacios
            for (int j = 0; j < altura-1-i; j++) 
            {
                resultado += "_";
            }

            //pinto lado izq de la piramide
            for (int j = 0; j <= i; j++) 
            {
                resultado+="*";    
            }

            //pinto lado izq de la piramide
            for (int j = 0; j < i; j++) 
            {
                resultado+="*";
            }
            resultado+="\n";
        }

        return resultado;
    }


    
}
