package practice.test_check;

public class A extends B{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.c);
    }
}
class B extends C{
   public void sout(){
       System.out.println(this.c);
   }
}
class C{
   int c =900;
}
