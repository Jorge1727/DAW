package Colecciones.clases;

public class UsoClasesColecciones 
{
    public static void main(String[] args) 
    {
        Profesor profe = new Profesor();
        Alumno alumnoNormal = new Alumno();
        Alumno_NEAEE alumno = new Alumno_NEAEE();

        profe.setNombre("Juan");
        alumnoNormal.setNombre("Jose");
        alumno.setNombre("Pepe");

        //Si extendemos ya no valdria a Persona************
        //Notas<Persona> notas = new Notas<Persona>(profe);
        //notas.escribirNota();

        Notas<Alumno> notas2 = new Notas<Alumno>(alumno);
        notas2.escribirNota();

        Notas<Alumno_NEAEE> notas3 = new Notas<Alumno_NEAEE>(alumno);
        notas3.escribirNota();
        
    }
}
