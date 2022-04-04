package Tamrine_Manzel_1;

import java.util.*;

public class Student_Map {

    private String Name;
    private String Code;
    private String Score;

    public Student_Map(String name,String code,String score){
        Name=name;
        Code=code;
        Score=score;
    }
    public String getName(){return Name;}
    public void setName(String name){Name=name;}
    public String getCode(){return Code;}
    public void setCode(String code){Code=code;}
    public String getScore(){return Score;}
    public void setScore(String score){Score=score;}
    public void Get_info(){
        Map map=new HashMap<>();

        map.put("Name",Name);
        map.put("Code",Code);
        map.put("Score",Score);

        System.out.println("the whole map");
        System.out.println(map);

        Set set_key=map.keySet();
        System.out.println("key sets");
        for(Object o :set_key)
            System.out.println(o);

        Set set_value=Collections.singleton(map.values());
        System.out.println("just values");
        for(Object o:set_value)
            System.out.println(o);

    }
}
