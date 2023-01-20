package practice.question_1;

public class B {
    static int x;

    public B() {
        System.out.println("Constructor");
    }

    static {

        x = 7;
    }

    {
        x = 8;
    }

    public static void main(String[] args) {
        System.out.println(x);
        B b = new B();
        System.out.println(x);
    }

}
