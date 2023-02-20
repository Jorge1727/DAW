package ClasesT6.Clases;

public class DentroDeClases 
{
    public static void main(String[] args) 
    {
        Persona persona1 = new Persona();

        System.out.println("edad persona1:" + persona1.nombre);
        System.out.println("edad persona1:" + persona1.edad);

        persona1.nombre = "Jorge Tapia";
        persona1.edad = 23;

        
        System.out.println("edad persona1:" + persona1.nombre);
        System.out.println("edad persona1:" + persona1.edad);

        Persona persona2 = new Persona();
        persona2.nombre = "Javi";
        persona2.estatura = 175;
        persona2.edad = 34;

        System.out.println("edad persona2:" + persona2.nombre);
        System.out.println("edad persona2:" + persona2.edad);

        persona1.cumlirAños();
        persona1.saludar();
        System.out.println("tengo actualmente " + persona1.edad + " años");

        Persona p3 = new Persona();

        p3.cambiarPersona(persona2);

        String queDiaEsParaP3 = p3.QueDiaEs();
        System.out.println(queDiaEsParaP3);

        String queDiaEsParaTodasPersonas = Persona.QueDiaEs();
        System.out.println(queDiaEsParaTodasPersonas);

        Persona p4 = new Persona("Andres", 15);
        System.out.println(p4.nombre + p4.edad);
    }
}
