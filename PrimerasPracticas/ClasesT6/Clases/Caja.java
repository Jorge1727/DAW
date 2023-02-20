package ClasesT6.Clases;

import ClasesT6.Clases.Cliente.AccionesBanco;

public class Caja 
{
    //Atributos
    public double importeBanco;
    Cliente[] clientesEncola;

    //Constructor
    public Caja(double importeBanco) 
    {
        this.clientesEncola = new Cliente[0];
        this.importeBanco = importeBanco;
    }

    //Metodos
    public void cogerTurno(Cliente cliente)
    {
        Cliente[] colaFinal = new Cliente[this.clientesEncola.length + 1];

        for (int i = 0; i < this.clientesEncola.length; i++) 
        {
            colaFinal[i] = this.clientesEncola[i];
        }

        colaFinal[colaFinal.length-1] = cliente;

        this.clientesEncola = colaFinal;
    }

    public void atender()
    {
        Cliente[] colaFinal = new Cliente[this.clientesEncola.length - 1];

        for (int i = 0; i < colaFinal.length; i++)
        {
            colaFinal[i] = this.clientesEncola[i + 1];
        }

        System.out.println("Se atiende a: " + clientesEncola[0]);

        if(clientesEncola[0].getImporte() > getImporteBanco() && clientesEncola[0].getAccionesBanco() == AccionesBanco.RETIRAR)
        {
            System.out.println("No hay dinero suficiente en la caja, vuelva mañana");
        }
        else 
        {
            if(clientesEncola[0].getAccionesBanco() == AccionesBanco.RETIRAR)
            {
                setImporteBanco(getImporteBanco() - clientesEncola[0].getImporte());
            }
            else 
            {
                setImporteBanco(getImporteBanco() + clientesEncola[0].getImporte());

            }
        }

        this.clientesEncola = colaFinal;
        
    }

    public void estadoCola()
    {
        for (int i = 0; i < clientesEncola.length; i++) 
        {
            System.out.println(this.clientesEncola[i]);
        }
    }

    public double saldo()
    {
        return getImporteBanco();
    }

    public double getImporteBanco() {
        return importeBanco;
    }

    public void setImporteBanco(double importeBanco) {
        this.importeBanco = importeBanco;
    }

    
    
}
