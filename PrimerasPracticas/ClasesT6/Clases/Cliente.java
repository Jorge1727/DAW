package ClasesT6.Clases;

public class Cliente 
{
    //Atributos
    public enum AccionesBanco {RETIRAR, INGRESAR};

    public String nombre;
    public AccionesBanco accionesBanco;
    public double importe;
    Caja caja;

    //Constructor
    public Cliente(String nombre, AccionesBanco accionesBanco, double importe) 
    {
        this.nombre = nombre;
        this.accionesBanco = accionesBanco;
        this.importe = importe;

    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AccionesBanco getAccionesBanco() {
        return accionesBanco;
    }

    public void setAccionesBanco(AccionesBanco accionesBanco) {
        this.accionesBanco = accionesBanco;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString()
    {
        return "CLIENTE: " + getNombre() + ", ACCION: " + getAccionesBanco() + ", IMPORTE: " + getImporte();
    }

}
