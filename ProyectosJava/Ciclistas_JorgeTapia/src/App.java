import java.io.BufferedWriter;
import java.io.FileWriter;

import Utiles.Utils;
import clases.Carrera;
import clases.Corredor;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Carrera carrera = new Carrera(Utils.leerCiclistas(), "Vuelta a Malaga");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/recursos/VueltaMalaga.txt")))
        {
            bw.write("\n******* Nombre de la carrera:\n");
            bw.newLine();
            bw.write(carrera.toString());
            bw.newLine();

            bw.write("\n******* Ciclistas participantes:\n");
            bw.newLine();
            bw.write(carrera.getCorredores().toString());
            bw.newLine();

            carrera.insertarTiempoEtapa(Utils.leetEtapas("1"));
            carrera.insertarTiempoEtapa(Utils.leetEtapas("2"));
            carrera.insertarTiempoEtapa(Utils.leetEtapas("3"));

            carrera.ordenarCorredoresPorTiempo();

            bw.write("\n******* Clasificacion final:\n");
            bw.newLine();
            bw.write(carrera.getCorredores().toString());
            bw.newLine();

            bw.write("\n******* PODIUM:\n");
            bw.newLine();
            bw.write(carrera.podium());
            bw.newLine();

            bw.write("\n******* Posicion del corredor Wilco Kelderman(BOHA) Dorsal: 22 :\n");
            bw.newLine();

            Corredor wilco = carrera.buscaCorredorPorDorsal(22);

            //Pasar de int a String
            bw.write(carrera.posicionCorredor(wilco) + "");
            bw.newLine();
            
            


        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
