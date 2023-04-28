package Matrix.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

import Matrix.Personajes.Neo;
import Matrix.Personajes.Personajes;
import Matrix.Personajes.PersonasGenericas;
import Matrix.Personajes.Smith;

public class Matrix
{
    public static void main(String[] args) 
    {
        Neo neo = new Neo("NEO", "Fuengirola", 4);
        Smith smith = new Smith("Smith", "Mijas", 3);

        ArrayList<PersonasGenericas> factoriaDePersonas = factoriaPersonas(50);
        LinkedList<Personajes> matrix = new LinkedList<>();

        for (int i = 0; i < 18; i++) 
        {
            PersonasGenericas persona = factoriaDePersonas.get(i);
            matrix.add(persona);
            factoriaDePersonas.remove(i);
        }
        
        matrix.add(neo);
        matrix.add(smith);
        Collections.shuffle(matrix);
        
        System.out.println(matrix);

        int juego = 30;

        //JUEGO
        for (int i = 1; i <= juego; i++)
        {
            //Cada iteracion comprueba probabilidad de morir y sustituira o no
            sustituye(matrix, factoriaDePersonas);
          
            //Cada dos iteraciones Smith infectará
            if(i %  2 == 0)
            {
                
                ListIterator<Personajes> iterador = matrix.listIterator();

                while(iterador.hasNext())
                {
                    Personajes p=iterador.next();

                    if(p.getClass().getSimpleName().equals("Smith") && iterador.hasNext() && iterador.next().getClass().getSimpleName().equals("PersonasGenericas"))
                    {
                        p = iterador.previous();
                        Smith s = (Smith)(p);

                        int radioInfeccion = (int)((Math.random() * smith.getPoderDeInfeccion()) + 1);

                        for (int j = 0; j < radioInfeccion; j++) 
                        {
                            if(iterador.hasNext())
                            {

                                p = iterador.next();
                                PersonasGenericas persona = (PersonasGenericas)p;
                                Smith smith2 = infectar(persona);
                                
                                iterador.remove();
                                iterador.add(smith2);
                                  
                            }
                            else
                                j = radioInfeccion - 1;
                        }
                    }
                }
                
            
            }

            //Cada 5 iteraciones Neo actuará
            // if(i % 5 == 0)

            
            System.out.println(matrix);
        } 
        
    }
    
    static ArrayList<PersonasGenericas> factoriaPersonas(int cantidad)
    {
        String[] ciudades = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};
        String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};

        ArrayList<PersonasGenericas> totalPersonas =  new ArrayList<>();
        
        for (int i = 0; i < cantidad; i++) 
        {
            PersonasGenericas persona = new PersonasGenericas(nombres[(int)(Math.random() * nombres.length)], ciudades[(int)(Math.random() 
                                                        * ciudades.length)], (int)(Math.random() * 101));
            totalPersonas.add(persona);   
        }
        
        return totalPersonas;
    }

    static void sustituye(LinkedList<Personajes>matrix, ArrayList<PersonasGenericas>personasGenericas)
    {
        ListIterator<Personajes> iterador = matrix.listIterator();
        

        while(iterador.hasNext()) 
        {
            Personajes p=iterador.next();

            if(p.getClass().getSimpleName().equals("PersonasGenericas"))
            {
                PersonasGenericas persona = (PersonasGenericas)(p);    
                
                if(persona.getProbabilidadDeMorir() < 30)
                {
                    PersonasGenericas nuevaPersona = personasGenericas.get((int)(Math.random() * personasGenericas.size()));
                    
                    iterador.remove();
                    iterador.add(nuevaPersona);
                    
                    personasGenericas.add(persona);
                    personasGenericas.remove(nuevaPersona);
                }
                else 
                {
                    persona.setProbabilidadDeMorir(persona.getProbabilidadDeMorir() - 10);
                }
            }
        }
    }

    static Smith infectar(PersonasGenericas p)
    {
        return new Smith(p.getNombre(), p.getNombreCiudad(), 3, p.getCod());          
    }
}