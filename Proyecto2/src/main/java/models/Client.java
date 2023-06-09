
package models;
import java.util.Date;


public class Client extends Person{
    private Date DateofBirth;
    private String direccion;
    public Client(){
    super();
    }
    public Client(Date DateofBirth, String direccion, String Id, String Name, String lastName, String direction, String email, String phone) {
        super(Id, Name, lastName, direction, email, phone);
        this.DateofBirth = DateofBirth;
        this.direccion = direccion;
    }

    public Date getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(Date DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    }
    
    
    

