import java.util.Scanner;

public class VeinteEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Nota prim trimestre:");
        Scanner sc = new Scanner(System.in);
        double primNota = sc.nextDouble();
        System.out.println("Nota seg Trimestre:");
        double segNota = sc.nextDouble();
        System.out.println("Nota ter trimestre:");
        double terNota = sc.nextDouble();
        System.out.println("Cual ha sido tu renta este año?");
        double renta = sc.nextDouble();
        sc.close();

        double notaMedia = (primNota + segNota + terNota) / 3;

        System.out.println(((notaMedia >= 8 && renta < 20000)) || (notaMedia >= 5 && renta < 5000)
                                                     ? "Tienes derecho a beca" : "No tienes derecho a beca"); 
    }    
}
