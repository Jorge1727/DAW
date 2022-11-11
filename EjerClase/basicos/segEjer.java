import java.time.LocalTime;
import java.util.Scanner;

public class segEjer 
{
    public static void main(String[] args) 
    {
        System.out.println("Di que hora es");
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        sc.close();

        LocalTime saludo = LocalTime.of(hr, 0);

        if ((hr >= 6) && (hr <= 12))
            System.out.println("Buenos dias " + saludo);
        if ((hr >= 13) && (hr <= 20))
            System.out.println("Buenas tardes " + saludo);
        if ((hr >= 21) && (hr <= 23) || (hr >= 0) && (hr <= 5))
            System.out.println("Buenas noches " + saludo);
    }    
}
