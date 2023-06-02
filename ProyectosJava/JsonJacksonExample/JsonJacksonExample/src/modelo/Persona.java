package modelo;

public class Persona 
{
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private String number;

    public Persona()
    {

    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Persona [firstName=" + firstName + ", age=" + age + "]";
    }

    
        
}
