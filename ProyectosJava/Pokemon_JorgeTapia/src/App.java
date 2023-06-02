import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import clases.Evolution;
import clases.Pokedex;
import clases.Pokemon;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("===================== POKEMONS =========================");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/recursos/consultasPokemon.txt")))
        {
            System.out.println("Toda la informacion esta guardada en el fichero de consultas Pokemon");

            Pokedex pokedex = jsonUtils.leerPokemon();

            bw.write("**********Todos los pokemons:\n");
            
            for (int i = 0; i < pokedex.getPokemon().size(); i++) 
            {
                bw.write(pokedex.getPokemon().get(i).toString());
                bw.newLine();
            }

            ArrayList<Pokemon> ultimosCincoPokemons = jsonUtils.ultCincoPokemons(pokedex);

            bw.write("\n******* Ultimos 5 pokemons:\n");
            bw.newLine();
            bw.write(ultimosCincoPokemons.toString());
            bw.newLine();  

            Pokemon pikachu = jsonUtils.buscarPokemon(pokedex, "Pikachu");

            bw.write("\n***********Posicion de Pikachu:\n");
            bw.newLine();
            bw.write(pikachu.toString());
            bw.newLine();

            ArrayList <Evolution> evolucionCharmander = jsonUtils.evolucionPokemon(pokedex, "Charmander");

            bw.write("\n***********Evolucion de Charmander:\n");
            bw.newLine();
            bw.write(evolucionCharmander.toString());
            bw.newLine();

            ArrayList <Pokemon> tipoFire = jsonUtils.tiposPokemon(pokedex, "Fire");

            bw.write("\n***********Pokemons de tipo Fire:\n");
            bw.newLine();
            bw.write(tipoFire.toString());
            bw.newLine();

            ArrayList <Pokemon> debilidadAguaElecticidad = jsonUtils.debilidadPokemon(pokedex, "Water", "Electric", null);

            bw.write("\n***********Pokemons con debilidad de Agua y Electricidad:\n");
            bw.newLine();
            bw.write(debilidadAguaElecticidad.toString());
            bw.newLine();

            Pokemon masDebilidades = jsonUtils.pokemonConMasDebilidades(pokedex);

            bw.write("\n***********Pokemon con mas debilidades:\n");
            bw.newLine();
            bw.write(masDebilidades.toString());
            bw.newLine();

            Pokemon masAlto = jsonUtils.pokemonConMasAlto(pokedex);

            bw.write("\n***********Pokemon mas alto:\n");
            bw.newLine();
            bw.write(masAlto.toString());
            bw.newLine();
       
        } catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
            System.out.println("Adíos.");

    }
}
