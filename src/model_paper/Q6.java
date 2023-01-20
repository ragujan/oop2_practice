package model_paper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6 {
    public static void main(String[] args) {
        String txt = "Gayan : 0771234567";
        String r = "[0-9]{10}";
        Pattern p = Pattern.compile(r);

        System.out.println(p.matcher(txt).find());
    }
}
