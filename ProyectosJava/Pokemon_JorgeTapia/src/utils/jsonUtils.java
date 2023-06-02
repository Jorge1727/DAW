package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import clases.Evolution;
import clases.Pokedex;
import clases.Pokemon;
import recursos.ComparadorNombre;

public class jsonUtils 
{

    public static Pokedex leerPokemon()
    {
        String ruta ="src/recursos/pokemon.json";
        
		File ficheroPokemon = new File(ruta);
		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		// convert json string to object
		Pokedex pokedex = null;
		try 
        {
			pokedex = objectMapper.readValue(ficheroPokemon, Pokedex.class);
		} catch (Exception e) 
        {
			e.printStackTrace();
		}

		return pokedex;
    }

    public static ArrayList<Pokemon> ultCincoPokemons(Pokedex pokedex) 
    {
        ArrayList<Pokemon> resultado = new ArrayList<>();

        int size = pokedex.getPokemon().size();

        for (int i = size - 5; i < size; i++) 
        {
            Pokemon pokemon = pokedex.getPokemon().get(i);
            resultado.add(pokemon);
        }

        return resultado;
    }

    public static Pokemon buscarPokemon(Pokedex pokedex, String nombre)
    {
        //El comparator es el siguiente metodo, justo abajo
        ArrayList<Pokemon> pokemons = new ArrayList<>(pokedex.getPokemon());
        
        ComparadorNombre comparadorNombre = new ComparadorNombre();
        Collections.sort(pokemons, comparadorNombre);

        int posicionEncontrada = Collections.binarySearch(pokemons, new Pokemon(nombre), comparadorNombre);
        Pokemon picachu = pokemons.get(posicionEncontrada);
        
        return picachu;
    }

    public static ArrayList<Evolution> evolucionPokemon(Pokedex pokedex, String nombre) 
    {
        Pokemon charmander = buscarPokemon(pokedex, nombre);

        ArrayList<Evolution> resultado = charmander.getNext_evolution();
    
        return resultado;
    }

    public static ArrayList<Pokemon> tiposPokemon(Pokedex pokedex, String tipo) 
    {
        ArrayList<Pokemon> pokemons = new ArrayList<>(pokedex.getPokemon());
        ArrayList<Pokemon> resultado = new ArrayList<>();
        
        for (int i = 0; i < pokemons.size(); i++) 
        {
            ArrayList<String> type = pokemons.get(i).getType();

            if(type.contains(tipo))
            {
                resultado.add(pokemons.get(i));
            }
        }
    
        return resultado;
    }

    public static ArrayList<Pokemon> debilidadPokemon(Pokedex pokedex, String debilidad1, String debilidad2, String debilidad3) 
    {
        ArrayList<Pokemon> pokemons = new ArrayList<>(pokedex.getPokemon());
        ArrayList<Pokemon> resultado = new ArrayList<>();
        
        for (int i = 0; i < pokemons.size(); i++) 
        {
            ArrayList<String> weak = pokemons.get(i).getWeaknesses();

            if(weak.contains(debilidad1) || weak.contains(debilidad2) || weak.contains(debilidad3))
            {
                resultado.add(pokemons.get(i));
            }
        }
    
        return resultado;
    }

    public static Pokemon pokemonConMasDebilidades(Pokedex pokedex) 
    {
        ArrayList<Pokemon> pokemons = new ArrayList<>(pokedex.getPokemon());
        int posicion = 0;
        int mayor = 0;
        
        for (int i = 0; i < pokemons.size(); i++) 
        {
            int debilidades = pokemons.get(i).getWeaknesses().size();

            if(i == 0)
            {
                mayor = debilidades;
            }

            if(debilidades > mayor)
            {
                posicion = i;
                mayor = debilidades;
            }
        }

        return pokemons.get(posicion);
    }

    public static Pokemon pokemonConMasAlto(Pokedex pokedex) 
    {
        ArrayList<Pokemon> pokemons = new ArrayList<>(pokedex.getPokemon());
        int posicion = 0;
        double mayor = 0;
        

        for (int i = 0; i < pokemons.size(); i++) 
        {
            String[] split = pokemons.get(i).getHeight().split(" ");

            String alturaStr = split[0];
            Double altura = Double.parseDouble(alturaStr);
            
            if(i == 0)
            {
                mayor = altura;
            }

            if(altura > mayor)
            {
                posicion = i;
                mayor = altura;
            }
        }

        return pokemons.get(posicion);
    }



    

}

    

