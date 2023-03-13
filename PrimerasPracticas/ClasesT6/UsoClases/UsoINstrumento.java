package ClasesT6.UsoClases;

import ClasesT6.Clases.Instrumento.Notas;

public class UsoINstrumento 
{
    public static void main(String[] args) 
    {
        //Instrumento il = new Instrumento();    AL SER ABSTRACTA NO SE PUEDE INSTANCIAR

        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();

        piano.add(Notas.LA);
        piano.add(Notas.LA);
        piano.add(Notas.FA);
        piano.add(Notas.SOL);
        piano.add(Notas.SOL);
        piano.add(Notas.DO);
        
        piano.interpretar();
        System.out.println();

        guitarra.add(Notas.LA);
        guitarra.add(Notas.LA);
        guitarra.add(Notas.FA);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.DO);

        guitarra.interpretar();
        System.out.println();
    }
    
}
