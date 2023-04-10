package AsuntosSociales.Equipo;

import AsuntosSociales.Usuarios.Menor;
import AsuntosSociales.Usuarios.Usuario;

public class AsuntosSociales 
{
    //Atributos
    private String nombre;
    private String direccion;
    private Trabajador[] trabajadores;
    private Usuario[] usuarios;
    
    //Constructor
    public AsuntosSociales(String nombre, String direccion) 
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.trabajadores = new Trabajador[0];
        this.usuarios = new Usuario[0];
    }

    public boolean contratarTrabajador(Trabajador trabajador)
    {
        // boolean estaba = false;
        boolean resultado = false;

        // for (int i = 0; i < this.trabajadores.length; i++) 
        // {
        
        //     if(this.trabajadores[i].equals(trabajador));
        //     {
        //         estaba = true;
        //     }
        // }

        // if(estaba == false)
        // {
            Trabajador[] trabajadoresFinales = new Trabajador[this.trabajadores.length + 1];

            for (int j = 0; j < this.trabajadores.length; j++) 
            {
                trabajadoresFinales[j] = this.trabajadores[j];
            }

            trabajadoresFinales[trabajadoresFinales.length-1] = trabajador;

            this.trabajadores = trabajadoresFinales;

            resultado = true;
        //}

        return resultado;

    }

    public boolean insertarUsuario(Usuario usuarioo)
    {
        // boolean estaba = false;
        boolean resultado = false;

        // for (int i = 0; i < this.usuarios.length; i++) 
        // {
        
        //     if(this.usuarios[i].equals(usuarioo));
        //     {
        //         estaba = true;
        //     }
        // }

        // if(estaba == false)
        // {
            Usuario[] usuariosFinales = new Usuario[this.usuarios.length + 1];

            for (int j = 0; j < this.usuarios.length; j++) 
            {
                usuariosFinales[j] = this.usuarios[j];
            }

            usuariosFinales[usuariosFinales.length-1] = usuarioo;

            this.usuarios = usuariosFinales;

            resultado = true;
        // }

        return resultado;
    }

    public void mostrarUsuarios()
    {
        String resultado =  "";
        
        for (int i = 0; i < this.usuarios.length; i++) 
        {
            resultado += (i+1) + " " + this.usuarios[i].muestraInformacion() + "| \n";
        }

        System.out.println(resultado);
    }

    public void muestraTrabajadores()
    {
        String resultado = "";

        for (int i = 0; i < this.trabajadores.length; i++) 
        {
            resultado += (i+1) + " " + this.trabajadores[i] + ", titulo: "+ this.trabajadores[i].getAñoTitulacion() + ", Sueldo: " + this.trabajadores[i].getSueldo() +"| \n";
        }

        System.out.println(resultado);
    }

    public String listadoUsuarios()
    {
        String menores = "\nMenores: ";
        String familia = "\nFamilia: ";
        String mujer = "\nMujer: ";
        String resultado ="";


        for (int i = 0; i <  4; i++) 
        {
            menores += usuarios[i].muestraInformacion();
        }

        for (int i = 4; i <  9; i++) 
        {
            familia += usuarios[i].muestraInformacion();
        }

        for (int i = 0; i <  3; i++) 
        {
            mujer += usuarios[i].muestraInformacion();
        }

        resultado = menores + familia + mujer;

        return resultado;

    }

    public void muestraInfoUsurio(Usuario usuario)
    {
        System.out.println("Codigo: "+ usuario.getNum_cod() + "; Nombre" + usuario.getNombre() + "; Apellido: " + usuario.getApellidos() + " - Tipo: " + usuario.getTrabajadorAsignado().getTipo() + " de la trabajadora: " + usuario.getTrabajadorAsignado());
    }

    public void obtenerUsuario(String dni)
    {
        for (int i = 0; i < usuarios.length; i++) 
        {
            if(usuarios[i].getDni().equals(dni))
            {
                System.out.println(usuarios[i]);
            }    
        }
    }

    
}
