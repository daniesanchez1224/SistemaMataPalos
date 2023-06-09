
package models;
import java.util.Date;


public class Guide extends Person {
    private String carnetNum;
    private Date dateOfBirth;
    
    public Guide(){
     super();
    }
    public Guide(String carnetNum, Date dateOfBirth, String Id, String Name, String lastName, String direction, String email, String phone) {
        super(Id, Name, lastName, direction, email, phone);
        this.carnetNum = carnetNum;
        this.dateOfBirth = dateOfBirth;
    }

   

    public String getCarnetNum() {
        return carnetNum;
    }

    public void setCarnetNum(String carnetNum) {
        this.carnetNum = carnetNum;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
}
