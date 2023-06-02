package clases;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Area 
{
    //A
    @JsonProperty("postal-code")
    private String postal_code;
    @JsonProperty("street-address")
    private String street_address;

    //C
    public Area() {
    }

    //M
    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    @Override
    public String toString() {
        return "Area [postal_code=" + postal_code + ", street_address=" + street_address + "]";
    }

    

    
}
