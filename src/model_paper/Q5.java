package model_paper;

import org.w3c.dom.ls.LSOutput;

public class Q5 {

    public static void main(String[] args) {
        String s1 = "ABC";
        String s = "ABC" + "ABC";
        String s2 = "ABCABC";
        String s3 = s1 + "ABC";

        System.out.println((s==s2)+",");
        System.out.println(s==s3);

        //string  equals,operator equals
        String r = "ABC";
        String r2 = "ABC";
        System.out.println(r==r2);
        System.out.println(r.equals(r2));

        //string buffer equals ,operator equals
        StringBuffer sb1 = new StringBuffer("ABC");
        StringBuffer sb2 = new StringBuffer("ABC");
        System.out.println(sb2==sb1);
        System.out.println(sb2.equals(sb1));

    }
}
