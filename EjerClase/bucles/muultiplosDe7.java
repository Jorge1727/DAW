import java.util.Scanner;

public class muultiplosDe7 
{
    public static void main(String[] args) 
    {
        System.out.println("Di hasta que num");
        Scanner sc = new Scanner(System.in);
        int nFinal = sc.nextInt();
        sc.close();
        
        for(int i = 0;i < nFinal;i +=7)
        {
            System.out.println(i + " = actualizando cont");
        }

        //--------------------o--------------

        for(int i = 0; i < nFinal; i++)
        {
            int mod = (i % 7);

            if(mod == 0)
            {
                System.out.println(i + " = con modulo");
            }
        }
    }    
}
