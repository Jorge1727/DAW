package ClasesT6.Interfaces;

import java.util.Arrays;

public class UsoInterfaces 
{

    public static void main(String[] args) 
    {
        Cliente c1 = new Cliente("Pepe", 100, 55);
        Cliente c2 = new Cliente("Manolo", 10, 44);
        Cliente c3 = new Cliente("Roberto", 150, 25);
        Cliente c4 = new Cliente("Maria", 100);
        Cliente c5 = new Cliente("Juan",2100);
        Cliente c6 = new Cliente("Alfonso", 500);
        
        Supermercado mercadona = new Supermercado("Merca", "Hacendado", 1000);

        mercadona.nuevoCliente(c1);
        mercadona.nuevoCliente(c2);
        mercadona.nuevoCliente(c3);
        mercadona.nuevoCliente(c4);
        mercadona.nuevoCliente(c5);
        mercadona.nuevoCliente(c6);
        
        System.out.println(Arrays.toString(mercadona.colaClientes));

        Arrays.sort(mercadona.colaClientes);

        System.out.println(Arrays.toString(mercadona.colaClientes));

        //Arrays.sort(mercadona.colaClientes, new ClientecomparatorEdad());
        ClienteComparatorEdad comparadorPorEdad = new ClienteComparatorEdad();
        Arrays.sort(mercadona.colaClientes,comparadorPorEdad);

        System.out.println(Arrays.toString(mercadona.colaClientes));

        Arrays.sort(mercadona.colaClientes, new ClienteOrdenaDineroEdad());

        System.out.println(Arrays.toString(mercadona.colaClientes));
    }
}
