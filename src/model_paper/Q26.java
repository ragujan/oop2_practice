package model_paper;

public class Q26 {
    public static void main(String[] args) {
        A5 a5 = new A5();

    }
}
class A4{
   A4(){
       System.out.println("Constructor A");
   }
   static {
       System.out.println("A1");
   }
    {
        System.out.println("A2");
    }
}
class A5 extends A4{
    static{
        System.out.println("B1");
    }
    {
        System.out.println("B2");
    }

}
