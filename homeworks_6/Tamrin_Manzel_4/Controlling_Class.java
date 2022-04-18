package Tamrin_Manzel_4;
import java.util.Locale;
import javax.management.StringValueExp;
public class Controlling_Class {

    private String username;
    private String code;
    private String password;
    private String age;
    private boolean key;

    public Controlling_Class(String username, String code, String password, String age) {
        this.username = username;
        this.code = code;
        this.password = password;
        this.age = age;
    }

    private static Controlling_Class controlling_class;

    public synchronized static Controlling_Class getInstance() {

        if (controlling_class == null) {

            controlling_class = new Controlling_Class();
        }

        return controlling_class;
    }

    Controlling_Class() {}

    public String getUsername() {
        return username;
    }

    public Controlling_Class setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Controlling_Class setCode(String code) {
        this.code = code;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Controlling_Class setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Controlling_Class setAge(String age) {
        this.age = age;
        return this;
    }

    public void Control(String username, String code, String password, String age) {

        String[] sign = {"+", "-", "/", "*", "@", "#", "$", "%", "&", "|"};
        String[] character = {"a", "b", "s", "d", "e", "f", "g", "h", "i", "g", "k", "l", "m", "n", "o", "p", "q", "i", "s", "t", "u", "v"};

        for (int i = 0; i <= 9; i++) {

            if (username.contains(String.valueOf(i))) {
                key = false;
                break;
            } else if (username.contains(sign[i])) {
                key = false;
                break;
            } else {
                key = true;
            }
        }
        if (password.contains(" ")) {
            key = false;
        } else if (password.length() > 8) {
            key = false;
        }

        if ((Integer.valueOf(age) == 0) || (Integer.valueOf(age) < 0)) {

            key = false;
        }

        for (int j = 0; j < 22; j++){
            for (int k = 0; k < 10 ; k++)
                if (code.contains(character[j]) && code.contains(character[j].toUpperCase(Locale.ROOT))) {
                    key = false;
                    break;
                } else if (code.contains(sign[k])){

                    key = false;
                    break;
                }   else {

                    boolean key = true;
                }
        }

        if (key == true) {

            String[] ID = {username, password, age , code};

            System.out.format("""
                    ((VALID DATA))
                    =============
                    username = %s
                    password = %s
                    age = %s
                    code = %s
                    """, username, password, age, code);
        }else {

            System.out.println("you have entered invalid data!!!");
        }


    }
}
