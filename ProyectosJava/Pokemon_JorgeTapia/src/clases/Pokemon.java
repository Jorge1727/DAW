package clases;

import java.util.ArrayList;

public class Pokemon 
{
    //A
    private int id;
    private String num; 
    private String name; 
    private String img;
    private ArrayList<String> type;
    private String height;
    private String weight;
    private String candy;
    private int candy_count;
    private String egg;
    private String spawn_chance;
    private double avg_spawns; 
    private String spawn_time; 
    private ArrayList<Double> multipliers;
    private ArrayList<String> weaknesses;
    private ArrayList<Evolution> prev_evolution;
    private ArrayList<Evolution> next_evolution;
    
    //C
    public Pokemon() {
    
    }

    public Pokemon(String name)
    {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCandy() {
        return candy;
    }

    public void setCandy(String candy) {
        this.candy = candy;
    }

    public int getCandy_count() {
        return candy_count;
    }

    public void setCandy_count(int candy_count) {
        this.candy_count = candy_count;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public String getSpawn_chance() {
        return spawn_chance;
    }

    public void setSpawn_chance(String spawn_chance) {
        this.spawn_chance = spawn_chance;
    }

    public double getAvg_spawns() {
        return avg_spawns;
    }

    public void setAvg_spawns(double avg_spawns) {
        this.avg_spawns = avg_spawns;
    }

    public String getSpawn_time() {
        return spawn_time;
    }

    public void setSpawn_time(String spawn_time) {
        this.spawn_time = spawn_time;
    }

    public ArrayList<Double> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(ArrayList<Double> multipliers) {
        this.multipliers = multipliers;
    }

    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(ArrayList<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public ArrayList<Evolution> getPrev_evolution() {
        return prev_evolution;
    }

    public void setPrev_evolution(ArrayList<Evolution> prev_evolution) {
        this.prev_evolution = prev_evolution;
    }

    public ArrayList<Evolution> getNext_evolution() {
        return next_evolution;
    }

    public void setNext_evolution(ArrayList<Evolution> next_evolution) {
        this.next_evolution = next_evolution;
    }

    @Override
    public String toString() {
        return "\nPokemon:\n [num=" + num + "\nname=" + name + "\nimg=" + img + "\ntype=" + type + "\nheight=" + height
                + "\nweigh=" + weight + "\ncandy=" + candy + "\ncandy_count=" + candy_count + "\negg=" + egg
                + "\nspawn_chance=" + spawn_chance + "\navg_spawns=" + avg_spawns + "\nspawn_time=" + spawn_time
                + "\nmultipliers=" + multipliers + "\nweaknesses=" + weaknesses + "\nprev_evolution=" + prev_evolution
                + "\nnext_evolution=" + next_evolution + "]";
    }

    
    
    
    
    
}
