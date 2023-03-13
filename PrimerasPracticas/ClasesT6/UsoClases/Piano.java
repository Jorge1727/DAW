package ClasesT6.UsoClases;

import ClasesT6.Clases.Instrumento;

public class Piano extends Instrumento
{
    public Piano()
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
                    System.out.println("DO");
                    break;

                case RE:
                    System.out.println("RE");
                    break;
                
                case MI:
                    System.out.println("MI");
                    break;
                
                case FA:
                    System.out.println("FA");
                    break;
                
                case SOL:
                    System.out.println("SOL");
                    break;

                case LA:
                    System.out.println("LA");
                    break;
                
                case SI:
                    System.out.println("SI");
                    break;
            }
        }
    }
}
