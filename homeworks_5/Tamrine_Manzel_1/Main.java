package Tamrine_Manzel_1;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("full name:");
        String Name=scanner.nextLine();

        System.out.print("student code:");
        String code=scanner.nextLine();

        System.out.print("score:");
        String score=scanner.nextLine();
        Student_Map Test=new Student_Map(Name, code, score);

        Test.Get_info();// write your code here
    }
}
