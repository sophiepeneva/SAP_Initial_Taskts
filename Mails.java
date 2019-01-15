# SAP_Initial_Taskts

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mails {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.MULTILINE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static List<String> getAllEmails(String text){
        List<String> mails = new ArrayList<>();
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(text);
        while(matcher.find()){
            mails.add(matcher.group());
        }
        return mails;
    }

    public static void main(String[] args) {
        String file = FileRead.readFile("src/mails.txt");
        List<String> mails = getAllEmails(file);
        for(String s : mails){
            System.out.println(s);
        }
    }


}
