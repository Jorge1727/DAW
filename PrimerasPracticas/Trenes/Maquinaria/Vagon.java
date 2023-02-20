package Trenes.Maquinaria;

//ESTE SOLO SE VE POR LAS CLASES VECINAS POR LO CUAL NO ES PUBLIC
class Vagon 
{
    //Atributos
    private static int id = 1;

    private int num_id;
    private int cargaMaxima;
    private int cargaActual;
    private String tipoMercancia;

    //Consstructor
    public Vagon(int cargaMaxima, int cargaActual, String tipoMercancia) 
    {
        this.num_id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;

        id++;
    }

    //Metodos
    
    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    @Override
    public String toString() 
    {
        return " ▓ V" + num_id + " - " + cargaActual + "kgs de " + cargaMaxima  + "de " + tipoMercancia +" ▓" ;
    }

    
}
