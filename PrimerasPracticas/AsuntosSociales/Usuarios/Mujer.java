package AsuntosSociales.Usuarios;

import java.time.LocalDate;

import AsuntosSociales.Equipo.Trabajador;

public class Mujer extends Usuario
{
    //Atributos
    private boolean casaPropia;
    private int hijosMenores;
    
    //Metodos
    public Mujer(String nombre, String apellidos, String dni, Trabajador trabajadorAsignado,
            LocalDate fechaUltimaVisita, boolean casaPropia, int hijosMenores) 
    {
        super(nombre, apellidos, dni, trabajadorAsignado, fechaUltimaVisita);
        this.casaPropia = casaPropia;
        this.hijosMenores = hijosMenores;
    }

    @Override
    public String muestraInformacion() 
    {
        return "Usuario MUJER: " + this.getNombre() + " " + this.getApellidos() + "(" + this.getDni() + ") - " + this.getTrabajadorAsignado() + " - ult visista: " + this.getFechaUltimaVisita();
    }

    public boolean isCasaPropia() {
        return casaPropia;
    }

    public void setCasaPropia(boolean casaPropia) {
        this.casaPropia = casaPropia;
    }

    public int getHijosMenores() {
        return hijosMenores;
    }

    public void setHijosMenores(int hijosMenores) {
        this.hijosMenores = hijosMenores;
    }
    
    
}
