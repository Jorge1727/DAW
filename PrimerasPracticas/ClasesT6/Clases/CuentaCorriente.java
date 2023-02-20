package ClasesT6.Clases;

public class CuentaCorriente 
{

    //Atributos
    String dni;
    String nombreTitular;
    double saldo;
    //Añado gestor que es otra clase
    private Gestor gestor;


    //Constructores
    public CuentaCorriente(String dni, String nombreTitular) 
    {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;

    }

    public CuentaCorriente(String dni, double saldoInicial) 
    {
        this.dni = dni;
        this.saldo = saldoInicial;

    }

    public CuentaCorriente(String dni, String nombreTitular, double saldoInicial) 
    {
        this(dni, nombreTitular);
        this.saldo = saldoInicial;

    }

    //Métodos
    public void sacarDinero(double dineroASacar) 
    {
        //Comprobar que tenemos dinero suficiente
        if (this.saldo > dineroASacar) 
        {
            //Puedo sacar dinero
            this.saldo = dineroASacar;
        }
        else 
        {
            System.out.println("No tienes dinero suficiente");
        }

    }

    public void ingresarDinero(double dineroAIngresar) 
    {
        if (dineroAIngresar >= 0)
        {
            this.saldo += dineroAIngresar;
        }
    }

    public String mostrarInformacion() 
    {
        String resultado = this.nombreTitular + "(" + this.dni + ") : " + this.saldo;
        return resultado;
    }

    @Override  //sobreescribe el metodo por defecto de toString
    public String toString() 
    {
        return mostrarInformacion();
    }

    public Gestor getGestor() 
    {
        return gestor;
    }

    public void setGestor(Gestor gestor) 
    {
        this.gestor = gestor;
    }

}
