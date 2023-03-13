package ClasesT6.UsoClases;

import ClasesT6.ClasesHerencia.Persona;
import ClasesT6.Clases.Trabajador2;
import ClasesT6.ClasesHerencia.Empleado;
import ClasesT6.ClasesHerencia.Jefe;

public class PruebaPersEmplTra 
{
    public static void main(String[] args) {
        Persona p1 = new Persona("Jorge", 20);
    
        Empleado e1 = new Empleado("Maria", 20, 1200);
    
        Jefe jefe1 = new Jefe("matti", 29, 8000, "Logica", 78);

        System.out.println(p1.decirHola());
        System.out.println(e1.decirHola());
        System.out.println(jefe1.decirHola());
        
    }
}
