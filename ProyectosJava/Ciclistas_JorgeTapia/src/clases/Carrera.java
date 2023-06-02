package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import Utiles.OrdenaPorTiempo;
import Utiles.Utils;

public class Carrera 
{
    //A
    private ArrayList<Equipo> equipos;
    private ArrayList<Corredor> corredores;
    private String nombre;

    //C
    public Carrera(ArrayList<Ciclista> ciclistas, String nombre) 
    {
        this.equipos = Utils.leerEquipos();
        this.nombre = nombre;
        corredores = new ArrayList<>();

        for (int i = 0; i < ciclistas.size(); i++) 
        {
            this.corredores.add(new Corredor(ciclistas.get(i), i + 1));
        }
    }

    public void insertarTiempoEtapa(HashMap<Integer, Integer>tiempos)
    {
        int max = 0;
        for (int i = 0; i < corredores.size(); i++) 
        {
            Corredor c = corredores.get(i);
            if (tiempos.containsKey(c.getDorsal()))
                max = Math.max(max, tiempos.get(c.getDorsal()));
        }
        
        for (int i = 0; i < corredores.size(); i++) 
        {
            Corredor c = corredores.get(i);
            if (tiempos.containsKey(c.getDorsal())) 
            {
                c.setTiempo(tiempos.get(c.getDorsal()) + c.getTiempo());
                max = Math.max(max, tiempos.get(c.getDorsal()));
            }
            else
            {
                c.setTiempo(max + c.getTiempo());
            }
        }
    }

    public void ordenarCorredoresPorTiempo() 
    {
        Collections.sort(corredores);
    }

    public Corredor buscaCorredorPorDorsal(int dorsal)
    {
        Corredor resultado = null;

        for (int i = 0; i < corredores.size(); i++) 
        {
            if(corredores.get(i).getDorsal() == dorsal)
                resultado = corredores.get(i);
        }

        return resultado;
    }

    public int posicionCorredor(Corredor corredor)
    {
        int posicionEncontrada = Collections.binarySearch(corredores, corredor);

        return posicionEncontrada;
    }

    public String podium()
    {
        String resultado = "";

        for (int i = 0; i < 3; i++) 
        {
            resultado += i+1 + ": " + corredores.get(i) + "\n";
        }

        return resultado;
    }


    @Override
    public String toString() {
        return this.nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(ArrayList<Corredor> corredores) {
        this.corredores = corredores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
