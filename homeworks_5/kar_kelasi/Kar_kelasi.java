package kar_kelasi;

import java.swing.*;

public class Kar_kelasi {
    private String Job;
    private String Username;
    private String Pass;
    private String Age;
    private String Family;
    private String Name;

    public Kar_kelasi(String job,String username,String pass,String age,String family,String name) {
    Job=job;
    Username=username;
    Pass=pass;
    Age=age;
    Family=family;
    Name=name;
    }

    public String getJob(){return "Job:"+Job;}
    public void setJob(String job){Job=job;}
    public String getUsername(){return"Username:"+Username;}
    public void setUsername(String username){Username=username;}
    public String getPass(){return"Pass:"+Pass;}
    public void setPass(String pass){Pass=pass;}
    public String getAge(){return"Age:"+Age;}
    public void setAge(String age){Age=age;}
    public String getFamily(){return"Family:"+Family;}
    public void setFamily(String family){Family=family;}
    public String getName(){return"Name:"+Name;}
    public void setName(String name){Name=name;}
    public void print_info(){
        System.out.println(Job);
        System.out.println(Name);
        System.out.println(Family);
        System.out.println(Pass);
        System.out.println(Age);
        System.out.println(Username);

    }

}
