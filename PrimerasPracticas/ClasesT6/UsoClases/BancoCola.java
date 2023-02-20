package ClasesT6.UsoClases;

import ClasesT6.Clases.Caja;
import ClasesT6.Clases.Cliente;
import ClasesT6.Clases.Cliente.AccionesBanco;

public class BancoCola 
{
    public static void main(String[] args) 
    { 
        Caja caja = new Caja(1000);
        //Cliente[] colaClientes = new Cliente[0];
        Cliente cliente1 = new Cliente("Andres", AccionesBanco.RETIRAR, 100);
        caja.cogerTurno(cliente1);
        Cliente cliente2 = new Cliente("Javier", AccionesBanco.RETIRAR, 540.5);
        caja.cogerTurno(cliente2);
        Cliente cliente3 = new Cliente("Sara", AccionesBanco.RETIRAR, 1500);
        caja.cogerTurno(cliente3);
        caja.estadoCola();
        caja.atender();
        System.out.println(caja.saldo());
       
        Cliente cliente4 = new Cliente("Miguel", AccionesBanco.INGRESAR, 2000);
        caja.cogerTurno(cliente4);
        caja.atender();
        System.out.println(caja.saldo());
        caja.estadoCola();
        caja.atender();
        caja.estadoCola();
        System.out.println(caja.saldo());
        caja.atender();
        System.out.println("Actualmente hay " + caja.saldo());
    }
 
 
    
}
