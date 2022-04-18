package Tamrin_Manzel_1;

public class Get_Info {

    private String Name;
    private String Password;
    private int Age;
    private String Number;
    private String Degree;
    private String Address;

    public Get_Info(String name, String password, int age, String number, String degree, String address) {
        Name = name;
        Password = password;
        Age = age;
        Number = number;
        Degree = degree;
        Address = address;
    }

    public Get_Info() {}

    public String getName() {
        return Name;
    }

    public Get_Info setName(String name) {

        this.Name = name;
        return this;

    }

    public String getPassword() {
        return Password;
    }

    public Get_Info setPassword(String password) {

        this.Password = password;
        return this;

    }

    public int getAge() {
        return Age;
    }

    public Get_Info setAge(int age) {

        this.Age = age;
        return this;
    }

    public String getNumber() {
        return Number;
    }

    public Get_Info setNumber(String number) {

        this.Number = number;
        return this;

    }

    public String getDegree() {
        return Degree;
    }

    public Get_Info setDegree(String degree) {

        this.Degree = degree;
        return this;

    }

    public String getAddress() {
        return Address;
    }

    public Get_Info setAddress(String address) {
        Address = address;
        return this;
    }
}
