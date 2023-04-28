package Alumno;

public class Alumno implements Comparable <Alumno>
{
    //A
    private String sexo;
    private int edad;
    private double estatura;
    private int cal1;
    private int cal2;
    private String calificacion;

    //C
    public Alumno(String sexo, int edad, double estatura, int cal1, int cal2, String calificacion) 
    {
        this.sexo = sexo;
        this.edad = edad;
        this.estatura = estatura;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.calificacion = calificacion;
    }
    
    
    //M
    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getCal1() {
        return cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public String getCalificacion() {
        return calificacion;
    }

    
    @Override
    public String toString() {
        return  "\n" + this.sexo + ", " + this.edad + " años, " + this.calificacion;
    }

    @Override
    public int compareTo(Alumno a) 
    {
        return this.edad - a.getEdad();
    }

}

