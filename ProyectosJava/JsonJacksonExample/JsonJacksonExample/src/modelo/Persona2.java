package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Persona2 
{
    @JsonProperty("firstname")
    private String nombre;
    
    @JsonProperty("lastname")
    private String apellido;
    
    @JsonProperty("gender")
    private String genero;

    @JsonProperty("age")
    private Integer edad;

    @JsonProperty("number")
    private String numero;

    public Persona2() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Persona2 [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", edad=" + edad
                + ", numero=" + numero + "]";
    }
    
}
