package Tamrine_Manzel_2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);

        System.out.println("username:");
        String Name= scanner.nextLine();
        System.out.println("password:");
        String Password=scanner.nextLine();
        System.out.println("email:");
        String Email=scanner.nextLine();

        Generic test=new Generic();

        test.x=Name;
        test.y=Password;
        test.z=Email;

        test.SHOW();

        System.out.println("__________________");


        Generic test2=null;
        Generic test3=null;

        try{
            test2=(Generic)test.clone();
            test3=(Generic)test clone();

        }catch (CloneNotSupportedException e){
            System.out.println("not supported");
        }
        System.out.println(test2+"""This is a clone from object((test))""";
        System.out.println("___________________");
        System.out.println(test3+""" This is a clone from object ((test))""";
    }
}
