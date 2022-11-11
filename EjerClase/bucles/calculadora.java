import java.util.Scanner;

//haceeer
public class calculadora 
{
    public static void main(String[] args) 
    {
        String signo = "";
        int n1 = 0;
        int n2 = 0;

        System.out.println("----CALCULADORA------");
        Scanner sc = new Scanner(System.in);
        
        int oper = 1;
        do
        {
            //menu
            //segun la opcioncomprobar
            //operadores
            //preguntar nums

            System.out.println("1-suma 2 resta 3 multi 4 div; 0 para salir");
            oper = sc.nextInt();

            switch(oper)
            {
                case 0:
                    oper = 0;
                    break;
                case 1:
                    oper = n1 + n2;
                    signo = " + ";
                    break;
                case 2:
                    oper = n1 - n2;
                    signo = " - ";
                    break;
                case 3:
                    oper = n1 * n2;
                    signo = " * ";
                    break;
                case 4:
                    oper = n1 / n2;
                    signo = " / ";
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }

            if(oper > 0 && oper <= 4)
            {
                System.out.println(n1 + signo + n2 + " = " + oper);
            }
            
            
            System.out.println("pulse  una tecla para continuar");
            oper = sc.nextInt();

        }while(oper != 0);
        sc.close();
    }    
}
