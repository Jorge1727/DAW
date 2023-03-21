package FrioMijas.RRHumanos;

class Password 
{
    //Atributos
    private int longitud;
    private String contraseña;

    //Constructor
    Password(int longitud, String contraseña) 
    {
        this.longitud = longitud;
        this.contraseña = contraseña;
    }

    Password(int longitud) 
    {
        this.longitud = longitud;
    }
    
    //Metodos
    
    public String getContraseña() {
        return contraseña;
    }

    void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    int getLongitud() {
        return longitud;
    }

    @Override
    public String toString()
    {
        return this.contraseña;
    }
    
    
    
    

}
