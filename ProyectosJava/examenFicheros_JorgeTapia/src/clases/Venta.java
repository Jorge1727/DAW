package clases;

import java.util.ArrayList;

public class Venta 
{
    //A
    private int codigoCliente;
    private String fecha;
    private ArrayList<Linea> lineas;

    //C
    public Venta() {
    }

    //M
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "Venta [codigoCliente=" + codigoCliente + ", fecha=" + fecha + ", lineas=" + lineas + "]";
    }

    

    
}
