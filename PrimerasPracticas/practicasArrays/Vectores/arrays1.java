import javax.swing.JOptionPane;

public class arrays1 
{
    public static void main(String[] args) 
    {
        String[] paises = new String[6];

        /*
        paises[0] = "España";
        paises[1] = "Hawai";
        paises[2] = "Ecuador";
        paises[3] = "Colombia";
        paises[4] = "Chile";
        paises[5] = "venezuela";
        */
        //FORMA SIMPLIFICADA
        //String[] paises = {"España, "Hawai", "Ecuador, "Colombia, Chile, "Venezuela"}

        for(int i = 0; i < 6; i++)
        {
            paises[i] = JOptionPane.showInputDialog("Introduce pais " + (i + 1));
        }

        for(String i:paises)//for mejorado para tema de arrays
        {
            System.out.print(i + " ");
        }
    }    
}
