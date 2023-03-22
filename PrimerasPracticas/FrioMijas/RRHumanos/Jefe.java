package FrioMijas.RRHumanos;

public class Jefe extends Empleado 
{
    //Atributos
    private Password pswd;
    private int num_cod;

    //Constructor
    public Jefe(String nombre, String apellido, int edad, double salario, String dni) 
    {
        super(nombre, apellido, edad, salario, dni);
        this.num_cod = getCodigo() + 1;

        setCodigo(this.num_cod);
    }

    //Metodos

    @Override
    public String toString()
    {
        return "Nombre del Jefe: " + this.nombre + " con contraseña: " + this.pswd;
    }

    public boolean esFuerte()
    {
        String contra = pswd.getContraseña();
        
        boolean resultado = false;
        int mayus = 0;
        int minus = 0;
        int num = 0;

        for (int i = 0; i < contra.length(); i++) 
        {
            if(contra.charAt(i) >= 65 && contra.charAt(i) <= 90)
                mayus++;
            else if(contra.charAt(i) >= 97 && contra.charAt(i) <= 122)
            {
                minus++;
            }
            else if(contra.charAt(i) >= 48 && contra.charAt(i) <= 57)
            {
                num++;
            }
        }

        if(mayus >= 2 && minus >= 1 && num >=5)
        {
            resultado = true;
        }
        
        return resultado;
    }

    public Password generaPassword(int longitud)
    {
        
        int i = 0;
        String contra = "";
        char c;

        while(i < longitud)
        {
            //He utilizado la tabla ASCII y he jugado con los chars etc.
            int rndm = (int)(Math.random() * 74) + 48;

            if((rndm >= 48 && rndm <= 57) || (rndm >= 65 && rndm <= 90) || (rndm >= 97 && rndm <= 122))
            {
                c = (char)(rndm);
                contra += c;
                i++;
            }
        }

        pswd = new Password(longitud, contra);


        return pswd;
    }

    public Password generaPassword()
    {
        
        int i = 0;
        String contra = "";
        char c;

        while(i < pswd.getLongitud())
        {
            int rndm = (int)(Math.random() * 74) + 48;

            if((rndm >= 48 && rndm <= 57) || (rndm >= 65 && rndm <= 90) || (rndm >= 97 && rndm <= 122))
            {
                c = (char)(rndm);
                contra += c;
                i++;
            }
        }

        pswd = new Password(pswd.getLongitud(), contra);


        return pswd;
    }
    
}
