package Tamrin_Manzel_2;
import java.util.*;
public class People {

    private String User_Name;
    private String Password;
    private String Email;

    public People(String user_Name, String password, String email) {
        User_Name = user_Name;
        Password = password;
        Email = email;
    }

    private static People people;

    public  synchronized static   People getInstance() {

        if (people == null) {

            people = new People();

        }

        return people;
    }

    public People() {}

    public void Get_Info() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please insert your desired user_name:");

        User_Name = scanner.next();

        System.out.println("please insert your Password:");

        Password = scanner.next();

        System.out.println("please insert your Email:");

        Email = scanner.next();
    }

    public void Show_Info() {

        System.out.format("""
                Name = %s
                Password = %s
                Email = %s
                """, User_Name, Password, Email);
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
