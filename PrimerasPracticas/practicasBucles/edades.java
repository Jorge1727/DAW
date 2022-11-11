import java.util.Scanner;

public class edades 
{
    //introd edades quw me diga max y min para cuando el user  pone -1
    public static void main(String[] args) 
    {
        int edadMax = 0;
        int edadMin = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("intoduce  una edad");
        int edad = sc.nextInt();

        edadMax = edad;
        edadMin = edad;
        while(edad > -1)
        {
            if(edad > edadMax)             //o edadminima = math.min(edadmin, edad);
                edadMax = edad;
            else if(edad < edadMin)
                edadMin = edad;
            System.out.println("di otra edad");
            edad = sc.nextInt();
        }

        if(edadMax <= -1)
        {
            System.out.println("no has metido ninguna edad valida");
        }
        else
        {
            System.out.println("la edad max = " + edadMax);
            System.out.println("la edad min = " + edadMin);
        }
        sc.close();
    }    
}
