import java.util.Scanner;

public class DoceEjere 
{
    public static void main(String[] args) 
    {
        System.out.println("Llueve?");
        Scanner sc = new Scanner(System.in);
        boolean llueve = sc.nextBoolean();
        System.out.println("Has acabado las tareas?");
        boolean acabadoTareas = sc.nextBoolean();
        System.out.println("necesitas ir a la biblioteca?");
        boolean neceBiblio = sc.nextBoolean();
        sc.close();

        boolean puedoSalir = ((llueve != true)/*o tamien puedo decir mas facil (!llueve && ...) */ && acabadoTareas) || neceBiblio;
        System.out.println("Puedes salir? " + puedoSalir);
    }    
}
