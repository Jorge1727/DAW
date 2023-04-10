package examenClases_JorgeTapia.RRHH;

public class Cliente extends Persona
{
    //Atributos
    public String tlf;
    public int alturaSalto;
    public boolean segVida;

    //Constructor
    public Cliente(String nombre, String apellidos, String tlf, int alturaSalto, boolean segVida) 
    {
        super(nombre, apellidos);
        this.tlf = tlf;
        this.alturaSalto = alturaSalto;
        this.segVida = segVida;
    }

    public Cliente(String nombre, String apellidos, String tlf, int alturaSalto) 
    {
        super(nombre, apellidos);
        this.tlf = tlf;
        this.alturaSalto = alturaSalto;
        this.segVida = false;
    }

    //Metodos

    @Override
    public String informacion()
    {
        return super.getNombre() + super.getApellidos() + " " +this.alturaSalto;
    }

    public String getTlf() {
        return tlf;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public boolean isSegVida() {
        return segVida;
    }

    
    
}