package medicobackend;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    final public static int DEFAULT_MIN = 7,DEFAULT_MAX = 30;
    final private static Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]{3,50}$");
    final private static Pattern PHONE_PATTERN = Pattern.compile("\\d{10}");
    final private static Pattern EMAIL_PATTERN = Pattern.compile("\\w+\\.*@\\w+.\\w+");
    final private int minPassLen, maxPassLen;
    
    public Validator(int minPassLen, int maxPassLen) {
        this.minPassLen = minPassLen;
        this.maxPassLen = maxPassLen;
    }
    
    public boolean validateName(String name) {
        Matcher m = NAME_PATTERN.matcher(name);
        return m.matches();
    }
    
    public boolean validatePhone(String phone) {
        Matcher m = PHONE_PATTERN.matcher(phone);
        return m.matches();
    }
    
    public boolean validateEmail(String email) {
        Matcher m = EMAIL_PATTERN.matcher(email);
        return m.matches();
    }
    
    public boolean validatePasswd(String passwd) {
        return passwd.length() >= minPassLen && passwd.length() <= maxPassLen;
    }
    
    public boolean validateUsername(String username) {
        char illegalChar[] = {'.','/','\\','<','>','?','!','^','&','*'};
        for(int i = 0; i < illegalChar.length; i++) {
            if(username.indexOf(illegalChar[i]) != -1) return false;
        }
        return true;
    }
    
    //TODO : LIC VALIDATOR
    
}
