//take field user in User pojo class == Name,firstname,lastname,phone number,email,password,age,pincode.
// provide REGEX for all fields and save inside a json file 
//Now Create a login pojo class for email and password, also  make sure to provide abstraction and use proper oops concepts.

public class User {
    private String name;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private int age;
    private String pincode;

    public User(String name, String firstName, String lastName, String phoneNumber, String email, String password, int age, String pincode) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.age = age;
        this.pincode = pincode;
    }

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }
}
