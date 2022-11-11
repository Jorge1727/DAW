import java.util.Scanner;

public class diasDelMes 
{
    public static void main(String[] args) 
    {
        System.out.println("Di un mes");
        Scanner sc = new Scanner(System.in);
        String mes = sc.next();
        mes = mes.toLowerCase();
        sc.close();

        switch (mes) 
        {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("Tiene 31 dias");
                break;
            case "febrero":
                System.out.println("Tiene 29 dias");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("Tiene 30 dias");
                break;
            default:
                System.out.println("error");
                break;
        }
    }    
}
