package ClasesT6.Interfaces;

public class Supermercado extends Negocio implements Tienda_I
{
    //Atri
    String nombreMarcaBlanca;

    public Supermercado(String nombre, String nombreMarcaBlanca, double dineroEnCaja)
    {
        super(nombre);
        this.nombreMarcaBlanca = nombreMarcaBlanca;
        this.dineroEnCaja = dineroEnCaja;
    }

    public double PagarImpuestos()
    {
        return dineroEnCaja * 0.10;
    
    }

    //Implemento los metodos de la interfaz Tienda_I

    @Override
    public void abrir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abrir'");
    }

    @Override
    public Cliente cobrar() 
    {
        if(colaClientes.length > 0)
        {
            //Atendemos al primero de la cola
            Cliente clienteAtendido = colaClientes[0];

            //quitamos el primero de la cola
            Cliente[] nuevaCola = new Cliente[this.colaClientes.length - 1]
            {
                
            }    
        
        }
    }

    @Override
    public void nuevoCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuevoCliente'");
    }

    
}
