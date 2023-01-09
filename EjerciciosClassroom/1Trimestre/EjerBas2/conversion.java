public class conversion 
{
    public static void main(String[] args) {
        
        float decimal = 100.04f;
        int entero = 1;

        //decimal = entero; HACEMOS CASTING
        entero = (int)decimal;

        System.out.println(decimal);
        System.out.println(entero);
    }    
}
