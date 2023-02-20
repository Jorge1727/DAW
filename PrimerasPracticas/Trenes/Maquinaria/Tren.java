package Trenes.Maquinaria;

import java.util.Arrays;

import Trenes.Personal.Maquinista;

public class Tren 
{
    //Atributos
    Locomotora locomotora;
    Vagon[] convoy;
    Maquinista maquinista;


    //Contsructor
    public Tren(Locomotora locomotora, Maquinista maquinistaResponsable) 
    {
        this.locomotora = locomotora;
        this.maquinista = maquinistaResponsable;
        this.convoy = new Vagon[0];
    }


    //Metodos
    public void enganchaVagon(int cargaMax, int cargaActual, String tipoMercancia)
    {
        if(this.convoy.length >= 5)
            System.out.println("No se puede enganchar. El tren ya tiene asignado 5 vagones");
        else
        {
            if(cargaMax >= cargaActual)
            {
                Vagon vagonEngancha =  new Vagon(cargaMax, cargaActual, tipoMercancia);

                insertaVagon(vagonEngancha);
            }   
        }
    }

    public void insertaVagon(Vagon vagonEngancha)
    {
        Vagon[] convoyFinal = new Vagon[this.convoy.length + 1];

        for (int i = 0; i < this.convoy.length; i++) 
        {
            convoyFinal[i] = this.convoy[i];
        }

        convoyFinal[convoyFinal.length-1] = vagonEngancha;

        this.convoy = convoyFinal;
    }

    public int cargaTotal()
    {
        int cargaTotal = 0;
        
        for (int i = 0; i < convoy.length; i++) 
        {   
            cargaTotal += convoy[i].getCargaActual();
        }

        return cargaTotal;
    }



    public Locomotora getLocomotora() {
        return locomotora;
    }


    public Vagon[] getConvoy() {
        return convoy;
    }


    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    
    @Override
    public String toString() 
    {
        return  locomotora + Arrays.toString(convoy) + " = " + cargaTotal()+ "kgs de carga total - " + maquinista ;
    }

    
}
