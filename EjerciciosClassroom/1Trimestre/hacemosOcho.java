public class hacemosOcho 
{
    public static void main(String[] args) 
    {
        System.out.println();

        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                
                if((i >= 3 && i <= 4) && (j >= 4 && j <= 9))
                {
                    System.out.print(" ");
                }
                else
                    System.out.print("▓");
            }
            System.out.println();
        }

        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                
                if((i >= 1 && i <= 2) && (j >= 4 && j <= 9))
                {
                    System.out.print(" ");
                }
                else
                    System.out.print("▓");
            }
            System.out.println();
        }
    }    
}
