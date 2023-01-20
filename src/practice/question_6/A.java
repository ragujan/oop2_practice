package practice.question_6;

public class A {
    void m() throws A1{
        System.out.println("OK-A");
    }
}
class B extends A{
    protected void m() throws A1{
        System.out.println("OK-B");
    }

    public static void main(String[] args) {
        A lol = new  B();
        try{
           lol.m();
        }catch (A1 a){
           a.printStackTrace();
        }
    }
}
class A1 extends  Exception{

}
class A2 extends A1{

}