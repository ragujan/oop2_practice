package model_paper;

public class Q2 {
    public static void main(String[] args) {
        Feedback s = Feedback.GOOD;
    }
}
enum Feedback{
    GOOD,BAD;

    Feedback(){
        System.out.println(1);
    }
}
