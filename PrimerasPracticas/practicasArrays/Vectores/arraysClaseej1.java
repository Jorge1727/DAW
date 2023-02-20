public class arraysClaseej1 
{
    public static void main(String[] args) 
    {
        //Array de tipo entero
        int[] edades =  new int[5];

        int posicion = 2;
        edades[posicion] = 18;

        //Array tipo cadena
        String[] nombres = new String[10];

        nombres[posicion] = "kiwi";

        System.out.println("edad en posicion 2 " + edades[posicion]);
        System.out.println("edad en posicion 3 " + edades[posicion + 1]);

        System.out.println("edad en posicion 2 " + nombres[posicion]);
        System.out.println("edad en posicion 3 " + nombres[posicion + 1]);

        //_----------------------------------------------------------

        int[] edades2;

        edades2 = edades;

        edades2[3] = 20;
        
        System.out.println("edades2 en posicion 2 " + edades2[posicion + 1]);
        System.out.println("edad en posicion 2 " + edades[posicion + 1]);
    }    
}
