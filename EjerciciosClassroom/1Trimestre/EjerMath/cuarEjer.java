public class cuarEjer 
{
    public static void main(String[] args) 
    {
        double random = Math.random();

        System.out.println("El round se acerca al mascercano (0 o 1): " + Math.round(random) + 
                "\nEl floor redondea para abajo(0): " + Math.floor(random) + "\nEl ceil red hacia arriba (1): " + Math.ceil(random));
    }
}
