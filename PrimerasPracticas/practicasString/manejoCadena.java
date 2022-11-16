public class manejoCadena 
{
    public static void main(String[] args) 
    {
        System.out.println("**********charAt********");//***para devolver un caracter*****

        String str = "HolA mUndo";

        int index = 3;
        char chr = str.charAt(index);
        System.out.println(chr);

        System.out.println("*******compareTo*********");//*****para comparacion*******

        String str1 = "hola";
        String str2 = "holA";

        System.out.println((str1 == str2) ? "IGUALES" : "DIFERENTES");
        //System.out.println((str1 == "hola")? "IGUALES" : "DIFERENTES");
        //System.out.println(str1.compareTo(str2));
        System.out.println((str1.compareTo(str2)) == 0 ? "IGUALES" : "DIFERENTES");
        System.out.println((str1.compareToIgnoreCase(str2) == 0) ? "IGUALES" : "DISTINTAS");

        String ap1 = "Lopez";
        String ap2 = "Gomez";
        System.out.println((ap1.compareTo(ap2) > 0) ? ap1 + " esta segundo " : ap2 + " esta primero ");

        System.out.println("************lenght************");

        int lenght = ap1.length();
        System.out.println("la cadena tiene " + lenght);
        //para sacar el ult char
        char ult = ap1.charAt(lenght-1);
        System.out.println("el ult char del apellido es: " + ult);

        System.out.println("*********indexOf*************");//indica en que posicion esta un char, str..... 

        int posicionM = str.indexOf('m');
        System.out.println("la letra m esta en la posicion: " + posicionM);

        char letraO = 'o';
        int posicionO = str.indexOf(letraO);
        int posicionOO = str.indexOf(letraO, posicionO+1);
        int posicionOOO = str.indexOf(letraO, posicionOO + 1);

        System.out.println("la primera o esta en la pos: " + posicionO + ", la segunda o esta en: "+ posicionOO + ", y la tercera " + posicionOOO);

        String lugar = "mundo";
        int posLugar = str.indexOf(lugar);
        System.out.println(((posLugar >= 0) ? lugar + " Si" : lugar + " NO") + " está en el str");

        String lugarMinuscula = lugar.toLowerCase();
        String strMayuscula = str.toLowerCase();
        posLugar = strMayuscula.indexOf(lugarMinuscula);
        System.out.println((posLugar >= 0) ? lugar + " SI ": lugar + "NO");

        System.out.println("************remplace*************");//reemplazar

        String holaMundo2 = "hola mundoo";
        String cadMod = holaMundo2.replace('n', 'X'); // OOOOOOO si solo queremos reemplazar la primera letra y no todas remplaceFirst
        System.out.println(cadMod);

        String holaMundo3 = "hola mundoo";
        String cadMod2 = holaMundo3.replace("hola", "adios");
        System.out.println(cadMod2);
        
        System.out.println("****************trim***************");//eliminar espacios delante y atras

        String saludo = "      hola y adios      ";
        System.out.println("-" + saludo + "-");
        System.out.println("-" + saludo.trim() + "-");

        System.out.println("****************split***************");//cortar un str

        String holaMundo4 = "hola mundo grande";
        String[] trozos = holaMundo4.split("mundo");
        int cantTrozos = trozos.length;
        System.out.println("Partiendo el str desdde \"mundo\" me salen" + cantTrozos);
        String trozo0 = trozos[0];
        String trozo1 = trozos[1];
        System.out.println("El trozo 0 es: " + trozo0);
        System.out.println("El trozo 1 es: " + trozo1);

        System.out.println("*************substring****************");

        String cadenaDesde5 = holaMundo4.substring(5);
        System.out.println("el str desde 5 es: " + cadenaDesde5);//puedo decir hasta donde llegar con substring(_,_)

        System.out.println("******************concat*******************");

        String saludo1 = "hola";
        String nombres2 = " juan";

        String saludoCompleto = saludo1 + nombres2;
        System.out.println(saludoCompleto);
        System.out.println(saludo1.concat(nombres2));

        System.out.println("********************valueof***************");//para cambiar de float a string

        float pi = 3.1416f;
        String PI = String.valueOf(pi);
        System.out.println(PI);

        System.out.println("**************stringbuffer****************");//mod cadenas forma especial decirle pos y cadena y te hace la inserccion de la posicion
        
        StringBuffer sBuffer = new StringBuffer(holaMundo4);
        //a hola mundo le añado la cadena
        sBuffer.setCharAt(1, 'G');
        System.out.println(sBuffer);

        sBuffer.insert(7, "Don Quijote");
        System.out.println(sBuffer);

        String cadena1 = "hola";
        String cadena2 = "hola";

        if (cadena1 == cadena2)
        {
            System.out.println("iguales");
        }
        if (cadena1.equals(cadena2))
        {
            System.out.println("equals");
        }
    }
}
