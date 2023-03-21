package Colecciones.clases;

public class Alumno_NEAEE extends Alumno
{
    //Atr
    private int grado;
    private String adaptacion;

    //Cons
    public Alumno_NEAEE() 
    {
            
    }

    //metodos
    public int getGrado() {
        return grado;
    }
    
    public void setGrado(int grado) {
        this.grado = grado;
    }
    public String getAdaptacion() {
        return adaptacion;
    }
    public void setAdaptacion(String adaptacion) {
        this.adaptacion = adaptacion;
    }

    @Override
    public String toString()
    {
        return getNombre();
    }    
    
}
