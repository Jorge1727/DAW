import java.util.Scanner;

public class ej23 
{
    public static void main(String[] args) 
    {
        int cont = 0;
        int sumaNum = 0;

        Scanner sc = new Scanner(System.in);
        
        while(sumaNum <= 10000)
        {
            System.out.println("Introduce numero");
            int num = sc.nextInt();

            sumaNum += num;
            cont++;
        }
        sc.close();

        int media = (sumaNum / cont);

        System.out.println("El total acumulado es de: " + sumaNum + "\nEl contador es de: " + cont + "\nY la media es de: " + media);
    }    
}
