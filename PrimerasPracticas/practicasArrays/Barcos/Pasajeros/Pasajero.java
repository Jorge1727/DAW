package practicasArrays.Barcos.Pasajeros;

public class Pasajero 
{
    //Atributos
    static int cod = 1;

    private int num_cod;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private boolean camarote;

    //Constructor
    public Pasajero(String nombre, String apellido, String nacionalidad, boolean camarote) 
    {
        this.num_cod = cod;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.camarote = camarote;

        cod++;
    }

    //Metodos
    @Override
    public String toString()
    {
        return "Pasajero: Nombre: " + this.nombre + "; Apellido: " + this.apellido + "; Nacionalidad: " + this.nacionalidad;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean resultado = false;

        Pasajero p2 = (Pasajero)(o);

        if(this.nombre.equals(p2.nombre) && this.apellido.equals(p2.apellido) && this.nacionalidad.equals(p2.nacionalidad))
            resultado = true;
        
        return resultado;
    }



    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        Pasajero.cod = cod;
    }

    public int getNum_cod() {
        return num_cod;
    }

    public void setNum_cod(int num_cod) {
        this.num_cod = num_cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isCamarote() {
        return camarote;
    }

    public void setCamarote(boolean camarote) {
        this.camarote = camarote;
    }

    


    
}
