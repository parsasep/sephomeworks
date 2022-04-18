package Kar_Kelasi;
  import java.util.*;
public class Main {

    public static void main(String[] args) {

        public static void main(String[] args) {

            String[] KEY = new String[3];

            System.out.println("please insert your desired sequence:");

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {

                KEY[i] = scanner.next();

            }

            if (KEY[1].equals("+")) {

                var OBJ = new CalcPlus();
                double num1 = Double.parseDouble(KEY[0]);
                double num2 = Double.parseDouble(KEY[2]);

                OBJ.clac(num1, num2);

            } else if (KEY[1].equals("-")) {

                var OBJ = new CalcMinus();

                double num1 = Double.parseDouble(KEY[0]);
                double num2 = Double.parseDouble(KEY[2]);

                OBJ.clac(num1, num2);

            }


        }
	// write your code here

}
