package User;

public class User 
{
    //All final attributes
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional
 
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
  
    }
 
    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
    	this.age = age;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String p){
    	this.phone = p;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String a){
    	this.address = a;
    }
 
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
 
}
