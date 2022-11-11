import java.util.Scanner;

public class diasSemana 
{
    public static void main(String[] args) 
    {
        int dia = 5;

        switch (dia)
        {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;    
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
            case 7:
                System.out.println("Finde");
                break;
            default:
                System.out.println("error");
        }

        //------------------Ejer con scanneerr-----------------

        System.out.println("di dia semana");
        Scanner sc = new Scanner(System.in);
        String diaSem = sc.next();
        diaSem = diaSem.toLowerCase();
        String tienesQueT = "Tienes que trabajar";
        sc.close();

        int diasHastaFS = 0;

        switch (diaSem)
        {
            case "lunes":
                diasHastaFS++;
            case "martes":
                diasHastaFS++;
            case "miercoles":
                diasHastaFS++;
            case "jueves":
                diasHastaFS++;
            case "viernes":
                diasHastaFS++;
                System.out.println(tienesQueT + ", te faltan " + diasHastaFS + " hasta el finde");
                break;
            case "sabado":
            case "domingo":
                System.out.println("no trabajas");
                break;
            default:
                System.out.println("error");
        }
    }    
}


