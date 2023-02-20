package ClasesT6.Clases;

public class Persona 
{
    //Atributos de la clase (antes )
    public String nombre;
    private String apellidos;
    public int edad;
    public int estatura;
    private String dni;


    
    //Set and gets---------------------------------------- para editar un atributo privado

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // ---------------------------------------------------------------


    //Contructores (Funciones ahora se llama metodos)
    public Persona(String nombree, String apellido)
    {
        this.nombre = nombree;
        this.apellidos = apellido;
    }

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad  = edad;
    }

    //metodos
    void saludar()
    {
        System.out.println("Hola soy " + nombre);
    }

    void cumlirAños()
    {
        edad++;
    }

    void cambiarNombre(String nombre)
    {
        this.nombre = nombre;
    }

    void cambiarPersona(Persona p1)
    {
        this.nombre = p1.nombre;
        this.edad = p1.edad;
    }

    //metodo estatico

    static String QueDiaEs()
    {
        String resultado = "Estoy bien";

        return resultado;
    }

    
}
