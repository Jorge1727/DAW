public class math 
{
    public static void main(String[] args) 
    {
        //num pi
        System.out.println("PI = " + Math.PI);

        //absoluto
        float dec = 23.35535f;
        float dec2 = 23.434334f;
        float dec3 = -23.4535345f;

        System.out.println(dec + ": " + Math.abs(dec));
        System.out.println(dec2 + ": " + Math.abs(dec2));
        System.out.println(dec3 + ": " + Math.abs(dec3));

        //pow elevado a 
        System.out.println("2 elevado a 4\n" + Math.pow(2, 4));
        double resultado = Math.pow(2, 4);

        //sqrt
        double raizCuadrada = Math.sqrt(resultado);
        System.out.println(raizCuadrada);

        //random
        double aleatorio = Math.random();
        System.out.println("Aleatorio: "+ aleatorio);
        double aleatorio2 = Math.random();//pa hacer de 0 a 100
        aleatorio2 = aleatorio2 * 100;   
        System.out.println("Aleatorio: "+ aleatorio2);
        double aleatorio3 = (Math.random() * 50) + 50; 
        
        System.out.println("Aleatorio: "+ aleatorio3);

        //Redondeado al mas cercano
        int rd1 = Math.round(dec);
        int rd2 = Math.round(dec2);
        System.out.println(rd1 + "\n" + rd2);//y para redondar hacia abajo FLOOR, y para arriba se usa CEIL

        //con un casting solo cogo us parte entera sin redondeo ..... int parteEntera = (int)dec;
       

        //Max y MIn
        int min = Math.min(60, 26);
        int max = Math.max(89, 44);
        System.out.println(min + " es min y el max " + max);

        //tres players tiran un dado, 1 al 6(3 veces cada uno)

        int tiradas;

        for(tiradas = 1; tiradas <= 3; tiradas++)
        {
            int player1 = (int)Math.ceil(Math.random() * 6);
            int player2 = (int)Math.ceil(Math.random() * 6);
            int player3 = (int)Math.ceil(Math.random() * 6);

            int min1 = Math.min(player1, player2);
            int minTot = Math.min(min1, player3);
            //O- int resMin = Math.min(player1, player2);
            //resMin = Math.min(min1, player3);
            //O- int resMin = Math.min(player3, Math.max(player1, player2)); LA MEJOR!!!!
            int max1 = Math.max(player1, player2);
            int maxTot = Math.max(max1, player3);

            System.out.println("\nj1: " + player1 + ", j2: " + player2 + " y j3: "+ player3);
            System.out.println("El num min ha sido de: " + minTot + ", y el max: " + maxTot);
        }
    }   
}
