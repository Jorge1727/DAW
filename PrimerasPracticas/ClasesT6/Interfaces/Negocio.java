package ClasesT6.Interfaces;

public abstract class Negocio 
{
    //Atrib
    protected String nombreNegocio;
    protected double dineroEnCaja;
    protected Cliente[] colaClientes;
    protected boolean estado;

    //constr
    public Negocio(String nombre)
    {
        this.nombreNegocio = nombre;
        dineroEnCaja = 0;
        colaClientes = new Cliente[0];
        estado = false;
    }

    public abstract double PagarImpuestos();


}
