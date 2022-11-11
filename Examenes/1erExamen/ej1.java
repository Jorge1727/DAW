import java.util.Scanner;

public class ej1 
{
    public static void main(String[] args) 
    {
        String str = "\"El Viajero a través del Tiempo (pues convendrá llamarle así al hablar de él) nos exponía una misteriosa cuestión. Sus ojos grises brillaban lanzando centellas, y su rostro, habitualmente pálido, mostrábase encendido y animado. El fuego ardía fulgurante y el suave resplandor de las lámparas incandescentes, en forma de lirios de plata, se prendía en las burbujas que destellaban y subían dentro de nuestras copas. Nuestros sillones, construidos según sus diseños, nos abrazaban y acariciaban en lugar de someterse a que nos sentásemos sobre ellos; y había allí esa sibarítica atmósfera de sobremesa, cuando los pensamientos vuelan gráciles, libres de las trabas de la exactitud.(La maquina del tiempo, H.G.Wells)\"";
        
        System.out.println("-----------RANDOM CHAR---------------");
        int lenght = str.length();
        int numAleatorio = (int)(Math.random() * lenght);
        char randomChar = str.charAt(numAleatorio);

        System.out.println((randomChar == ' ') ? "ESPACIO" : "El caracter aleatorio es: " + randomChar);

        System.out.println("----------REPLACE----------");
        System.out.println("Di un caracter");
        Scanner sc = new Scanner(System.in);
        char chrToReplace = sc.nextLine().charAt(0);
        //Si queremos sustituir tambien las mayusculas E, solo debemos convertir el str a tolower case pero solo dice e minusculas
        String strMod = str.replace('e', chrToReplace);

        System.out.println("El string modificado sustituyendo las -e por el caracter elegido que es "+ chrToReplace + ", quedaria asi: " + strMod);
        
        System.out.println("----------PALABRA EN EL TEXTO?------------");
        System.out.println("\nDi una palabra");
        String palabraSC = sc.next();
        palabraSC = palabraSC.toLowerCase();
        str = str.toLowerCase();
        sc.close();

        int posPalabraSC = str.indexOf(palabraSC);
        
        System.out.println(((posPalabraSC >= 0) ? palabraSC + " Si esta" : palabraSC + " No esta"));
    }    
}
