package clases;

import java.util.ArrayList;

public class Pokedex 
{
    //A
    private ArrayList<Pokemon> pokemo;

    //C
    public Pokedex() {

    }

    //M
    public ArrayList<Pokemon> getPokemon() {
        return pokemo;
    }

    public void setPokemon(ArrayList<Pokemon> pokemo) {
        this.pokemo = pokemo;
    }

    @Override
    public String toString() {
        return "Pokedex [pokemon=" + pokemo + "]";
    }

}
