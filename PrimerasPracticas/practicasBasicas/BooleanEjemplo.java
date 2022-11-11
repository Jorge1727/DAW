public class BooleanEjemplo 
{
    public static void main(String[] args) 
    {
        boolean mayorEdad = true;
        boolean carnetConducir = false;
        boolean puedeConducir = mayorEdad && carnetConducir;

        System.out.println("El usuario puede conducir? " + puedeConducir);

        boolean estudiaMucho = false;
        boolean sacoChuleta = true;
        boolean aprueba = estudiaMucho || sacoChuleta;

        System.out.println("Apruebo? " + aprueba);
        //Comento esto para que no este en amarillo es la tabla de la verdad...se pone en amarillo al ser cosas obvias
        /* 
        boolean valorTrue = true;
        boolean valorFalse = false;
        boolean tyt = valorTrue && valorTrue;
        boolean tyf = valorTrue && valorFalse;
        boolean fyf = valorFalse && valorFalse;
        boolean tot = valorTrue || valorTrue;
        boolean tof = valorTrue || valorFalse;
        boolean fof = valorFalse || valorFalse;
        
        System.out.println("v y v: " + tyt + "\nv y f: " + tyf + "\nf y f: " + fyf + "\nv o v: "
                                                    +  tot + "\nv o f: " + tof + "\nf o f: " + fof);
        */
        //QUITAR COMENTARIO PARA QUE FUNCIONE!!!!!!!!!!!!

    }
}
