package kar_kelasi;

public class Main {

    public static void main(String[] args) {

        var Test_OB=new Kar_kelasi("CE","Parsep","12345","19","Sepahzad","Parsa");


        System.out.println(Test_OB.getName());
        System.out.println(Test_OB.getFamily());
        System.out.println(Test_OB.getAge());
        System.out.println(Test_OB.getUsername());
        System.out.println(Test_OB.getPass());
        System.out.println(Test_OB.getJob());


        System.out.println("__________________________________");

        Test_OB.print_info();
	// write your code here
    }
}
