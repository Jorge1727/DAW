package ClasesT6.UsoClases;

import ClasesT6.ClasesHerencia.Persona;
import ClasesT6.Clases.Trabajador2;
import ClasesT6.ClasesHerencia.Empleado;

public class PruebaPersEmplTra 
{
    public static void main(String[] args) {
        Persona p1 = new Persona("Jorge", 20);
    
        Empleado e1 = new Empleado("Maria", 20, 1200);
    
        Trabajador2 t2 = new Trabajador2(null, 0, 0, null);  

        System.out.println(p1.decirHola());
        System.out.println(e1.decirHola());
    }
}
