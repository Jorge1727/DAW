package ClasesT6.Clases;

public class TarjetaRegalo 
{
    //Atributos
    private double saldo;
    private int codigo;

    //Constructor
    public TarjetaRegalo(double saldo)
    {
        this.saldo = saldo;
        this.codigo = (int)((Math.random() * 99999) + 1);
    }

    //Metodos
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TarjetaRegalo fusion(TarjetaRegalo t)
    {
        //Sumar importe de las dos tarjetas
        double total = this.getSaldo() + t.getSaldo(); //GEt y settt hacer 
        TarjetaRegalo tNueva = new TarjetaRegalo(total);

        //crear la tarjeta
        tNueva.setSaldo(total);
        tNueva.setCodigo((int)((Math.random() * 99999) + 1));
        this.setSaldo(0);
        t.setSaldo(0);

        return tNueva;
    }

    public void gasta(double gasto)
    {
        this.setSaldo(getSaldo() - gasto);

        if(getSaldo() <= 0)
        {
            System.out.println("No tiene suficiente saldo para gastar" + gasto + "Eur");
            this.setSaldo(gasto + getSaldo());
        }
    }

    @Override
    public String toString()
    {
        String resultado = "Tarjeta nº " + this.codigo + " - Saldo " + this.saldo + "Eur";

        return resultado;
    }
}
