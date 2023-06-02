package Utiles;

import java.util.Comparator;

import clases.Corredor;

public class OrdenaPorTiempo implements Comparator<Corredor>{

    @Override
    public int compare(Corredor arg0, Corredor arg1) {
        return arg0.getTiempo()-arg1.getTiempo();
    }
    
}