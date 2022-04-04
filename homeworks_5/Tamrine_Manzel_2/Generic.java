package Tamrine_Manzel_2;

public class Generic <Name,Password,Email>implements Cloneable{

    public Name x;
    public Password y;
    public Email z;

    public void Show(){

        System.out.format("""
    Name=%s
    Password=%s
    Email=%S
    """,x,y,z);


    }

    @Override
    protected Object clone ()throws CloneNotSupportedException{
        return super.clone();
    }
}
