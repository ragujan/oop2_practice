package model_paper;

import java.util.StringTokenizer;

public class Q31 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Apple,HTC,Samsung,Nokia",",");

//        System.out.println("Next token is :"+st.nextToken(","));
        System.out.println(st.nextToken());
        System.out.println(st.countTokens());
        System.out.println(st.nextToken());
        System.out.println(st.nextElement());

    }
}
