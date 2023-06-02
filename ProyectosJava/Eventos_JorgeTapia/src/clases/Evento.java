package clases;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evento 
{
    //A
    private int id; 
    private String title;
    private int free;
    private Area area;

    //C
    public Evento() {
    }

    //M
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    
    @Override
    public String toString() {
        return "Evento [id=" + id + ", title=" + title + ", free=" + free + ", area=" + area + "]";
    }

    
    
    
}
