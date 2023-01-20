package model_paper;

public class Q14 {

}
class E1 extends Exception{

}
class E2 extends E1{

}
class A2{
    void m() throws Exception{
        System.out.println("OK-A");
    }

}
class B2 extends A2{
    protected void m()throws Exception{
        System.out.println("OK-B");
    }

    public static void main(String[] args)throws Exception {
        A2 a1 = new A2();
        a1.m();

    }
}
