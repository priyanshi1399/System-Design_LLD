import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    transient private String email;
    private int age;
    private String address;
    private String gender;


    public Student() {
    }


    public Student(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayName(){
        System.out.println("Hello My name is " +this.getName());
    }


}
