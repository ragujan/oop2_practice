package model_paper;

public class Q9 {
    public static void main(String[] args) {

    }
}
class A{
    static int x;
    A(){
        System.out.println("Constructor");
    }
    static{
        x = 7;
    }
    {
        x = 8;
    }

    public static void main(String[] args) {
        System.out.println(x);
        A a = new A();
        System.out.println(x);
    }
}