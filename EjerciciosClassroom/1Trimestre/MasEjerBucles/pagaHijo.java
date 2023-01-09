public class pagaHijo 
{
    public static void main(String[] args) 
    {
        double gane = 0;
        double paga = 0.05;
        double pagasemana = 0;
        int semana = 1;

        while(gane < 2000)
        {
            pagasemana = paga * 7;

            gane += pagasemana;

            paga *= 2;
            semana++;
        }
        int ganeInt = (int)(gane);

        System.out.println("Tardará " + semana + " semanas, en total ganará: " + ganeInt + "€");
    }    
}
