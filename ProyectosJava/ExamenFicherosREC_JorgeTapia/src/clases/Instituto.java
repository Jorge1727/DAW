package clases;

import java.util.ArrayList;

import utiles.NoExisteDniException;

public class Instituto 
{
    //A
    ArrayList<Profesor> profesores;

    public Instituto() {
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Instituto [profesores=" + profesores + "]";
    }

    public ArrayList<Alumno> todosLosAlumnos() 
    {
        ArrayList<Alumno> resultado = new ArrayList<>();

        for (int i = 0; i < profesores.size(); i++) 
        {
            for (int j = 0; j < profesores.get(i).getAlumnos().size(); j++) 
            {
                try 
                {
                    if(profesores.get(i).getAlumnos().get(j).getDni().equals(""))//Si el dni esta vacio lanzamos excepcion
                    {
                        throw new NoExisteDniException(profesores.get(i).getAlumnos().get(j).getNombre());
                    }
                    
                    resultado.add(profesores.get(i).getAlumnos().get(j));    
                    
                    
                } catch (NoExisteDniException e) {
                    System.out.println(e.getMessage());
                }

            }

        }

        return resultado;
    }

    public String alumnosBeca() 
    {
        String resultado = "";
        
        for (int i = 0; i < profesores.size(); i++) 
        {
            for (int j = 0; j < profesores.get(i).getAlumnos().size(); j++) 
            {
                if(profesores.get(i).getAlumnos().get(j).getNotas().containsKey("Ingles"))//Si en ingles y debe ser mayor a 8
                {
                    if(profesores.get(i).getAlumnos().get(j).getNotas().get("Ingles") >= 8)
                    {

                        resultado += profesores.get(i).getAlumnos().get(j).getNombre() + ": nota" + profesores.get(i).getAlumnos().get(j).getNotas()+"\n"; 
                    }
                }   
                
                if(profesores.get(i).getAlumnos().get(j).getNotas().containsKey("Gramatica"))//Si es gramatica y debe ser mayor a 7,5
                {
                    if(profesores.get(i).getAlumnos().get(j).getNotas().get("Gramatica") >= 7.5)
                    {

                        resultado += profesores.get(i).getAlumnos().get(j).getNombre() + ": nota" + profesores.get(i).getAlumnos().get(j).getNotas()+"\n"; 
                    }
                } 
            
            }

        }

        return resultado;
    }

    
}
