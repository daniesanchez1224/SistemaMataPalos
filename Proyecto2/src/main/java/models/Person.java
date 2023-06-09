
package models;


public class Person {
    private String Id;
    private String Name;
    private String lastName;
    private String direction;
    private String email;
    private String phone;
    public Person (){}
    public Person(String Id, String Name, String lastName, String direction, String email, String phone) {
        this.Id = Id;
        this.Name = Name;
        this.lastName = lastName;
        this.direction = direction;
        this.email = email;
        this.phone = phone;
        
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
