import animales.Gato;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Gato gata1 = new Gato("Lulu", "hembra");
        Gato gato1 = new Gato("Lolo", "macho");
        Gato gato2 = new Gato("Pepe", "macho");

        System.out.println("- " + gato1.apareaCon(gata1));
        System.out.println("- " + gato1.apareaCon(gato2));
    }
}
