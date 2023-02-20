package ClasesT6.UsoClases;

import ClasesT6.Clases.CuentaCorriente;
import ClasesT6.Clases.Gestor;

public class Banco {

    public static void main(String[] args) {
        
        CuentaCorriente cc_Andres = new CuentaCorriente("23564895A", "Andrés", 1000);
        cc_Andres.ingresarDinero(1000);
        cc_Andres.sacarDinero(524);

        System.out.println(cc_Andres.mostrarInformacion());
        System.out.println(cc_Andres);

        System.out.println("------------------------------");

        CuentaCorriente cc_Sara = new CuentaCorriente("65856518B", 500);
        System.out.println(cc_Sara);

        System.out.println("------------------------------");

        CuentaCorriente cc_Javi = new CuentaCorriente("35196545E", "Javi", 1000);
        System.out.println(cc_Javi);

        System.out.println("------------------------------");

        Gestor luis_Gestor = new Gestor("Luis", "555-123-123");
        Gestor paco_Gestor = new Gestor("Paco", "666-555-666");

        cc_Andres.setGestor(luis_Gestor);
        cc_Javi.setGestor(luis_Gestor);
        cc_Sara.setGestor(paco_Gestor);

        Gestor gestor1 = cc_Javi.getGestor();
        gestor1.setNombre("Luis Maria");

        System.out.println(cc_Sara.getGestor().getNombre());

        System.out.println("¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§¶§");

        
    }
    
}
