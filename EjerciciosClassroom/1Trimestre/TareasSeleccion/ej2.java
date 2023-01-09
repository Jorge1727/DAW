import java.util.Scanner;

public class ej2 
{
    public static void main(String[] args) 
    {
        int animalPorComida = 0;
        int comidaCadaAnimal = 0;
        int comidaQueFalta = 0;
        int comidaParaProxima = 0;

        System.out.println("Cauntos kl de comida hemos comprado?");
        Scanner sc = new Scanner(System.in);
        int comidaDiaria = sc.nextInt();

        System.out.println("A cuantos animales hay que alimentar?");
        int numAnimales = sc.nextInt();

        System.out.println("Que cantidad de kl come cada animal?");
        int kilosPorAnimal = sc.nextInt();
        sc.close();

        animalPorComida = (numAnimales * kilosPorAnimal);

         if(animalPorComida > comidaDiaria)
        {
            comidaQueFalta = animalPorComida - comidaDiaria;
            comidaParaProxima = comidaDiaria + comidaQueFalta;
            comidaCadaAnimal = comidaDiaria / numAnimales;
            System.out.println("No tenemos suficiente, cada animal comerá " + comidaCadaAnimal + " kls, y para la proxima hay que comprar " + comidaParaProxima + " kls.");
        }
        else
            System.out.println("Tenemos suficiente comida");
    }    
}
