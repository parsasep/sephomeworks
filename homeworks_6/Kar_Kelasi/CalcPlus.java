package Kar_Kelasi;
import java.util.*;
public class CalcPlus extends Calculate{

    double num1;
    double num2;

    @Override
    public void clac(double num1, double num2) {

        Print_Re(num1, num2);

    }

    public void Print_Re(double num1, double num2) {

        System.out.format("your equation result is ==> %f", num1 + num2);
    }
}
