package clases;

public class Cliente 
{
    //A
    private int codigo;
    private String nombre;
    private String direccion;
    private String email;

    //C
    public Cliente() {
    }

    

    public Cliente(String nombre) {
        this.nombre = nombre;
    }



    //M
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;

        Cliente cliente = (Cliente)(obj);

        if(this.nombre.equals(cliente.getNombre()))
            resultado = true;
        
        return resultado;
    }

    @Override
    public String toString() {
        return "\nCliente [codigo=" + codigo + "\nnombre=" + nombre + "\ndireccion=" + direccion + "\nemail=" + email
                + "]\n";
    }

    
}
