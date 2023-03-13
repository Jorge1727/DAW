package ClasesT6.UsoClases;

import ClasesT6.Clases.Instrumento;

public class Guitarra extends Instrumento
{
    public Guitarra()
    {
        super();
    }

    public void interpretar()
    {
        for (Notas notas : melodia) 
        {
            switch (notas)
            {
                case DO:
                    System.out.println("DOoooo");
                    break;

                case RE:
                    System.out.println("REeeee");
                    break;
                
                case MI:
                    System.out.println("MIiii");
                    break;
                
                case FA:
                    System.out.println("FAaaa");
                    break;
                
                case SOL:
                    System.out.println("SOooooL");
                    break;

                case LA:
                    System.out.println("LAaaaaa");
                    break;
                
                case SI:
                    System.out.println("SIiiiii");
                    break;
            }
        }
    }
}
