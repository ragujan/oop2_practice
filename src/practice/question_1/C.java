package practice.question_1;

public class C {
    static  int x;
    public C(){
        System.out.println("Constructor");
    }
    static {

        x=7;
    }
    {
        x=8;
    }
    public static void main(String[] args) {
        System.out.println(x);
        C b = new C(){
           static {
               x = 900;
           }
        };
        System.out.println(x);
    }

}
