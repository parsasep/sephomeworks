package Tamrin_Manzel_1;
  import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                BY ORDER PLEASE ENTER YOUR:
                NAME
                AGE
                NUMBER
                DEGREE
                PASSWORD
                ADDRESS
                """);

        String NAME = scanner.next();
        int age = scanner.nextInt();
        String NUmber = scanner.next();
        String Degree = scanner.next();
        String Password = scanner.next();
        String Address = scanner.next();

        var OBJ = new Get_Info().setName(NAME).setAge(age).setNumber(NUmber).setDegree(Degree).setPassword(Password).setAddress(Address);

        System.out.format("""
                Name = %s
                Age = %d
                Password = %s
                Number = %s
                Degree = %s
                Address = %s
                """, OBJ.getName(), OBJ.getAge(), OBJ.getPassword(), OBJ.getNumber(), OBJ.getDegree(), OBJ.getAddress());
	// write your code here
    }
}
