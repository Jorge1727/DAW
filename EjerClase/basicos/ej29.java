import java.util.Scanner;

public class ej29 
{
    public static void main(String[] args) 
    {   
        final double P_PALMERA = 1.4;
        final double P_DONUT = 1.0;
        final double P_PITUFO = 1.0;
        final double P_ZUMO = 1.5;
        final double P_CAFE = 1.2;

        double precioComida = 0;
        double precioBebida = 0;
        String seleccion = "";

        System.out.println("¿Que has tomado de comer? (palmera, donut, pitufo)");
        Scanner sc = new Scanner(System.in);
        String comer = sc.nextLine().toLowerCase();

        while((!comer.equals("palmera") && (!comer.equals("donut") && (!comer.equals("pitufo")))))
        {
            System.out.println("Error de selección (palmera, donut, pitufo)");
            comer = sc.nextLine();
        }

        switch(comer)
        {
            case "palmera":
                precioComida = P_PALMERA;
                break;
            
            case "donut":
                precioComida = P_DONUT;
                break;
            case "pitufo":
                precioComida = P_PITUFO;
                break;
        }

        if(comer.equals("pitufo"))
        {
            System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla)");
            seleccion = sc.nextLine().toLowerCase();


            while((!seleccion.equals("aceite") && (!seleccion.equals("tortilla"))))
            {
                System.out.println("Error de selección (aceite, tortilla)");
                comer = sc.nextLine();
            }

            switch(seleccion)
            {
                case "aceite":
                    precioComida += 0.2;
                    comer = "pitufo con aceite";
                    break;

                case "tortilla":
                    precioComida += 0.6;
                    comer ="pitufo con tortilla";
                    break;
            }
        }

        System.out.println("¿Qué ha tomado de beber? (zumo o café)");
        String beber = sc.nextLine().toLowerCase();

        while((!beber.equals("zumo") && (!beber.equals("cafe"))))
        {
            System.out.println("Error de selección (zumo, cafe)");
            comer = sc.nextLine();
        }
        sc.close();

        switch(beber)
        {
            case "zumo":
                precioBebida = P_ZUMO;
                break;

            case "cafe":
                precioBebida = P_CAFE;
                break;
        }

        double total = precioComida + precioBebida;

        System.out.println(comer + ": " + precioComida + "€.\n" + beber + ": " + precioBebida + "€.\nTotal desayuno: " + total + "€.");
    }    
}
