package Key;

import java.util.Random;

public class Password {
    static char[] password_is(int len){
        String Capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String number="0123456789";
        String special ="!@#$%^&*_=+-/.?<>)";
        String values=Capital+small+number+special;
        Random random = new Random();
        char[] password = new char[len];
        for(int i=0;i<len;i++){
            password[i]=values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
    public static void main(String[] args) {
        System.out.println(password_is(10));
    }
}
