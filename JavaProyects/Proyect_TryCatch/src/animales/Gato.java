package animales;

public class Gato 
{
    //A
    private String nombre;
    private String sexo;

    //C
    public Gato(String nombre, String sexo) 
    {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //M
    @Override
    public String toString() {
        return this.nombre + " ("+ this.sexo + ")";
    }

    public Gato apareaCon(Gato pareja)
    {
        Gato hijo = null;

        try 
        {
            if(this.sexo.equals(pareja.sexo))
            {
                throw new ExceptionApareamientoImposible(this.nombre, pareja.nombre);
            }
            else
            {
                hijo = new Gato(this.nombre + " Junior", this.sexo);
            }
        } catch (ExceptionApareamientoImposible exAparea) 
        {
            System.out.println(exAparea.getMessage());
        }
        
        return hijo;
    }

    public String getNombre() {
        return nombre;
    }


    public String getSexo() {
        return sexo;
    }

    
    
}
