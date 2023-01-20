package practice.question_11;

public class A {
    public static void main(String[] args) {
        Integer x = 525;
        Integer y = x;

        System.out.println(y==x);
        y++;
        System.out.println(x+" "+y);
        System.out.println(y==x);

    }
}
