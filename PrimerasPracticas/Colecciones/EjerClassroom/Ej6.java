package Colecciones.EjerClassroom;

import java.util.HashMap;
import java.util.Scanner;

public class Ej6 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        HashMap<String, String> claves = new HashMap<>();

        claves.put("root", "1234");
        claves.put("admin", "asdf");

        int intentos = 0;
        boolean contrCorrecta = false;
        
        do
        {
            System.out.println("Usuario...");
            String usuarioIntroducido = sc.nextLine();
            
            System.out.println("Contraseña...");
            String passIntroducido = sc.nextLine();
        
            if(claves.containsKey(usuarioIntroducido))
            {
                if(claves.get(usuarioIntroducido).equals(passIntroducido))
                    contrCorrecta = true;
                else 
                {
                    intentos++;
                    System.out.println("Incorrecto te quedan " + intentos + " intentos");
                }
            }
            else 
            {
                intentos++;
                System.out.println("Incorrecto te quedan " + intentos + " intentos");
            }
        
        
        }while((contrCorrecta == false) && intentos < 3);
        
        if(contrCorrecta = true)
            System.out.println("Bienvenido");
        else 
            System.out.println("Intentos agotados , no entras");
    }    
}
