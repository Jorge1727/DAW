import java.util.Scanner;

public class estadistica_IES 
{
    public static void main(String[] args) 
    {
        int sumaEdades = 0;
        int totalAlumnos = 0;
        int media = 0;
        int mayoresEdad = 0;

        System.out.println("Pon edad (para terminar, -1)");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        while(edad != -1)
        {
            if(edad >= 11)
            {
                sumaEdades = sumaEdades + edad;
                totalAlumnos = totalAlumnos + 1;

                if(edad >= 18)
                {
                    mayoresEdad = mayoresEdad + 1;
                }
                System.out.println("otra edad (-1 para terminar)");
                edad = sc.nextInt();
            }
            else
            {
                System.out.println("edad No valida, debe ser mayor a 11, repite");
                edad = sc.nextInt();
            }

        }
        sc.close();

        if(totalAlumnos == 0)
            System.out.println("no has introducido ninguna edad");
        else
        {
            media = sumaEdades / totalAlumnos;
            System.out.println("La suma de las edades es: "+ sumaEdades + "\nMedia es: " + media);
            System.out.println("Total de alumnos: " + totalAlumnos + "\nLos mayores de 18 son: " + mayoresEdad);
            System.out.println("cambio en vstudio");//cambio
            //cambio desde githubb
        }
    }    
}
