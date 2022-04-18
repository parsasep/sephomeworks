package Tamrin_Manzel_4;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your username:");
        String username = scanner.next();

        System.out.print("enter your code:");
        String Code = scanner.next();

        System.out.print("enter your password:");
        String Password = scanner.next();

        System.out.print("enter your age:");
        String age = scanner.next();

        Controlling_Class.getInstance().Control(username, Code, Password, age);


        // write your code here
    }
}
