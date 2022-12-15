public class PartidoBaloncesto
{
    
    //Variables de los equipos
    final static int E1_ACIERTO_2 = 70;
    final static int E2_ACIERTO_2= 75;

    final static int E1_ACIERTO_3 = 45;
    final static int E2_ACIERTO_3 = 35;
 
    final static int E1_JUEGA_DE_2 = 60;
    final static int E2_JUEGA_DE_2 = 70;
 
    final static int E1_REBOTE_DEF = 60;
    final static int E1_REBOTE_ATA = 30;
 
    final static int E2_REBOTE_DEF = 70;
    final static int E2_REBOTE_ATA = 40;

    public static void main(String[] args) 
    {
        
        int puntosE1 = 0;
        int puntosE2 = 0;

        System.out.println("Empieza la simulación del partido de baloncesto");

        //salto Inicial
        String turno  = salto();
        System.out.println("Ataca el equipo: " + turno);

        //Un partido de baloncesto hay unas 150 posesiones de media.
        for(int posesion = 0; posesion < 150; posesion++)
        {

            int valorAtaque = canasta(turno);

            //Si hay canasta entonces el turno es del equipo que estaba defendiendo
            if (valorAtaque>0)
            {
                if (turno.equals("E1"))
                {
                    puntosE1 = actualizarPuntos(puntosE1, valorAtaque);
                }
                else 
                {
                    puntosE2 = actualizarPuntos(puntosE2, valorAtaque);
                }
                System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");
                // imprimirResultado(puntosE1, puntosE2);
                turno = siguienteTurno(turno);
                System.out.println("Ataca el equipo: " + turno);
            }
            else 
            {
                //no hay canasta, se  produce un rebote
                turno = rebote(turno);
                System.out.println("Rebote del equipo: " + turno);
            }

            //si hay empate doy 40 posesiones mas
            if (posesion== 149 && puntosE1 == puntosE2)
            {
                System.out.println("EMPATE --- Hay Prorroga");
                posesion= 100;
            }

        }
        System.out.println("-------------------------");
        System.out.println("FIN de partido");
        // imprimirResultado(puntosE1, puntosE2);
        System.out.println(" **** GANA EL EQUIPO: " + (puntosE1>puntosE2 ? "E1": "E2") + ", Puntos E1: " + puntosE1 + " y Puntos E2: " + puntosE2);

    }



        //Funciones que necesito programar
        /*
        salto() --> devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
        canasta(turno) --> devuelve el valor de la canasta realizada (0, 2 o 3) 
        actualizarPuntos(turno, valor)  
        canasta(turno, tipoTiro) ---> dado un turno y el tipo de tiro devuelve true si hay canasta y false si no     
        canasta(porcentaje) ---> indica si hay canasta según el porcentaje 
        tipoTiro(turno) --> devuelve el tipo de tiro que va a realizar el equipo que tiene el turno(tiro2 o tiro3)
        tipoTiro(int porcentaje2) -> devuelve el tipo de tiro que se produce según el porcentaje indicado  (se genera un numero entre 0 y 100 y según el valor de X_JUEGA_DE_2 elegir que tipo de tiro hace)
        rebote(String equipoAtaque) ---> devuelve E1 si el rebote lo gana E1 y E2 si el rebote lo gana E2
        rebote(int reboteAtaque, int reboteDefensa) ---> indica true si el rebote es de ataque y false si el rebote es de defensa
              El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo. El que saque más será el ganador del rebote
        aleatorio(maximo)--> devuelve un numero aleatorio entre 0 y maximo
        aleatorio(minimo, maximo) ---> devuelve un número entre mínimo y máximo
        imprimirResultado(int valor1, int valor2) ---> imprime el resultado actual del partido.
        */
    
        
        /**
         * Devuelve 0,2 o 3 dependiendo si el equipo que ataca consigue canasta o no y según el tipo
         * @param equipoAtaca
         * @return
         */
        static int canasta(String equipoAtaca)
        {
            int resultado = 0;
            boolean acierta = false;

            if(equipoAtaca.equals("E1"))
                acierta = canasta("E1", tipoTiro("E1"));
            else
                acierta = canasta("E2", tipoTiro("E2"));
        
            if(acierta == true)
            {
                if(equipoAtaca.equals("E1"))
                    resultado = tipoTiro("E1");
                else
                    resultado = tipoTiro("E2");
            
            }

            return resultado;
        }


        static boolean canasta(String equipoAtaca, int tipoTiro)
        {
            boolean acierta = false;

            if(equipoAtaca.equals("E1"))
            {
                if(tipoTiro == 2)
                    acierta = canasta(E1_ACIERTO_2);
                else
                    acierta = canasta(E1_ACIERTO_3);
            }
            else
            {
                if(tipoTiro == 2)
                    acierta = canasta(E2_ACIERTO_2);
                else
                    acierta = canasta(E2_ACIERTO_3);    
            }

            return acierta;
        }


        /**
         * Devuelve true si hay canasta y false en caso contrario
         * @param porcentajeAcierto
         * @return
         */
        static boolean canasta(int porcentajeAcierto)
        {
            boolean canasta = false;

            int aleatorio = (int)(Math.random() * 101);

            if(aleatorio > porcentajeAcierto)
                canasta = false;
            else
                canasta = true;
            
            return canasta;
        }


        static int tipoTiro(String equipoAtaca)
        {
            int porcenTiro = 0;

            if(equipoAtaca.equals("E1"))
                porcenTiro = E1_JUEGA_DE_2;
            else
                porcenTiro = E2_JUEGA_DE_2;

            int tiro = tipoTiro(porcenTiro);

            return tiro;
        }


        /**
         * Devuelve 2 si intenta tirar de 2 y 3 si intenta tirar de 3
         * Se genera un numero aleatorio de 0 a 100 y si es mayor al porcentajeTiro2 entonces el tiro es de 3
         * @param porcentajeTiro2
         * @return
         */
        static int tipoTiro(int porcentajeTiro2)
        {
            int tiro = 0;

            int aleatorio = aleatorio(100);

            if(aleatorio > porcentajeTiro2)
                tiro = 3;
            else
                tiro = 2;

            return tiro;
        }


        /**
         * Devuelve el equipo que gana el sato inicial
         * Utiliza la funcion rebote
         * @return
         */
        static String salto()
        {   
            String resultado = "E1";

            int rndmNum = aleatorio(1);

            if(rndmNum == 1)
                resultado = "E2";
            
            return resultado;
        }


        /**
         * Devuelve un mumero entero aleatorio entre 0 y maximo
         * @param maximo
         * @return
         */
        static int aleatorio(int maximo)
        {
            int resultado = (int)(Math.random() * (maximo + 1));

            return resultado; 
        }

        //------------------------------ NO LE ENCUENTRO EL SENTIDO A ESTA FUNCION Y TAMPOCO ME HA HECHO FALTA ----------------------------
        // /**
        //  * Devuelve un numero entero aleatorio entre minimo y maximo
        //  * @param maximo
        //  * @param minimo
        //  * @return
        //  */
        // static int aleatorio(int minimo, int maximo)
        // {
        //     return 
        // }
        //-------------------------------------------------------------------------------------------------------------------------------------

        /**
         * Devuelve el equipo que consigue obtener el rebote de un tiro.
         * @param equipoAtaca
         * @return
         */
        static String rebote(String equipoAtaca)
        {
            String rebotePara = "E1";
            boolean gana = false;

            if(equipoAtaca.equals("E1"))
            {
                gana = rebote(E1_REBOTE_ATA, E2_REBOTE_DEF);
            }
            else
            {
                gana = rebote(E2_REBOTE_ATA, E1_REBOTE_DEF);
            }
            
            if(gana == false)
                rebotePara = "E2";

            return rebotePara;
        }


        /**
         * Devuelve true si el rebote se lo lleva el equipo atacante y false si se lo lleva el equipo defensor
         * El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo. 
         * El que saque más será el ganador del rebote
         * @param porcentajeAtaque
         * @param porcentajeDefensa
         * @return
         */
        static boolean rebote(int porcentajeAtaque, int porcentajeDefensa)//No le encuentro el sentido a que el que defiende sea de 30 al max, entonces el equipo atacante nunca ganará. Lo he hecho de esta manera.
        {
            boolean ganaAtacante = false;

            if(aleatorio(porcentajeAtaque) > aleatorio(porcentajeDefensa))
                ganaAtacante = true;
            
            return ganaAtacante;
        }


        /**
         * Devuelve el equipo contrario al que se le pasa por parametros
         * @param equipo
         * @return
         */
        static String siguienteTurno(String equipo)
        {
            String resultado = "E1";

            if(equipo.equals("E1"))
                resultado = "E2";
            

            return resultado;

        }

        static int actualizarPuntos(int puntosLeva, int puntoActual)
        {
            int total = puntosLeva + puntoActual;

            return total;
        }
}