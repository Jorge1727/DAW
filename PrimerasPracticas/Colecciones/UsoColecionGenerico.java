package Colecciones;

import ClasesT6.Clases.Cliente;
import ClasesT6.Clases.Disco;

public class UsoColecionGenerico 
{
    public static void main(String[] args) 
    {
        Cliente cliente = new Cliente("KIKE", null, 1000);
        Disco disco = new Disco(100, "Juan", "perros locos", null, 100);

        ColeccionGenerica<Cliente> coleccionCliente = new ColeccionGenerica<Cliente>();

        coleccionCliente.insert(cliente);

        ColeccionGenerica<Disco> coleccionDisco = new ColeccionGenerica<Disco>();

        coleccionDisco.insert(disco);

    }    
}
