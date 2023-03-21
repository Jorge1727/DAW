package Colecciones.clases;

public class Profesor extends Persona
{

    private String MateriaQueImparte;

    public Profesor() 
    {
        
    }

    public String getMateriaQueImparte() 
    {
        return MateriaQueImparte;
    }

    public void setMateriaQueImparte(String materiaQueImparte) 
    {
        MateriaQueImparte = materiaQueImparte;
    }
        
}
